### Command

#### Use Case

* We want to represent a request or a method call as an object.
* Information about parameters passed and the actual operation in
encapsulated in an object called command.
* Method call in now an object which can be stored for later execution
or sent to other parts of code.
* We can now queue our command objects and execute them later.

#### Implementation

* We start by writing command interface
  * It must define method which executes the command
* We implement this interface in class for each request / operation type we want to implement.
Command should also allow for undo operation if system needs it.
* Each concrete command knows exactly which operation it needs.
All it needs is parameters for the operation if required and the receiver instance
on which operation is invoked.
* Client creates the command instance and sets up receiver and all required parameters.
* Invoker is the code that actually uses command instance and invokes the `execute()` on the command.