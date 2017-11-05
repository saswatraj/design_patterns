# Factory Method Pattern

The factory pattern defines an interface for creating an object, but lets subclasses 
decide which class to instantiate. The factory method let's a class defer the instantiation
to subclasses. 
If we take an example from photography ( which i'm very much into) then
we have a camera class which takes photo. Based on the settings which are stored the camera
may return a black and white photo or a colored photo. Let's assume that once we have the
photo we can call it's capture method to capture the image.

#### Why a factory method?
If you take the above example into consideration, the camera class does not know the
type of photo that is required without consulting the settings. We would want the camera to
be concerned with it's own functionality than be cognizant of what photo is required. 
Also, if we introduce a new type of photo, the logic would reside in the factory which
is open for extension. Thus a photofactory would:
* delegate the responsibility of creating a photo to the factory
* would make the class open for extension for new types

#### Paticipants in a factory method pattern
* Factory - This class handles the logic of creating the required product by exposing
a factory method.
* Product - This interface defines the type of product that is returned by the factory method
* ConcreteProduct - The implementation of the product interface

#### Implementation notes
* There are two variants of factories - a) We have an abstract class as a factory and then
have concrete factory classes b) where the factory is a concrete class in itself.
* Another type of factory that I have observed over the recent years is for creating a 
factory that create different kinds of related products through separate factory
methods, each calling out the difference clearly in their method names.
* This pattern is similar to the abstract factory pattern, with the only difference being
this being concerned with a single type rather than a group of related factories
