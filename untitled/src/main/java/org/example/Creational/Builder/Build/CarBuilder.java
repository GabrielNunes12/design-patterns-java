package org.example.Creational.Builder.Build;

public class CarBuilder {
  private String name;
  private String model;
  private String color;
  private int year;

  public CarBuilder(String name, String model, String color, int year) {
    this.name = name;
    this.model = model;
    this.color = color;
    this.year = year;
  }
  public static class Builder {
    private String name;
    private String model;
    private String color;
    private int year;

    public Builder(String name, String model, String color, int year) {
      this.name = name;
      this.model = model;
      this.color = color;
      this.year = year;
    }

    public Builder() {
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder model(String model) {
      this.model = model;
      return this;
    }


    public Builder color(String color) {
      this.color = color;
      return this;
    }


    public Builder year(int year) {
      this.year = year;
      return this;
    }
    public CarBuilder build() {
      return new CarBuilder(name, model, color, year);
    }
  }

  @Override
  public String toString() {
    return "CarBuilder{" +
            "name='" + name + '\'' +
            ", model='" + model + '\'' +
            ", color='" + color + '\'' +
            ", year=" + year +
            '}';
  }
}
