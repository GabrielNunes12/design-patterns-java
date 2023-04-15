package org.example.Structural.Composite;

import org.example.Structural.Composite.Classes.Car;
import org.example.Structural.Composite.Composite.Composite;

public class main {
  public static void main(String[] args) {
    Composite composite = new Composite();
    composite.add(new Car("Lenovo"));
    composite.add(new Car("Ford ka"));
    Composite composite1 = new Composite();
    composite1.add(new Car("BMW"));
    composite1.add(new Car("Rolls royce"));
    composite1.display();
  }
}
