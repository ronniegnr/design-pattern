## Template Method Pattern

The Template Method Pattern defines the skeleton of an algorithm in method, defining some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

![alt text](https://raw.githubusercontent.com/ronniegnr/design-pattern/master/src/bd/com/ronnie/template/template.png)

In this example we defined beverage preperation algorithm in BeverageTemplate class. BeverageTemplate.prepareBeverage() is the template method. This preperation has four steps, two of those are implemented in BeverageTemplate others are left for teh sub classes. Thus the template method outlined the beverage preperation process and let sub classes complete the whole process.
