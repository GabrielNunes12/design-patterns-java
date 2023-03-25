package org.example.Creational.Singleton;

public class Main {
  public static void main(String[] args) {
    Singleton newInstantiation = Singleton.getInstance();
    System.out.println(newInstantiation.printHelloWorldOnce());
  }
}
