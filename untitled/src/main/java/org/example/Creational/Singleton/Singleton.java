package org.example.Creational.Singleton;

public class Singleton {
  private static Singleton instance;
  private Singleton() {
  }
  public static Singleton getInstance() {
    if(instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
  public static String printHelloWorldOnce() {
    return "Hello, World!";
  }
}
