(HybridHTNDomain safe_navigation)

(MaxArgs 3)

(PredicateSymbols
  holding robotAt get_object !moveTo obtainObject drive_robot moveTo crossLinked !grasp_object
  on connected !move_base_blind)



################################
####  OPERATORS ################

# getObject
(:operator 
  (Head !grasp_object(?obj))
  (Pre p1 holding(?arm nothing))
  (Pre p2 connected(?plArea ?manArea ?preArea))
  (Pre p3 robotAt(?manArea))
  (Pre p4 on(?object ?plArea))
  (Del p1)
  (Del p4)
  (Add e1 holding(?arm ?obj))
)

(:operator 
  (Head !moveTo(?l1 ?l2))
  (Pre p1 robotAt(?l1))
  (Del p1)
  (Add e1 robotAt(?l2))
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

# MOVE_BASE_BLIND   ManArea to PreArea or opposite
(:operator
 (Head !move_base_blind(?fromArea ?toArea))
 (Pre p1 robotAt(?fromArea))       # TODO use type restriction
 (Pre p2 connected(?plArea ?mArea ?preArea))
 (Constraint OverlappedBy(task,p1))
 (Constraint Duration[5000,INF](task))
 (Add e1 robotAt(?toArea))
 (Constraint Overlaps(task,e1))
 (Del p1)
 (ResourceUsage 
    (Usage navigationCapacity 1))
)

