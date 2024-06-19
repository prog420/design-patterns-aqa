### Builder

* We have a complex process to construct an object involving multiple steps.
* In builder we remove the logic related to object construction
from "client" code and abstract it in separate classes.


### Implementing a Builder

* We start by creating a builder
  * Identify the "parts" of the product & provide methods to create those parts
  * Provide a method to "assemble" or build the product / object
  * Provide a way / method to get fully built object. **_Optionally_** builder can
keep reference to a product it has build so the same can be returned again in future
* A _**director**_ can be a separate class or client