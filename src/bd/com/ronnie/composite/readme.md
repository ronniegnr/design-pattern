## Composite Pattern

The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

![alt text](https://raw.githubusercontent.com/ronniegnr/design-pattern/master/src/bd/com/ronnie/composite/composite.png)

In this example Menu and MenuItem both are extended from MenuComponent. According to Composite Pattern MenuComponent is the Component class, Menu is the Composite class and MenuItem is the Leaf class. Menu can hold list of Menu or MenuItem thus forming a tree structure. And Menu and MenuItems can be treated equally. 
