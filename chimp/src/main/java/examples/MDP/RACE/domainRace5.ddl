(HybridHTNDomain safe_navigation)

(MaxArgs 3)

(PredicateSymbols
  holding robotAt get_object !moveTo obtainObject drive_robot moveTo crossLinked !grasp_object
  on connected !move_base_blind isCollision)

####################
#######RESOURCES##############
(Resource BatteryStorageCapacity 100)


################################
####  OPERATORS ################

# getObject default
(:operator 
  (Head !grasp_object(?obj))
  (Pre p1 holding(?arm nothing))
  (Pre p2 connected(?plArea ?manArea ?preArea))
  (Pre p3 robotAt(?manArea))
  (Pre p4 on(?object ?plArea))
  (Del p1)
  (Del p4)
  (Add e1 holding(?arm ?obj))
  (Reward -0.04) (TransitionProb 0.9)
)

# getObject when no collision exist
(:operator 
  (Head !grasp_object(?obj))
  (Pre p1 holding(?arm nothing))
  (Pre p2 connected(?plArea ?manArea ?preArea))
  (Pre p3 robotAt(?manArea))
  (Pre p4 on(?object ?plArea))
  (Pre p5 isCollision(?object ?object1 false))
  (Del p1)
  (Del p4)
  (Add e1 holding(?arm ?obj))
  (Reward -0.04) (TransitionProb 0.9)

   (ResourceUsage 
    (Usage navigationCapacity 20))
)

(:operator 
  (Head !moveTo(?l1 ?l2))
  (Pre p1 robotAt(?l1))
  (Del p1)
  (Add e1 robotAt(?l2))
  
  (if (Values ?l2 table2) (Reward 1)) #table2 always is the final state
  (if (Values ?l2 corner1) (Reward -0.06) (TransitionProb 0.9)) #
  (if (Values ?l2 corner2) (Reward -0.06) (TransitionProb 0.9)) #
  (else (Reward -0.04) (TransitionProb 0.7)) #

  (if (IC ?Money < 10) (Decrease (Reward 0.02)))

#determined by spatial knowledge
#  (ResourceUsage 
#    (Usage BatteryStorageCapacity 30))
)

# MOVE_BASE_BLIND   ManArea to PreArea or opposite
(:operator
 (Head !move_base_blind(?fromArea ?toArea))
 (Pre p1 robotAt(?fromArea))    
 (Pre p2 connected(?plArea ?mArea ?preArea))
 (Constraint OverlappedBy(task,p1))
 (Constraint Duration[5000,INF](task))
 (Add e1 robotAt(?toArea))
 (Constraint Overlaps(task,e1))
 (Del p1)

  (Reward -0.04) (TransitionProb 0.9)
  
#determined by spatial knowledge
 #(ResourceUsage 
 #   (Usage navigationCapacity 25))
)

(:method
  (Head obtainObject())
  (Pre p1 robotAt(preManipulationAreaEastCounter1))
  (Pre p2 holding(?arm tray))
  (Sub s1 !moveTo(preManipulationAreaEastCounter1 preManipulationNorthTable))
  (Sub s2 get_object(cup))
  (Constraint Equals(s1,task))
)

(:method
  (Head obtainObject())
  (Pre p1 robotAt(preManipulationAreaEastCounter1))
  (Pre p2 holding(?arm tray))
  (Sub s1 !moveTo(preManipulationAreaEastCounter1 preManipulationSouthTable))
  (Sub s2 get_object(appetizer))
)

(:method
  (Head drive_robot(?l))
  (Sub s1 get_object(tray))
  (Sub s2 obtainObject())
  (Sub s3 moveTo(?l))
)


(:method 
(Head moveTo(table2))
(Pre p1 holding(?arm cup))
(Pre p2 holding(?otherArm tray))
(Pre p3 crossLinked(preManipulationNorthTable corner1))
(Pre p4 crossLinked(corner1 table2))
(Sub s1 !moveTo(preManipulationNorthTable corner1))
(Sub s2 !moveTo(corner1 table2))
)

(:method 
(Head moveTo(table2))
(Pre p1 holding(?arm cup))
(Pre p2 holding(?otherArm tray))
(Pre p3 crossLinked(preManipulationNorthTable table2))
(Sub s1 !moveTo(preManipulationNorthTable table2))
)

(:method
(Head moveTo(table2))
(Pre p1 holding(?arm appetizer))
(Pre p2 holding(?otherArm tray))
(Pre p3 crossLinked(preManipulationSouthTable corner2))
(Pre p4 crossLinked(corner2 table2))
(Sub s1 !moveTo(preManipulationSouthTable corner2))
(Sub s2 !moveTo(corner2 table2))
)

(:method
(Head moveTo(table2))
(Pre p1 holding(?arm appetizer))
(Pre p2 holding(?otherArm tray))
(Pre p3 crossLinked(preManipulationSouthTable table2))
(Sub s1 !moveTo(preManipulationSouthTable table2))
)

# pickup object : robot at manArea
(:method
  (Head get_object(?object))
  (Pre p1 connected(?plArea ?manArea ?preArea))
  (Pre p2 robotAt(?manArea))
  (Pre p3 on(?object ?plArea))
  (Sub s1 !grasp_object(?object))
  (Sub s2 !move_base_blind(?manArea ?preArea))
)


# pickup object : robot at manArea
(:method
  (Head get_object(?object))
  (Pre p1 connected(?plArea ?manArea ?preArea))
  (Pre p2 robotAt(?preArea))
  (Pre p3 on(?object ?plArea))
  (Sub s0 !move_base_blind(?preArea ?manArea))
  (Sub s1 !grasp_object(?object))
  (Sub s2 !move_base_blind(?manArea ?preArea))
)


