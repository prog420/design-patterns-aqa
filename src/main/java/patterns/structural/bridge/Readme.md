### Bridge

#### Use Case

* Our implementations & abstractions are generally coupled to each other in normal inheritance.
* Using bridge pattern we can decouple them so they can both change without affecting each other.
* We achieve this feat by creating two separate inheritance hierarchies; one for implementation and 
another for abstraction.
* We use composition to bridge these two hierarchies.

#### Roles

* Abstraction: defines abstraction's interface, has reference to Implementor.
* RefinedAbstraction: more specialized abstraction
* Implementor: base interface for implementation classes;
methods are unrelated to Abstraction & typically represent smaller steps needed.
* ConcreteImplementor: implements Implementor methods

#### Implementation

* We start by defining our abstraction as needed by client
  * We determine common base operations and define them in abstraction
  * We can optionally also define a refined abstraction & provide more specialized operations
  * Then we define our implementor next. Implementor methods do NOT have to match with abstractor.
However abstraction can carry out its work by using implementor methods.
  * Then we write one or more concrete implementor providing implemention
* Abstractions are created by composing them with an instance of concrete implementor which is used by methods in abtraction.