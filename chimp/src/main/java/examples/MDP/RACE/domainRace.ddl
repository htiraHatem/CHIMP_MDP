(HybridHTNDomain safe_navigation)

(MaxArgs 3)

(PredicateSymbols
  has robotAt get_object !moveTo obtainObject drive_robot moveTo crossLinked !grasp_object
  connected)



################################
####  OPERATORS ################

# getObject
(:operator 
  (Head !grasp_object(?v))
  (Add e1 has(?v))
)

(:operator 
  (Head !moveTo(?l1 ?l2))
  (Pre p1 robotAt(?l1))
  (Del p1)
  (Add e1 robotAt(?l2))
)

(:method
  (Head obtainObject())
  (Pre p1 robotAt(counter))
  (Pre p2 has(tray))
  (Sub s1 !moveTo(counter northTable))
  (Sub s2 get_object(cup))
  (Constraint Equals(s1,task))
)

(:method
  (Head obtainObject())
  (Pre p1 robotAt(counter))
  (Pre p2 has(tray))
  (Sub s1 !moveTo(counter southTable))
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
(Pre p1 has(cup))
(Pre p2 has(tray))
(Pre p3 crossLinked(northTable corner1))
(Pre p4 crossLinked(corner1 table2))
(Sub s1 !moveTo(northTable corner1))
(Sub s2 !moveTo(corner1 table2))
)

(:method 
(Head moveTo(table2))
(Pre p1 has(cup))
(Pre p2 has(tray))
(Pre p3 crossLinked(northTable table2))
(Sub s1 !moveTo(northTable table2))
)

(:method
(Head moveTo(table2))
(Pre p1 has(appetizer))
(Pre p2 has(tray))
(Pre p3 crossLinked(southTable corner2))
(Pre p4 crossLinked(corner2 table2))
(Sub s1 !moveTo(southTable corner2))
(Sub s2 !moveTo(corner2 table2))
)

(:method
(Head moveTo(table2))
(Pre p1 has(appetizer))
(Pre p2 has(tray))
(Pre p3 crossLinked(southTable table2))
(Sub s1 !moveTo(southTable table2))
)

# drive and obtain object
(:method
  (Head get_object(?object))
  (Sub s1 !grasp_object(?object))
)

