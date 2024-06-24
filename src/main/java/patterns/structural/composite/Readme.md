### Composite

#### Use Case

* We have a tree structure of objects, and we want to be able to treat all objects in this hierarchy uniformly.
* This is NOT a simple composition concept from OOP but a further enhancement of this concept.

#### Roles

* Component: defines behaviour common to all classes including methods to access children
* Lead: represents leaf objects & behaviour of primitive objects
* Composite: stores child components
* Client: works with object hierarchy using component interface only.