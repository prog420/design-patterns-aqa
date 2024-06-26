### Iterator

#### Use Case

* Iterator allows a way to access elements/children of an aggregate object in sequence.
* Iterator allows you to hide the actual internal data structure that is used in our aggregate object.

#### Implementation Considerations

* In Java iterators are integral part of collection frameworks, and they are implementations of this design pattern.
* Iterators are stateful, meaning an iterator object remembers its position while iterating.
* Iterators can become out of sync if the underlying collection is changed while the iterator is in use.

#### Roles

* Aggregate: defines interface to create iterator
* Concrete Aggregate: implements method to return object of iterator
* Iterator: interface to iterate elements of aggregate
* Concrete Iterator: implements iterator interface; has state to remember position

#### Implementation

* We start by defining Iterator interface
  * Iterator has methods to check whether there is an element available in sequence & to get that element
* We then implement the Iterator. This is typically an inner class in our concrete aggregate.
Making it an inner class makes it easy to access internal data structures.
* Concrete iterator needs to maintain state to tell its position in collection of aggregate. If the inner collection
changes it can throw an exception to indicate invalid state.