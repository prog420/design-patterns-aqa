### Visitor

#### Use Case

* Visitor pattern allows us to define new operations that can be performed on an object
without changing the class definition of the object.

* Visitor visits all nodes in an object structure. Each time our visitor visits a particular object from the
object structure, that object calls a specific method on visitor, passing itself as an argument.
* Each time we need a new operation we create a subclass of visitor, implement the operation in that class and visit the object structure.
* Object themselves only implement an `accept` visit where the visitor is pass as an argument.
Objects know about the method in visitor created specifically for it and invoke that method inside the `accept` method.

#### Roles

* Visitor: defines `visit` operation for each concrete element class.
  * `visitConcreteElementA(concreteElementA)`
  * `visitConcreteElementB(concreteElementB)`
* Concrete Visitor A/B: implements each `visit` operation
* Element: defines `accept` operation
* Concrete Element: implements `accept` and calls visitor's method which is defined for this class
* Object Structure: can enumerate elements

#### Implementation

* We create visitor interface by defining `visit` methods for each class we want to support.
* The classes who want functionalities provided by Visitor define `accept` method which accepts a visitor.
These methods are defined using the visitor interface as a parameter type so that we can pass any class
implementing the visitor to these methods.
* In the `accept` method implementation we'll call a method on visitor which is defined specifically for that class.
* Next we implement the visitor interface in one or more classes. Each implementation provides a specific functionality for
interested classes. If we want another feature we create new implementation of visitor.