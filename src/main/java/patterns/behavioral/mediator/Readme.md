### Mediator

* Mediator encapsulates how a set of objects interact with each other.
Due to this encapsulation there's a loose coupling between the interacting objects.
* Typically an object explicitly knows about other object to which it wants to interact
i.e. to call a method.
In mediator pattern this interaction is within the mediator object & interacting object
only know about the mediator object.
* Benefit of this arrangement is that the interaction can now change without needing
to modificate participating objects. Changing the mediator allows to add/remove participants in an interaction.


#### Roles

* Mediator: defines interface for interactions with colleague objects
* Concrete Mediator: implements mediator & maintains references to colleague objects
* Colleague: knows about mediator & communicates with mediator
* Concrete Colleague: implements functionality, handles notifications from mediator


#### Implementation

* We start by defining mediator
  * Mediators define a generic method which is called by other objects.
  * This method typically needs to know which object changed and optionally the exact property which has changed in that object.
  * We implement this method in which we notify rest of the objects about the state change.
* Mediator needs to know about all participants in the collaboration it's mediating.
To solve this problem we can either have objects register with mediator or mediator itself can be the creator of these objects.
* Depending upon your particular implementation you may need to handle the infinite loop of change-notify-change which
can result if object's value change handler is called for every value change whether from an external source as well as mediator.