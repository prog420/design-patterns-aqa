### Decorator

#### Use Case

* We want to enhance behaviour of our existing object dynamically
* Decorator wraps an object within itself and provides same interface as the wrapped object.
So the client of original object doesn't need to change.
* A decorator provides alternative to subclassing for extending functionality of existing classes.

#### Roles

* Component: defines interface used by client
* Concrete Component: plain object which can be decorated
* Decorator: provides additional behaviour, maintains reference to component