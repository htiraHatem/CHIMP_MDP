(HybridHTNDomain RACEDomain)

(MaxArgs 5)

(PredicateSymbols On robotAt holding hasArmPosture hasTorsoPosture
  connected Type crossLinked !changeTable navigate
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



###


# move from table to other
(:operator
 (Head !changeTable(?wp1 ?wp2))
 (Pre p0 crossLinked(?wp1 ?wp2))
 (Pre p1 robotAt(?wp1))
 (Del p1)
 (Add e1 robotAt(?wp2))
)

# ?robot navigates between two tables
(:method 10
 (Head navigate(?wp1 ?wp2))
 (Pre p0 crossLinked(?wp1 ?wp2))
 (Sub s1 !changeTable(?wp1 ?wp2))
)

(:method 0
 (Head navigate(?wp1 ?wp2))
 (Pre p0 crossLinked(?wp1 ?wp3))
 (VarDifferent ?wp2 ?wp3)
 (Sub s1 !changeTable(?wp1 ?wp3))
 (Sub s2 navigate(?wp3 ?wp2))
)

### DRIVE_ROBOT

(:method    # already there
 (Head drive_robot(?toArea))
  (Pre p1 robotAt(?toArea))
  (Constraint During(task,p1))
  (Constraint Duration[10,INF](task))
)


(:method    # not at manipulationarea wrong..
 (Head drive_robot(?TopreArea))
 (Pre p1 robotAt(manipulationAreaEastCounter1))
# (VarDifferent ?toArea ?fromArea)
 #(NotType ?fromArea ManipulationArea)


 (Sub s0 !move_base(preManipulationAreaEastCounter1))
 (Sub s1 navigate(?fromArea ?TopreArea))
 
 (Ordering s0 s1)
 (Constraint Starts(s0,task))
 (Constraint Finishes(s1,task))

)




