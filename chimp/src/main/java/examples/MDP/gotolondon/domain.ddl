(HybridHTNDomain safe_navigation)

(MaxArgs 3)

(PredicateSymbols
  has agent_at !getVehicle !moveTo obtainVehicle goTo moveTo hasMoney true !enter !walkTo onFoot
  connected)


(Resource Money 150)

################################
####  OPERATORS ################

# getVehicle
(:operator 
  (Head !getVehicle(?v))
  (Add e1 has(?v))
   # transition probability is attached to the Task
   # reward is attached with action and will be assigned to the current state 
   # (if (Values ?v car ship) (Reward -0.01) (TransitionProb 1))
  (if (Values ?v plane) (Reward -0.02) (TransitionProb 0.8))
  (if (Values ?v ship) (Reward -0.04) (TransitionProb 0.7))
  (else (Reward -0.04) (TransitionProb 0.9))

 # (if (Values ?v plane) (increase Reward 0.01)
(ResourceUsage (Usage Money 20))
)

(:operator 
  (Head !moveTo(?l1 ?l2 ?v))
  (Pre p1 has(?v))
  (Pre p2 agent_at(?l1))
  (Del p2)
  (Add e1 agent_at(?l2))
  (if (Values ?l2 soton) (Reward -0.02))
  (if (Values ?l2 london) (Reward 1)) # final state
  (if (Values ?l2 airport) (Reward -0.03) (TransitionProb 0.8))
  (if (Values ?l2 harbor) (TransitionProb 0.7))
  (if (Values ?l2 nyc) (TransitionProb 0.7))
  (else (Reward -0.04) (TransitionProb 0.9)) # in all the other states

  (ResourceUsage (Usage Money 40))
  #to fix is not working
 # (if (IC ?Money < 75) (Increase (Reward 0.05))) # to test if the final state has enough resource


)

(:operator 
  (Head !walkTo(?l1 ?l2))
  (Pre p1 onFoot(true))
  (Pre p2 agent_at(?l1))
  (Del p2)
  (Add e1 agent_at(?l2))
  (Reward 0)
  (TransitionProb 0.99)
  (ResourceUsage (Usage Money 0))

  # increase the cost/reward if the condition is met
 (if (IC ?Money < 40) (Decrease (Reward 0.03)))
)

(:operator 
  (Head !enter(?v))
  (Pre p2 agent_at(?v))
  (Add e1 hasMoney(true))
  #(Increase (Reward 0.02))
  #(Reward -0.04)
  (Reward -0.02)
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
(Sub s1 !moveTo(harbor soton ship))
(Sub s2 !moveTo(soton london ship))
)



(:method 
(Head moveTo(london))
(Pre p1 has(ship))
(Sub s1 !moveTo(harbor lpool ship))
(Sub s2 !moveTo(lpool london ship))
)



