package org.example.Structural.Bridge;

public class RasterRenderer implements Renderer {
  public void renderCircle(float x, float y, float radius) {
    System.out.println("Drawing circle with RasterRenderer at (" + x + "," + y + ") with radius " + radius);
  }
}