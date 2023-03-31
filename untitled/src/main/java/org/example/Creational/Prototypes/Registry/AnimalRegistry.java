package org.example.Creational.Prototypes.Registry;

import org.example.Creational.Prototypes.Interfaces.Animal;
import org.example.Creational.Prototypes.Model.Dog;
import org.example.Creational.Prototypes.Model.Sheep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {
  private static Map<String, Animal> animalMap = new HashMap<String, Animal>();
  static {
    animalMap.put("Sheep", new Sheep());
    animalMap.put("Dog", new Dog());
  }
  public static Animal getAnimal(String type) {
    Animal animal = null;
    try {
      animal = animalMap.get(type).getCopy();
    } catch (NullPointerException exception) {
      System.out.println("Null " + Arrays.toString(exception.getStackTrace()));
    }
    return animal;
  }
}
