package org.example.Creational.Prototype.Model;

public class Person implements Cloneable {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public Person() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  @Override
  public Person clone() throws CloneNotSupportedException {
    return (Person) super.clone();
  }
}
