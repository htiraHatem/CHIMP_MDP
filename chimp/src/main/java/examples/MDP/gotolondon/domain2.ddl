(HybridHTNDomain safe_navigation)

(MaxArgs 3)

(PredicateSymbols
  has agent_at !getVehicle !moveTo obtainVehicle goTo moveTo hasMoney true !enter !walkTo onFoot
  connected)


(Resource Money 100)

################################
####  OPERATORS ################

# getVehicle
(:operator 
  (Head !getVehicle(?v))
  (Add e1 has(?v))
   # transition probability is attached to the Task
   # reward is attached with action and will be assigned to the current state 
 # (if (Values ?v car ship) (Reward -0.01) (TransitionProb 1))
  (if (Values ?v plane) (Reward 0.04) (TransitionProb 0.8))
  (else (Reward -0.04) (TransitionProb 0.9))

(ResourceUsage (Usage Money 20))
)

# move from ?l1 to ?l2
# move from ?l1 to ?l2
(:operator 
  (Head !moveTo(?l1 ?l2 ?v))
  (Pre p1 has(?v))
  (Pre p2 agent_at(?l1))
  (Del p2)
  (Add e1 agent_at(?l2))
  (if (Values ?l2 london) (Reward 1)) # final state
  (if (Values ?l2 harbor) (Reward -0.05) (TransitionProb 0.9))
  (if (Values ?l2 nyc)  (Reward -0.04) (TransitionProb 0.7))
  (else (Reward -0.04) (TransitionProb 0.9)) # in all the other states

  (ResourceUsage (Usage Money 40))

  (if (IC ?Money < 10) (Decrease (Reward 0.06)))
)

(:operator 
  (Head !walkTo(?l1 ?l2))
  (Pre p1 onFoot(true))
  (Pre p2 agent_at(?l1))
  (Del p2)
  (Add e1 agent_at(?l2))
  (Reward -0.04)
  (TransitionProb 0.98)
  (ResourceUsage (Usage Money 0))

 # increase the cost if the condition is met
 (if (IC ?Money < 40) (Increase (Reward 0.1)))
)

(:operator 
  (Head !enter(?v))
  (Pre p2 agent_at(?v))
  (Add e1 hasMoney(true))
  (Reward 0)
  (TransitionProb 1)
  (ResourceUsage (Usage Money 10))

  # withdraw money in the airport
  (if (Values ?v bank) (Increase Money 100))
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
(Pre p2 onFoot(true))
(Sub s1 !walkTo(airport bank))
(Sub s2 !enter(bank))
(Sub s3 !walkTo(bank airport))
(Sub s4 !moveTo(airport london plane))
)

(:method 
(Head moveTo(london))
(Pre p1 has(plane))
(Sub s1 !moveTo(airport nyc plane))
(Sub s3 !moveTo(nyc london plane))
)

(:method
(Head moveTo(london))
(Pre p1 has(ship))
(Sub s1 !moveTo(harbor london ship))
#(Sub s2 !moveTo(soton london ship))
)



(:method 
(Head moveTo(london))
(Pre p1 has(ship))
(Sub s1 !moveTo(harbor lpool ship))
(Sub s2 !moveTo(lpool london ship))
)



