package org.example.Structural.Composite.Classes;

import org.example.Structural.Composite.Interface.Component;

public class Car implements Component {
  private String name;

  public Car(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void display() {
    System.out.println(name);
  }
}
