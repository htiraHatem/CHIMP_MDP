(HybridHTNDomain RACEDomain)

(MaxArgs 5)

(PredicateSymbols On robotAt holding hasArmPosture hasTorsoPosture
  connected Type
  !move_base !move_base_blind !place_object !pick_up_object
  !move_arm_to_side !move_arms_to_carryposture !tuck_arms !move_torso
  !observe_objects_on_area !moveto
  adapt_torso torso_assume_driving_pose adapt_arms arms_assume_driving_pose
  drive_robot move_both_arms_to_side assume_manipulation_pose
  leave_manipulation_pose grasp_object get_object put_object
  move_object serve_coffee_to_guest arm_to_side
  serve_coffee_to_guest_test assume_manipulation_pose_wrapper
  not_test
  Future
  Eternity)





################################
####  OPERATORS ################


# MOVE_BASE


(:operator
 (Head !move_base(?ToArea))
 (Pre p1 robotAt(?FromArea))
 (Del p1)
 (Add e1 robotAt(?ToArea))
)


# MOVE_BASE_BLIND   PreArea to ManArea
(:operator
 (Head !move_base_blind(?mArea))
 (Pre p1 robotAt(?preArea))
 (Del p1)
 (Pre p2 connected(?plArea ?mArea ?preArea))
 (Constraint Duration[4000,INF](task))
 (Add e1 robotAt(?mArea))
 (Constraint Meets(task,e1))
 (Constraint Meets(p1,task))
 (ResourceUsage 
    (Usage navigationCapacity 1))
)

# MOVE_BASE_BLIND   ManArea to PreArea
(:operator
 (Head !move_base_blind(?preArea))
 (Pre p1 robotAt(?mArea))       # TODO use type restriction
 (Pre p2 connected(?plArea ?mArea ?preArea))
 (Constraint Duration[4000,INF](task))
 (Add e1 robotAt(?preArea))
 (Constraint Meets(task,e1))
 (Constraint Meets(p1,task))
 (Del p1)
 (ResourceUsage 
    (Usage navigationCapacity 1))
)

# TUCK_ARMS
(:operator
 (Head !tuck_arms(?leftGoal ?rightGoal))
 (Pre p1 hasArmPosture(?leftArm ?oldLeft))
 (Pre p2 hasArmPosture(?rightArm ?oldRight))
 (Del p1)
 (Del p2)
 (Add e1 hasArmPosture(?leftArm ?leftGoal))
 (Add e2 hasArmPosture(?rightArm ?rightGoal))
 (Values ?leftArm leftArm1)
 (Values ?rightArm rightArm1)
 (Values ?leftGoal ArmTuckedPosture ArmUnTuckedPosture)
 (Values ?rightGoal ArmTuckedPosture ArmUnTuckedPosture)
 (ResourceUsage 
    (Usage armManCapacity 1))
 (Constraint Duration[4000,INF](task))
)


# MOVE_ARMS_TO_CARRYPOSTURE
(:operator
 (Head !move_arms_to_carryposture())
 (Pre p1 hasArmPosture(?leftArm ?oldLeft))
 (Pre p2 hasArmPosture(?rightArm ?oldRight))
 (Pre p3 hasTorsoPosture(?torsoPosture))
 (Del p1)
 (Del p2)
 (Add e1 hasArmPosture(?leftArm ?newPosture))
 (Add e2 hasArmPosture(?rightArm ?newPosture))
 (Values ?leftArm leftArm1)
 (Values ?rightArm rightArm1)
 (Values ?newPosture ArmCarryPosture)
 (Values ?torsoPosture TorsoUpPosture TorsoMiddlePosture)
 (ResourceUsage 
    (Usage armManCapacity 1))    
 (Constraint Duration[4000,INF](task))
 (Constraint OverlappedBy(task,p1))
 (Constraint OverlappedBy(task,p2))
 (Constraint Overlaps(task,e1))
 (Constraint Overlaps(task,e2))
 )


# MOVE_TORSO
(:operator
 (Head !move_torso(?newPosture))
 (Pre p1 hasTorsoPosture(?oldPosture))
 (Constraint OverlappedBy(task,p1))
 (Del p1)
 (Add e1 hasTorsoPosture(?newPosture))
 (Constraint Duration[4000,INF](task))
)


(:method   # holding nothing
 (Head torso_assume_driving_pose())
  (Pre p1 holding(?leftArm ?nothing))
  (Pre p2 holding(?rightArm ?nothing))
  (Values ?nothing nothing)
  (Values ?leftArm leftArm1)
  (Values ?rightArm rightArm1)
  (Sub s1 adapt_torso(?newPose))
  (Values ?newPose TorsoDownPosture)
  (Constraint Equals(s1,task))
)

