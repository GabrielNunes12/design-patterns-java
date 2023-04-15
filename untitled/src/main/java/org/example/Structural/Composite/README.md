## Composite pattern
In programming, the Composite pattern is used to create objects that are made up of smaller objects. These smaller objects can be of the same type or different types. The Composite pattern allows you to treat the smaller objects and the larger object as the same thing. This means you can add, remove, or modify any part of the structure without affecting the rest of the structure.

In this example, we have a Component interface that defines a display() method. We have two classes that implement this interface: Car and Composite.

Car represents a car node in a tree structure. It has a name attribute and its display() method simply prints out its name.

Composite represents a composite node in a tree structure. It has a list of Component objects as its children. It has add() and remove() methods for adding and removing children, and its display() method recursively calls display() on all of its children.

In the Main class, we create a tree structure by creating several Composite and Leaf objects and adding them to each other. We then call display() on the top-level Composite object, which recursively calls display() on all of its children and their children, and so on.