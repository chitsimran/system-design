# Design Patterns
> Design patterns developed over time to solve reoccurring problems.
> 
> Types of patterns:
> 1. Creational - Defines how objects are created
> 2. Structural - Defines how objects are structured
> 3. Behavioural - Defines how classes interact with each other

## Factory Pattern
It is a creational design pattern where we have a class (called factory) which generates the objects based on the user requirements. Like if we have an interface Vehicle, and many classes implementing it like Car, Truck, Bus etc. When a customer wants to buy a vehicle, they will provide some requirements. Let’s say they just provide a string and we have to return an object based on it. In this case we can create a class VehicleFactory which accepts those requirement and based on it, returns the desired object. This hides the complexity of how the objects are created from user.
> Pros: Abstracts code, extensible design  
> 
> Cons: Can make the code complex and hard to understand, takes time to set up (boilerplate code)

Implemented in **DesignPatternFactory**.

## Singleton Pattern
It is a creational design pattern which ensures there is only one instance of the class in the application. This is used when we only want to have 1 object of a class in the application and don’t want want any part of the application to make a new obejct of the class. In such scenario, we use this pattern. Here we make the constructor private and expose a static public method which returns the instance of the class (initializes if its NULL initially).
> Pros: Easy to implement, ensures only 1 instance of the class exists (only when required)
> 
> Cons: Peope tend to overuse it, thread safety must be ensured, cannot use with parameters as that’ll make it factory instead

Also implemented in **DesignPatternFactory**.

More info on this [educative.io post](https://www.educative.io/courses/software-design-patterns-best-practices/B8nMkqBWONo).

## Adapter Pattern
It is a structural design pattern which is used to make 2 incompatible classes or interfaces work with each other. If Class A returns an object of type P but Class B accepts an object of class Q only, we can create another class or method called the adapter which will take the class P and convert it to class Q. An e.q. in Java is Arrays.asList(array).

Implemented in **StudentAdapter**.

## Strategy Pattern
It is a behavioural design pattern. It basically suggests to use a Has-A relationship instead of Is-A relationship.
E.g. A class has a method, which it’s subclasses implement. Now many subclasses will have different implementation of their own but some classes might have same implementation for that method. In this case we will be duplicating our code. To fix this, comes the strategy pattern. Instead of that method, we will add it to an interface. Different classes will implement that method and then the class can just have the implementation of whichever it wants. This way we have made that method a behaviour of the class. This also provides us a way to change the behaviour of a class at run time (dynamically).

Implemented in **Vehicle** and **GearSystem**.

More info [here](https://medium.com/javarevisited/strategy-pattern-in-java-6e97304bf5e5).

## Observer Pattern
It is a behavioural design pattern where when an object’s state changes, we need to notify other objects which have subscribed to it (want to be notified whenever the first object changes).
E.g. Amazon Notify me button when a product comes back in stock. This uses observer pattern, where when the stock changes for the item all the subscribers who have notified will be notified.

Implemented in **StockObservable**.

## Decorator Pattern
It is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors. It has both is-a and a has-a relationship. Basically it extends an abstract class and also has the super class as a variable. 
