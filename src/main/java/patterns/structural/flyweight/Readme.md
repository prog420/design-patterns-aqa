### Flyweight

#### Use Case

* Our system needs a large number of objects of a particular class & maintaining these instances
can cause performance issues.

#### Solution

* Flyweight allows us to share an object in multiple contexts. We divide object state in two parts:
intrinsic & extrinsic state. We create objects with only intrinsic state and share them in multiple contexts.

#### Roles

* Flyweight: interface for flyweight & method to receive extrinsic state
* Concrete Flyweight: has only intrinsic state, implements methods & uses provided extrinsic state
* Unshared Flyweight: objects of these are not shared
* Flyweight Factory: provides instances of flyweights, takes care of sharing
* Client: computes or stores extrinsic state of used flyweights

#### Implementation

* We start by identifying "intrinsic" & "extrinsic" state of our object
  * We create an interface for flyweight to provide common methods that accept extrinsic state
  * In implementation of shared flyweight we add intrinsic state & also implement methods
  * In unshared flyweight implementation we simply ignore the extrinsic state argument as we have all state within object.