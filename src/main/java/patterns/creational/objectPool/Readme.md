### Object Pool

#### Use Case

* High cost of creating an instance of a class, and we need a large
amount of objects of this class for short duration.

#### Implementation

* We can pre-create objects of the class
* Or collect unused instances in a memory cache. When code needs an object
of this class we provide it from this cache.

* It should provide a thread-safe caching of objects
* Methods to acquire and release objects should be provided & pool should reset cached objects
before giving them out.

* The reusable object must provide methods to reset its state upon "release" event.
* We have to decide whether to create new pooled objects: when pool is empty or to wait
until an object becomes available. Choice is  influenced by whether the object is tied to
a fixed number of external resources.


#### Real life examples

* Popular pattern in game development - instatiating game object is a costly task; sometimes it's required to
create many short-lived objects (e.g. bullets in bullet hell games) so it's convenient to use object pool.
* Example from Java Library: `java.util.concurrent.ThreadPoolExecutor`