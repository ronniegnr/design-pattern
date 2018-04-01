## Strategy Pattern

This pattern separates the aspects which will vary from the aspects which stays the same.

![alt text](https://raw.githubusercontent.com/ronniegnr/design-pattern/master/src/bd/com/ronnie/strategy/strategy.png)


In the above URL diagram Duck's Fly and Quack behavior is extracted and implemented via FlyBehavior and QuackBehavior. Any change is Fly or Quck behavior will not affect Duck implementations.

Strategy Pattern's formal definition is - 

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it 
