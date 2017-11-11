# Adapter Pattern

The adapter pattern is used when trying to convert the interface of one class into another interface that
clients expect. It lets classes work together that otherwise couldn't because of incompatible interfaces.

Adapter is about creating an intermediary abstraction that translates, or maps, the old component to the 
new system. Clients call methods on the Adapter object which redirects them into calls to the legacy 
component. This strategy can be implemented either with inheritance or with aggregation. 

A real world example for this is the power adapters, where a 3 pin socket interface needs to be adapted for
a 2 pin plug by adapting it into a 2-pin socket.

#### Why a adapter pattern?
Use the adapter pattern when:
* When two different components need to interact with each other, an adapter can be used as a conversion of
one object to another and vice-versa for those components to be able to interact.
* When there are a lot of products that need to be created and one would not want an hierarchy of factories
to be created, vending an hierarchy of products. 
* When you want to wrap an existing class in a new interface.

#### Participants in a adapter pattern
* Target - This is the application specific interface that is being used by the client
* Client - This is the application that uses the target interface for all opertions
* Adapter - Adapts the interface of the adaptee to the target interface ( might inherit from the target interface
and contain an instance of the adaptee for delegation of events)
* Adaptee - The existing interface that needs adapting to be used by the client.

#### Implementation notes
Based on whether you create an adapter which uses inheritance vs. aggregation there are two different types
of adapters:
* Class Adapter uses inheritance and can only wrap a class. It cannot wrap an interface since by definition
 it must derive from some base class.
* Object Adapter uses composition and can wrap classes or interfaces, or both. It can do this since it 
contains, as a private, encapsulated member, the class or interface object instance it wraps.
