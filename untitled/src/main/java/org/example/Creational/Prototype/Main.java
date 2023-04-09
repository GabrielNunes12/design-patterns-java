package org.example.Creational.Prototype;

import org.example.Creational.Prototype.Model.Person;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    Person person1 = new Person("Alice");
    Person newPerson = person1.clone();
  }
}
