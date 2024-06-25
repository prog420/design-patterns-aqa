### Facade

#### Use Case

* Client has to interact with a large number of interfaces and classes in a subsystem to get result.
So client gets tightly coupled with those interfaces & classes.

#### Solution

* Facade provides a simple and unified interface to a subsystem. Client interacts with just the facade to get the same result.

#### Roles

* Subsystem: classes which implement some functionality (multiple packages / classes / interfaces)
* Facade: interacts with subsystem classes to satisfy client request

#### Implementation

* We start by creating a class that will serve as a facade
  * We determine the overall "use cases" / tasks that the subsystem is used for
  * We write a method that exposes each "use case" or task
  * This method takes care of working with different classes of subsystem.