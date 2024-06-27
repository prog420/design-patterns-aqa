### Null Object

#### Use Case

* We want to use `null` value to represent an absence of object.

#### Solution

* Using Null Object we can provide an alternate representation to indicate an absence of object.
* With Null Object we don't have to perform null checks wherever we can expect a null object.
* It'll basically do nothing & store nothing when an operation is called on it.

#### Design Considerations

* Null Objects **seems** like a proxy as it stands in for a real object, however a proxy at some point 
will use real object or transform to a real object & even in absence of the real object proxy will provide
some behaviour with side effect. Null Object will not do any of such thing. Null Objects don't transform into real objects.
* We use this pattern when we want to treat absence of a collaborator transparently without null checks.

#### Roles

* Abstract Class: defines operations used by Client
* Concrete Class: implements operations defined in the Abstract Class
* Null Class:
  * defines null object
  * implementation does nothing

#### Implementation

* We create a new class that represents our null object by extending from base class or 
implementing given interface.
* In the Null Object implementation, for each method we won't do anything. However doing nothing can mean different things
in different implementations. E.g. if a method in a null object returns something then we can either return another null object,
a predefined default value or null.
* Code which creates objects of our implementation will create & pass our null object in a specific situation.