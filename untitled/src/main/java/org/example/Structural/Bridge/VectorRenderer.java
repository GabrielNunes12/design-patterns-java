package org.example.Structural.Bridge;

public class VectorRenderer implements Renderer {
  public void renderCircle(float x, float y, float radius) {
    System.out.println("Drawing circle with VectorRenderer at (" + x + "," + y + ") with radius " + radius);
  }
}
