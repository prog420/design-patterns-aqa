### State

#### Use Case

* Strategy pattern allows us to encapsulate an algorithm in a class. So now we can configure our context
or main object with an object of this class, to change the algorithm used to perform given operation.
* This is helpful if you have many possible variations of an algorithm.
* A good indication for applicability of Strategy pattern is if we find different algorithms/behaviours
in our methods which are selected with conditional statements like if-else or switch-case.
* Strategy classes are usually implemented in an inheritance hierarchy so that we can choose any implementation
and it'll work with our main object / context as the interface is the same for all implementations.

#### Roles

* Context: uses Strategy object to perform an operation
* Strategy: interface for algorithm implementations
* Concrete Strategy: implements actual algorithm

#### Implementation

* We start by defining strategy interface which is used by our main/context class. Context class provides strategy with all the data it needs.
* We provide implementations for various algorithms by implementing strategy interface (a class per algorithm)
* Our context class provides a way to configure it with one of the strategy implementations. Client code will create context with one of the strategy object.