# Singleton Pattern

This pattern ensures that a class has only one instance and provide a global point of access to it. The need
for this pattern came into existence because there are cases wherein we want only one instance of a particular
class to exist and handle things in a system. For example, for proper control of threads in an application you
can have a single class creating threads and prevent multiple instances of that class.

#### Why a singleton pattern?
One benefit of using the singleton pattern is that there is only one instance of the class and it there is a
common point of accessing it for all other classes. The other reason why one can use a singleton is to delay 
the initialization to the point where the class is required. It's always easier to change to a multiple instance
design from a singleton class.

#### Participants in a singleton pattern
* Singleton - defines an operation to get the instance and keeps an instance as an attribute and lets the 
clients access it through the instance operation.

#### Implementation notes
* In production code, it is sometimes recommended to avoid using singletons as the dependencies of your
classes are hidden in the global point of access i.e. the singleton. Hence you would need to inspect the code
to see what the dependencies are. 
* Singletons promote tight coupling between classes which sometimes makes it difficult to test as dependencies
cannot be substituted and hence rendering existing class code dependent on singletons code while testing. Also,
Singletons have state maintained which makes it unfit for unit testing.
