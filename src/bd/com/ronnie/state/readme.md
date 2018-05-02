## State Pattern

The State Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

![alt text](https://raw.githubusercontent.com/ronniegnr/design-pattern/master/src/bd/com/ronnie/state/state.png)

By using State Pattern, any state behavior is stored in the State object. Thats why adding any new state needs less conditional code. In this example Fan object has an action pullChain(). This action changes the Fan's state in cycle order, Off to Low, Low to High, High to Off. Fan object holds the current state and delegates the pull chain action to it.  
