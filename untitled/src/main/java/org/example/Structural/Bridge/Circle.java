package org.example.Structural.Bridge;

public class Circle extends Shape {
  private float x, y, radius;

  public Circle(Renderer renderer, float x, float y, float radius) {
    super(renderer);
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  public void draw() {
    renderer.renderCircle(x, y, radius);
  }
}