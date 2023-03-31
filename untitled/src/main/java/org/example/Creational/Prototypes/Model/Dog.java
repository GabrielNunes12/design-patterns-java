package org.example.Creational.Prototypes.Model;

import org.example.Creational.Prototypes.Interfaces.Animal;

public class Dog implements Animal {
  @Override
  public Animal getCopy() {
    System.out.println("Dog is being made");
    try {
      return (Dog) super.clone();
    } catch (CloneNotSupportedException exception) {
      exception.getStackTrace();
      return null;
    }
  }

  public Dog() {
    System.out.println("Dog is made");
  }
}
