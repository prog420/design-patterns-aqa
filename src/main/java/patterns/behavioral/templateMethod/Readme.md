### Template Method

* Using template method design pattern we define an algorithm in a method as a series of steps (method calls)
and provide a chance for subclasses to define or redefine some of these steps.
* These methods (steps) are declared as an abstract methods which then have to be implemented by concrete subclasses.
* This pattern allows you to defer implementation of parts of your algorithm which can vary or change.