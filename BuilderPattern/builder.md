# Builder pattern
Imagine you are building a wall. To build a wall, you need cement, bricks, plaster of paris and paint. The wall
also needs to have dimensions as an input. There are certain calculations that need to be done based on the 
materials provided if a wall can be built. For a wall class to handle all this through a constructor would be
writing code that is required for building a wall, which is a lot of code in this case which might just shadow
what the wall does.  

#### Why a builder ?
The builder pattern here comes to the rescue: It provides a design that allows the separation of concern of 
building the wall from the wall itself. The same wall builder can be used to work on different walls as well.
Thus:
* Achieves separation of concern - The building logic resides in another class
* Prevents against an object being created in a half baked state - a wall will be created only if the ingrediants
can be used to make a wall of that size.
* Once can vary the product's internal representation **with an abstract builder in place**

#### Paticipants in builder pattern
* Builder - class that handles product attributes required for creating the product and all logic to create
a valid product. *WallBuilder*
* Director - the class using the builder to create the product object *FenceCreator*
* Product - the complex object that is under construction *Wall*