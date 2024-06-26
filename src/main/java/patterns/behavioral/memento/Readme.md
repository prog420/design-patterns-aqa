### Memento

#### Use Case

* We want to store object's state without exposing internal details about the state.
* You want to undo/redo executed commands on the object.

#### Solution

* Using Memento we can ask an object to give its state as a single, "sealed" object & store it for later use.
This object should not expose the state for modification.

#### Memento vs Command

* Command: you are undoing/redoing by executing commands on the state
* Memento: you are undoing/redoing by replacing state from a cache of states
* Memento can be combined with Command to provide undo functionality in application.

#### Roles

* Originator: 
  * creates a memento with its state
  * can restore state from memento
* Memento: stores state of originator, only readable & writable from originator.
* Care Taker: in charge of storing memento.

#### Implementation

* We start by finding originator state which is to be "stored" in memento
* We then implement the memento with requirement that it can't be changed & read outside the originator.
* Originator provides a method to get its current snapshot out, which will return an instance of memento.
* Another method in originator takes a memento object as argument and the originator object resets itself
to match with the state stored in memento.