(:method # holding something
 (Head torso_assume_driving_pose())
  (Pre p1 holding(?arm ?obj))
  (NotValues ?obj nothing)
  (Sub s1 adapt_torso(?newPose))
  (Values ?newPose TorsoMiddlePosture)
  (Constraint Equals(s1,task))
)

###

#################################

(:method
 (Head adapt_torso(?newPose))
 (Pre p1 hasTorsoPosture(?oldPose))
 (VarDifferent ?newPose ?oldPose) 
 (Sub s1 !move_torso(?newPose))
 (Constraint Equals(s1,task))
 )

(:method
 (Head adapt_torso(?posture))
 (Pre p1 hasTorsoPosture(?posture))
 (Constraint Duration[10,INF](task))
 (Constraint During(task,p1))
 )

###
### DRIVE_ROBOT

(:method    # already there
 (Head drive_robot(?toArea))
  (Pre p1 robotAt(?toArea))
  (Constraint During(task,p1))
  (Constraint Duration[10,INF](task))
)


(:method    # not at manipulationarea
 (Head drive_robot(?toArea))
 (Pre p1 robotAt(?fromArea))
 (VarDifferent ?toArea ?fromArea)
 (NotType ?fromArea ManipulationArea)
 (Sub s1 torso_assume_driving_pose())
 (Constraint Starts(s1,task))
 (Sub s2 arms_assume_driving_pose())
 (Sub s3 !move_base(?toArea))
 (Ordering s1 s2)
 (Ordering s2 s3)
 (Constraint Before(s1,s3))
 (Constraint Before(s2,s3))
)


###

(:method  # Arms already there. Nothing to do.
 (Head adapt_arms(?posture))
 (Pre p1 hasArmPosture(?leftArm ?posture))
 (Pre p2 hasArmPosture(?rightArm ?posture))
 (Values ?leftArm leftArm1)
 (Values ?rightArm rightArm1)
 (Constraint Duration[3,INF](task))
 (Constraint During(task,p1))
 (Constraint During(task,p2))
 )

(:method  # tuck arms
 (Head adapt_arms(?posture))
 (Pre p1 hasArmPosture(?arm ?currentposture))
 (Values ?posture ArmTuckedPosture)
 (NotValues ?currentposture ArmTuckedPosture)
 (Sub s1 !tuck_arms(?posture ?posture))
 (Constraint Equals(s1,task))
)

(:method  # to carryposture
 (Head adapt_arms(?posture))
 (Pre p1 hasArmPosture(?arm ?currentposture))
 (Values ?posture ArmCarryPosture)
 (NotValues ?currentposture ArmCarryPosture)
 (Sub s1 !move_arms_to_carryposture())
 (Constraint Equals(s1,task))
 )

(:method    # holding nothing
 (Head arms_assume_driving_pose())
  (Pre p1 holding(?leftArm ?nothing))
  (Pre p2 holding(?rightArm ?nothing))
  (Values ?nothing nothing)
  (Values ?leftArm leftArm1)
  (Values ?rightArm rightArm1)
  (Sub s1 adapt_arms(?newPose)) 
  (Values ?newPose ArmTuckedPosture)
  (Constraint Equals(s1,task))
)

(:method    # holding something
 (Head arms_assume_driving_pose())
  (Pre p1 holding(?arm ?obj))
  (NotValues ?obj nothing)
  (Sub s1 adapt_arms(?newPose))
  (Values ?newPose ArmCarryPosture)
  (Constraint Equals(s1,task))
)


(:method    # at manipulationarea
 (Head drive_robot(?toArea))
 (Pre p1 robotAt(?fromArea))
 (VarDifferent ?toArea ?fromArea)
 (Type ?fromArea ManipulationArea)
 (Pre p2 connected(?plArea ?fromArea ?preArea))
 (Sub s0 !move_base_blind(?preArea))
 (Constraint Starts(s0,task))
 (Sub s1 torso_assume_driving_pose())
 (Sub s2 arms_assume_driving_pose())
 (Sub s3 !move_base(?toArea))
 (Constraint Finishes(s3,task))
 (Ordering s0 s1)
 (Ordering s1 s2)
 (Ordering s2 s3)
 (Constraint Before(s0,s1))
 (Constraint Before(s0,s2))
 (Constraint Before(s1,s3))
 (Constraint Before(s2,s3))
)



