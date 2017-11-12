# Composite Pattern
There are applications that need to manage both primitive objects and composite objects
that are themselves composed of primitive objects, a composite pattern is used for designing
such systems. This pattern can also be leverage to form a recursive composition of objects.

A real world example of such patterns can be a text editor where primitive entries 
correspond to simple things like characters which form a line which then form a paragraph.
Another example could be a file system, where primitives are files and composites are 
directories which have a recursive composition of files and directories.

#### Why a composite pattern?
* You can represent hierarchies as objects.
* Clients can ignore the difference between composite objects and primitive ones
* New components can be easily added.

#### Participants in a composite pattern
* Component - This is the general interface for all components used by the client
* PrimitiveComponent - These are the primitive objects, i.e. which donot have any child and
are supposed to be at the leaf nodes of the hierarchy.
* CompositeComponent - These objects point to other composite objects or primitive objects 
as their children.
* Client - Manipulates objects in the composition through the component interface.

#### Implementation notes
* One disadvantage of making the interface of component general and making it easy to add
new components is that we cannot depend of the type checking of the language to restrict 
adding new components. 
* Depending upon the application one might also add references from a composite child to
its parent, making it easier to reverse traverse the list
* The obvious question while implementing the component interface is for the addition of
methods that are specific to the composite object as it conflicts with the general 
understanding of defining interfaces - which should contain operations common to all the
objects implementing that interface. Although for some interfaces, the default behaviour
can be added to primitive objects for these methods, for others the idea would be to 
throw runtime errors if these are invoked. 
* For operations which repeatedly traverse through the hierarchy consider having a cache
to improve application performance.