package org.example.Structural.Decorator;

import org.example.Structural.Decorator.Decorator.SuperPowerToyDecorator;
import org.example.Structural.Decorator.Decorator.SuperSpeedDecorator;
import org.example.Structural.Decorator.Interface.Toy;

public class Main {
  public static void main(String[] args) {
    Toy basicToy = new BasicToy();
    Toy superPowerToy = new SuperPowerToyDecorator(basicToy);
    Toy superSpeed = new SuperSpeedDecorator(superPowerToy);
    System.out.println(superSpeed.description());
  }
}
