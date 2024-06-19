### Singleton

#### Implementation

* Controlling instance creation
  * Class constructor(s) must not be accessible globally
  * Subclassing / inheritance must not be allowed
* Keeping track of instance
  * Class itself is a good place to track the instance
* Giving access to the singleton instance
  * A public static method is good choice


#### Implementations

* Early Initialization - Eager Singleton
  * Create singleton as soon as class is loaded
* Lazy Initialization - Lazy Singleton
  * Singleton is created when it's first required


#### Implementation Considerations

* Early/Eager init is the simplest & preferred way. Try to use this approach first.
* "Classic" singleton uses double check locking and volatile field
* Lazy singleton with holder don't require to deal with synchronization issues