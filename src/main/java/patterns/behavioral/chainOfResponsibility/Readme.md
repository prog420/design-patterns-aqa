### Chain Of Responsibility

#### Implementation

* We start by defining handler interface / abstract class
  * Handler must define a method to accept incoming request
  * Handler can define method to access successor in chain;
If it's an abstract class then we can even maintain successor.
  * Implement handler in one or more concrete handlers. Concrete handler should check
if it can handle the request. If not it should pass request to the next handler.
  * We have to create our chain of objects next. We can do it in client.
In real world this job may be done by some framework.