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

 (Sub s3 !move_base(?toArea))

)


(:method    # at manipulationarea
 (Head drive_robot(?toArea))
 (Pre p1 robotAt(?fromArea))
 (VarDifferent ?toArea ?fromArea)
 (Type ?fromArea ManipulationArea)
 (Pre p2 connected(?plArea ?fromArea ?preArea))
 (Sub s0 !move_base_blind(?preArea))
 (Constraint Starts(s0,task))
 (Sub s3 !move_base(?toArea))
 (Constraint Finishes(s3,task))

)



