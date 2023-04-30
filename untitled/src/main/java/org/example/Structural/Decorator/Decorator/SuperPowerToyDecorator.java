package org.example.Structural.Decorator.Decorator;

import org.example.Structural.Decorator.Interface.Toy;

public class SuperPowerToyDecorator implements Toy {
  private final Toy toy;
  public SuperPowerToyDecorator(Toy toy) {
    this.toy = toy;
  }
  @Override
  public String description() {
    return toy.description() + ", SUPER POWER ON!";
  }
}
