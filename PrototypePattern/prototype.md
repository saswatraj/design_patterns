# Prototype Pattern

The prototype pattern specifies the kinds of objects to create using a prototypical instance,
and create new objects by copying it's prototype.
If we take the same example from factory pattern of taking a photograph from a camera, the
same can be achieved using a prototype pattern. We can have a registry which keeps the different
types of photos and provides the appropriate photo when required.

#### Why a prototype pattern?
Prototype pattern is generally used when:
* The classes to instantiate are specified at runtime. For example if the client system decides 
which class to use, it can implement the abstract product interface, which will be picked from the 
class path at runtime.
* When there are a lot of products that need to be created and one would not want an hierarchy of factories
to be created, vending an hierarchy of products. 
* When instantiating a class is an expensive operation and instances can be cloned, one would use the 
prototype pattern to have prototypes and clone objects than to create new ones. For example, if instantiating
an object requires disk reads and the state does not change, then to avoid repeated reads one could clone the
existing object instance.
* When different products are created just by changing specific values, this can also be done by cloning the
object and updating the registry after changing the values.

#### Participants in a prototype pattern
* Prototype - the interface that the prototypes need to implement
* ConcretePrototype - the implementations of the prototype interface
* Client - creates the new object by asking the prototype/registry to clone

#### Implementation notes
* The liability of using a prototype pattern is that not all objects are cloneable. For example, an object 
with a circular reference or which are not serializable cannot be cloned.
* When the number of prototypes isn't fixed or varies at runtime one needs to implement a prototype registry
which contains the list of all registered prototypes.
* There are cases when either Prototype or Abstract Factory could be used properly. At other times they are 
complementary: Abstract Factory might store a set of Prototypes from which to clone and return product objects.
Abstract Factory, Builder, and Prototype can use Singleton in their implementations.
* Factory Method: creation through inheritance. Prototype: creation through delegation.
* Prototype doesn't require subclassing, but it does require an "initialize" operation. Factory Method 
requires subclassing, but doesn't require Initialize
