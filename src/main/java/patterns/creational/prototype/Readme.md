### Prototype

#### Implementation

* We start by creating a class which will be a prototype
  * The class must implement Cloneable interface.
  * Class should override `clone` method and return copy of itself.
  * The method should declare `CloneNotSupportedException` in throws clause
to give subclasses chance to decide on whether to support cloning.
  * Clone method implementation should consider the deep & shallow copy
and choose whichever is applicable.