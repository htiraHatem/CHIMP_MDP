(HybridHTNDomain safe_navigation)

(MaxArgs 3)

(PredicateSymbols
  has agent_at !getVehicle !moveTo obtainVehicle goTo moveTo hasMoney true !enter !walkTo onFoot
  connected)


################################
####  OPERATORS ################

# getVehicle
(:operator 
  (Head !getVehicle(?v))
  (Add e1 has(?v))
  (Reward -0.04)
    (TransitionProb 1)

)

(:operator 
  (Head !moveTo(?l1 ?l2 ?v))
  (Pre p1 has(?v))
  (Pre p2 agent_at(?l1))
  (Del p2)
  (Add e1 agent_at(?l2))
  (if (Values ?l2 london) (Reward 1)) # final state

  (Reward -0.04)
    (TransitionProb 1)


)

(:method
  (Head obtainVehicle())
  (Pre p1 agent_at(home))
  (Sub s1 !moveTo(home airport car))
  (Sub s2 !getVehicle(plane))
  (Constraint Equals(s1,task))


)

(:method
  (Head obtainVehicle())
  (Pre p1 agent_at(home))
  (Sub s1 !moveTo(home harbor car))
  (Sub s2 !getVehicle(ship))
)

(:method
  (Head goTo(?l))
  (Sub s1 !getVehicle(car))
  (Sub s2 obtainVehicle())
  (Sub s3 moveTo(?l))
)


(:method 
(Head moveTo(london))
(Pre p1 has(plane))
(Sub s1 !moveTo(airport nyc plane))
(Sub s2 !moveTo(nyc london plane))
)

(:method
(Head moveTo(london))
(Pre p1 has(ship))
(Sub s1 !moveTo(harbor soton ship))
(Sub s2 !moveTo(soton london ship))
)

(:method 
(Head moveTo(london))
(Pre p1 has(ship))
(Sub s1 !moveTo(harbor lpool ship))
(Sub s2 !moveTo(lpool london ship))
)



