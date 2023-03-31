package org.example.Creational.Prototypes.Model;

import org.example.Creational.Prototypes.Interfaces.Animal;

public class Sheep implements Animal {
  public Sheep() {
    System.out.println("Sheep is made");
  }

  @Override
  public Animal getCopy() {
    System.out.println("Sheep is being made");
    try {
      return (Sheep) super.clone();
    } catch (CloneNotSupportedException exception) {
      exception.getStackTrace();
      return null;
    }
  }
}
