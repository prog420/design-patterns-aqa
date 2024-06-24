### Interpreter

#### Use Case

* We use interpreter when want to process a simple "language" with rules or grammar.
  * E.g. "File access requires user role and admin role."
* Interpreter allows us to represent the rules of language or grammar in a data structure
and then interpret sentences in that language.
* Each class in this pattern represents a rule in the language. Classes also provide
a method to interpret an expression.

#### Roles

* Abstract Expression: interface for expressions in tree, defines `interpret(context)` operation
* Terminal Expression: leaf nodes, implements `interpret(context)` operation
* NonTerminal Expression: contains other expression
* Context: holds global information needed by interpreter
* Client: calls `interpet` operation, (optionally) builds a syntax tree.

#### Implementation

* We start by studying rules of the language for which we want to build interpreter
  * We define an abstract class or interface to represent an expression & define a method
in it which interprets the expression
  * Each rule in the class becomes an expression. Expressions which do not need other expressions
to interpret become terminal expressions.
  * We create non-terminal expression classes which contain other expressions. These will in turn
call `interpret` on children as well as perform interpretation of their own if needed.
* Building the Abstract Syntax Tree using these classes can be done by client itself or 
we can create a separate class to do it.
* Client will then use this tree to interpret a sentence.
* A context is passed to interpreter. It typically will have the sentence to be interpreted
& optionally it may also be used by interpreter to store any values which expressions need or modify or populate.


**! Interpreter Design Pattern does not tell you how to build AST, parse the actual syntax or actual sentence.**