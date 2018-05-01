## Iterator Pattern

The Itertor Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representaion.

![alt text](https://raw.githubusercontent.com/ronniegnr/design-pattern/master/src/bd/com/ronnie/iterator/iterator.png)

In this example, both BreakfastMenu and LunchMenu classes have menuItems collection property. But BreakfastMenu used ArrayList and LunchMenu used Array for the collection implementaion. Waitress.printAllMenuItems() method is accessing over both menuItems property. We unified the accessing but using Iterator for both of the menuItems. Waitress.printAllMenuItems() did not need to know what it is accessing ArrayList or Array. Getting Iterator from ArrayList is easier as it already has iterator() method for this. For Array we wrote LunchMenuIterator which implements the Iterator interface.   
