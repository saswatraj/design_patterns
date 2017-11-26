# Decorator Pattern
Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing
for extending functionality.

For example, a text view in a user interface, can have a scroll functionality when the text is greater than the height
of the textview. This can be implemented by having a decorator around text view and using that once the text length 
is greater.

#### Why a decorator pattern?
* Decorator is used to add responsibilities dynamically and transparently, that is, without affecting other objects.
* To avoid extension by subclassing where there could be multiple combinations, or class definition may be hidden and 
not available for subclassing

#### Participants in a decorator pattern
* Component - The interface for the object to which we want to add the responsibilities
* Concrete Component - The implementation of the object to which responsibilities are to be added
* Decorator - The interface maintains a reference to the component's object and conforms to the components interface 
along with the added responsibilities.
* Concrete Decorator - The implementation of the decorator which adds additional responsibilities to the component 
through the decorator interface.

#### Implementation notes
* Decorator is also called "Smart Proxy." This is used when you want to add functionality to an object, but not by 
extending that object's type. This allows you to do so at runtime.Adapter is used when you have an abstract interface, 
and you want to map that interface to another object which has similar functional role, but a different interface.
* Adapter provides a different interface to its subject. Proxy provides the same interface. Decorator provides an 
enhanced interface.
* Decorator lets you change the skin of an object. Strategy lets you change the guts.