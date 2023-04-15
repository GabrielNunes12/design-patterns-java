## Bridge pattern 
The Bridge pattern is used when you want to separate an abstraction from its implementation, so that both can vary independently. It is useful when you want to create multiple variants of a class or system, but don't want to create a new class hierarchy for each variant. Instead, you create two separate hierarchies: one for the abstraction (interface or abstract class) and one for the implementation.

Let's say you have a Shape class hierarchy with a few different shapes (Circle, Square, Triangle, etc.) and you want to add support for different rendering modes, like raster and vector. You could create a RasterRenderer and a VectorRenderer class hierarchy, but then you would end up with two class hierarchies that are tightly coupled together. Instead, you can use the Bridge pattern to separate the Shape hierarchy from the rendering hierarchy.

In this example, the Renderer interface is the bridge between the Shape hierarchy and the rendering hierarchy. The RasterRenderer and VectorRenderer classes are the concrete implementations of the Renderer interface. The Shape class is the abstraction, and the Circle class is a concrete implementation of the Shape class.

Now you can create multiple variants of the Shape class hierarchy and multiple variants of the rendering hierarchy, and they can all work together without any coupling between them. For example, you could create a Square class that also uses the Renderer interface to render itself, and you could create a 3DRenderer class that implements the Renderer interface to render shapes in 3D.

I hope that helps clarify the Bridge pattern a bit more!