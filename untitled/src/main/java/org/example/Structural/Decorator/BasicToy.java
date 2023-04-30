package org.example.Structural.Decorator;

import org.example.Structural.Decorator.Interface.Toy;

public class BasicToy implements Toy {

  public BasicToy() {};

  @Override
  public String description() {
    return "Basic toy";
  }
}
