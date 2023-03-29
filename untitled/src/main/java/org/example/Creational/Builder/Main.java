package org.example.Creational.Builder;

import org.example.Creational.Builder.Build.CarBuilder;

public class Main {
  public static void main(String[] args) {
    CarBuilder car = new CarBuilder.Builder()
            .model("Yikes")
            .name("Juah")
            .color("Black")
            .year(2020)
            .build();
    System.out.println(car.toString());
  }
}
