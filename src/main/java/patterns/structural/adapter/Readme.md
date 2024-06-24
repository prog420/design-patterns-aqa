### Adapter

#### Use Case

* We have an existing object which provides the functionality that client needs. But client code can't use this object
because it expects an object with different interface.
* Using Adapter design pattern we make this existing object work with client by adapting the object to client's
expected interface.

#### Roles

* Adaptee: provides functionality that needed by the Client
* Target: provides interface which can be used by the Client
* Adapter: extends from Adaptee and implements Target interface and adapts existing Adaptee functionality
to the Target interface
* Client: needs functionality provided but can't use Adaptee interface.