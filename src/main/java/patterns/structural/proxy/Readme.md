### Proxy

#### Use Case

* We need to provide a placeholder or surrogate to another object.

#### Solution

* Proxy acts on behalf of the object and is used for lots of reasons:
  * Protection Proxy: controls access to original object's operations
  * Remote Proxy: provides a local representation of a remote object
  * Virtual Proxy: delays construction of original object until absolutely necessary
* Client is unaware of existence of proxy. Proxy performs its work transparently.

#### Roles

* Subject: defines interface used by Client
* Real Subject: provides real implementation of Subject
* Proxy:
  * Implements same interface as real subject
  * Maintains reference to real object for providing actual functionality

#### Implementation

* We start by implementing proxy
  * Proxy must implement same interface as the real Subject
  * We can either create actual object later when required or ask for one in constructor
  * In method implementations of proxy we implement proxy's functionality before delegating to real object
* How to provide client with proxies instance is decided by application. We can provide a factory or compose client code
with proxies instance.
* What we are implementing above is also called as static proxy. Java also provides "dynamic proxies".

#### Dynamic Proxy Implementation

* We start by implementing `java.lang.reflect.InvocationHandler`
  * Invocation Handler implements `invoke` method which is called to handle every method invocation on proxy
  * We need to take action as per the method invoked. We'll cache the Method instances on image interface
so that we can compare them inside invoke method
  * Our Invocation Handler will accept same argument in constructor as needed by constructor of real object.
* Actual proxy instance is created using `java.lang.reflect.Proxy` by client.