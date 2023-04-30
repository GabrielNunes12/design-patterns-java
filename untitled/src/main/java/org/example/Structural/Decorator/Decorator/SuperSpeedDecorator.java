package org.example.Structural.Decorator.Decorator;

import org.example.Structural.Decorator.Interface.Toy;

public class SuperSpeedDecorator implements Toy {
  private final Toy toy;

  public SuperSpeedDecorator(Toy toy) {
    this.toy = toy;
  }

  @Override
  public String description() {
    return toy.description() + ", and I HAVE SUPER SPEED!";
  }
}
