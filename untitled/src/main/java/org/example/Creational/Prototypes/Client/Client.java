package org.example.Creational.Prototypes.Client;

import org.example.Creational.Prototypes.Interfaces.Animal;
import org.example.Creational.Prototypes.Registry.AnimalRegistry;

public class Client {
  public static void main(String[] args) {
    Animal clonedSheep = AnimalRegistry.getAnimal("Sheep");
    Animal clonedDog = AnimalRegistry.getAnimal("Dog");
  }
}
