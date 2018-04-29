## Command Pattern

Command patter is used to decouple requester and the action.

![alt text](https://raw.githubusercontent.com/ronniegnr/design-pattern/master/src/bd/com/ronnie/observer/command.png)


Here RemoteControl object has no knowledge about light or fan's on/off action. Command objects are attached to RemoteControll and the Command objects take care of the action.  

Command Pattern's formal definition is - 

The Commnad Pattern decouples the requester of an action from the object that actually performs the action.
