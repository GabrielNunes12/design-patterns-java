## Decorator pattern
Imagine you have a toy box, and each toy in the box has a special power. Some toys can glow in the dark, some can make noise, and others can move by themselves. But what if you want to make a new toy that has all of these special powers?

That's where the decorator design pattern comes in! It lets you take a basic toy and add special powers to it one by one, like putting stickers on a toy.

Let's use a code example to explain this. Say we have a basic toy interface called `Toy`, which has a method `description()` that returns a description of the toy:
```java
public interface Toy {
    String description();
}
```
Now let's say we want to create a new toy that can glow in the dark. We can create a decorator called `GlowingToyDecorator` that adds this special power to a basic toy:
````java
public class GlowingToyDecorator implements Toy {
    private final Toy toy;

    public GlowingToyDecorator(Toy toy) {
        this.toy = toy;
    }

    public String getDescription() {
        return toy.description() + ", and it glows in the dark!";
    }
}
````
The `GlowingToyDecorator` takes a basic toy in its constructor and stores it in a field. When `description()` is called, it first calls the original toy's getDescription() method and then adds ", and it glows in the dark!" to the end of the description.

We can now use the `GlowingToyDecorator` to add this special power to any toy we want, like this:
````java
public class main {
  public static void main(String[] args) {
    Toy basicToy = new BasicToy();
    Toy glowingToy = new GlowingToyDecorator(basicToy);
    System.out.println(glowingToy.description()); // prints "I'm a basic toy, and it glows in the dark!"
  }
}
````
Similarly, we can create other decorators like `NoisyToyDecorator` or `MovingToyDecorator` to add other special powers to a basic toy.

So just like how you can add stickers to your toys to make them special, you can use the decorator design pattern to add special powers to a basic toy!