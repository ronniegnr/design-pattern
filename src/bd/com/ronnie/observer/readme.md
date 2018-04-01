## Observer Pattern

When few elements needs to be notified on a elements state change, observer pattern is used.

![alt text](https://raw.githubusercontent.com/ronniegnr/design-pattern/master/src/bd/com/ronnie/observer/observer.png)


In the above UML diagram WeatherData is an Subject, CurrentConditionsDisplay is an Observer. CurrentConditionsDisplay registers to WeatherData. Whenever WeatherData is changed, its registered observers update method is called. 

Observer Pattern's formal definition is - 

The Observer Pattern defines a one-to-many dependecy between objects so that when one object changes state, all of its dependents are notified and updated automatically.
