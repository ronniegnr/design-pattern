## Factory Pattern

FactoryPattern is used to encapsulate instantiations of concrete types.

![alt text](https://raw.githubusercontent.com/ronniegnr/design-pattern/master/src/bd/com/ronnie/factory/factory.png)


In the above UML diagram PizzaStore class has an abstract version of createPizza method. NYPizzaStore and ChicagoPizzaStore extented PizzaStore and they has their own implementatio of createPizza. Thus subclasses are deciding how to instantiate.  

Factory Pattern's formal definition is - 

The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses. 
