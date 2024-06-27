### State

* State design pattern allows our objects to behave differently based on its current internal state.
* This pattern allows to define the state specific behaviours in separate classes.
* Operations defined in the class delegate to the current state object's implementation of that behaviour.
* State transitions can be triggered by states themselves in which case each state
knows about at least on other state's existence.
* A benefit of this pattern is that new states and thus new behaviours can be added without changing our main class.

#### Roles

* Context:
  * class whose state is now an object.
  * client code works with this class
  * delegates operation to the current state
* State:
  * interface for objects which represents state of object
  * defines operations called by owning object
* Concrete State
  * represents a particular state of object
  * implements behavior specific to this state value

#### Implementation

* Identify distinct values for state of our object (context). Each state value will be a separate class in our implementation.
These classes will provide behaviour specific to the state value they represent.
* In our main/context class method implementations we'll delegate the operation to the current state object.
* We have to decide how our state transition is going to happen. State can transition themselves to the next state
based on input received in a method. Other option is context itself can initiate transition.