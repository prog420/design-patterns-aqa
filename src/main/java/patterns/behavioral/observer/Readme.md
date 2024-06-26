### Observer

* Using observer design pattern we can notify multiple objects whenever an object changes state.
* We are defining one-to-many dependency between objects, where many objects are listening for state
change of a single object, without tightly coupling all of them together.

#### Roles

* Subject: interface for registering observers; supports multiple observers
  * `attach(observer)`
  * `detach(observer)`
  * `notify()`
* Concrete Subject: sends notification to observers when its state changes
* Observer: interface for objects that want notification when subject changes
* Concrete Observer: has reference to concrete observer

#### Implementation

* We define an interface for observer. Observer is usually a very simple interface 
and define a method used by "subject" to notify about state change.
* Subject can be an interface if we are expecting our observers to listen to
multiple objects or else subject can be any concrete class.
* Implementing subject means taking care of handling attach and detach of observers,
notifying all registered observers & providing methods to provide state info requested by observers.
* Concrete Observers use a reference passed to them to call "subject" for getting more info about the state.
If we are passing changed state in `notify()` method them this is not required.