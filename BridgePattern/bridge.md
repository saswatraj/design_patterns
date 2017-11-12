# Bridge Pattern

Sometimes there is a clear segregation of the abstraction of an object and it's implementation. If the
abstraction can vary independently of the implementation and there is a lot of such variance - the bridge
pattern can be leveraged.  
For example, in India there are two types of tax applied - the central tax and the state tax which varies 
between different goods. If we were to design car software which which automate tax rate applicability we
could do it by having a vehicle interface with cars and bikes which would further have different tax 
implementations. Thus total implementations are 2(types of vehicles) * 2(types of taxes) = 4. This grows
exponentially with the number of parameters.
Using bridge pattern this effort can be reduced as the tax applicability interface can be separate from the
vehicle type. Thus you can have an interface for vehicle and one for tax applier.

#### Why a bridge pattern?
Use the bridge pattern when:
* If you want to decide the implementation at runtime - e.g.decide which tax to apply based on other factors and
then manufacture cars.
* Both abstraction and implementation should be extensible and decoupled. Clients need not be affected by the implementation
changes.
* If you have a big class hierarchy, leading to multiple implantation of decoupled behaviours
* If you want to share an implementation among multiple objects.
* Can be used to hide implementation details from the clients.

#### Participants in a bridge pattern
* Abstraction - The interface that defines the abstraction. It maintains a reference to the implementor
object.
* Refined Abstractions - Extend the interface defined by the abstraction.
* Implementor - The interface for the implantation class.
* Concrete Implementors - Implements the implementors interface.

#### Implementation notes
Creating the right implementor object:
* The abstraction can have the knowledge of the implementors and
can decide which one to use. This makes a dependency of adding an implementor to making the abstraction know
the decision factor for the new implementor.
* Another approach could be choosing a default implementation if a concrete implementation is not provided
* Sometimes a third object (which could be a strategy class decided on the implementation)
