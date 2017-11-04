# Abstract Factory Pattern

Wikipedia describes an abstract factory as "The abstract factory pattern provides a way to encapsulate
a group of individual factories that have a common theme without specifying their concrete classes". 
The important things to note here are:  

* There should be a group of factories
* There should be a common theme among them  
* There is a client which needs to know only products functionality's and not how they work

A real world example of this problem can be formed like - the government has asked all pizza delivery 
stations to install a particular software which manages their orders and integrates with their machines
to automate pizza making and delivering of the pizzas. However each pizza maker has their own secret 
ingredients to make their pizza and own method of managing and delivering pizzas. Hence to make sure that all
pizza makers follow certain guidelines the government creates an abstract guideline that the pizza makers
need to follow.  
Here:
* There should be a group of factories - each individual pizza maker is a factory
* There should be a common theme among them  - they make and sell pizzas

#### Why an abstract factory ?
Now that we are clear on when to use abstract factory, let's also see why to use an abstract factory. If I
were to build an automated order machine for my food court which would have one pizza corner, and am building
my software for it - without the abstract factory pattern i would have used a particular implementation of 
the provider for e.g. Dominos. Now if Dominos were to leave and some other pizza delivery company were to 
rent the space, I would have to patch my software by using their factories.  
With abstract factory in place, I can avoid this by directly using the PizzaFactory (abstract). For all my 
code i can work with this, knowing that any pizza provider will confirm to this. I also donot need to know
how my pizza provider is making his pizza.  
So, in total:
* It is isolating the concrete classes ( different pizza's )
* It is easy to replace factories with each other
* There is a consistency between factories and also their products

#### Paticipants in  an abstract factory pattern
* AbstractFactory - declares an interface for factories that create abstract products
* ConcreteFactory - implements the abstract factory and implements the operations to create a concrete product
* AbstractProduct - declares the interface for the type of product object created by the factories
* ConcreteProduct - implements the abstract product which is to be created by the concrete factory
* Client - uses the abstract factory and product for their own operations

#### Implementation notes
* Usually a single instance of concrete factory is present in the runtime which creates different products.
Hence this is often made into a singleton class. *Concreate factories are singletons*
* Although we have defined the scope of the factory as pizza, what would you do if it was a food stall and 
different products were to be made. This is usually achieved by combining the prototype pattern to the 
abstract factory pattern wherein a single factory can create multiple different products. *Can use the 
prototype pattern along with the abstract factory for this case*
