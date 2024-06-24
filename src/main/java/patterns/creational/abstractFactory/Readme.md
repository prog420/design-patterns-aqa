### Abstract Factory

* Abstract Factory is used when we have two or more objects which work
together forming a kit or set and there can be multiple sets or kits
that can be created by client code.
* We can separate client code from concrete objects forming such a set and
also from the code which creates these sets.


#### Roles

* Abstract Factory: interface defining operations to create abstract products
* Concrete Factory: implements factory & creates concrete products

* Abstract Product: interface for a type of product
* Concrete Product: implements the product 

* Client: uses Abstract Factory & Abstract Products


#### Implementation Considerations

* Can be implemented as singletons, as we typically need only one instance of Concrete Factory
* Can use Prototype design pattern if some objects are expensive to create