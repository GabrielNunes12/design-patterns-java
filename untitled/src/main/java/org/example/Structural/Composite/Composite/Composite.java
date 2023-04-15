package org.example.Structural.Composite.Composite;

import org.example.Structural.Composite.Interface.Component;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
  List<Component> componentList = new ArrayList<>();
  public void add(Component component) {
    componentList.add(component);
  }

  public void remove(Component component) {
    componentList.remove(component);
  }
  @Override
  public void display() {
    for (Component component : componentList) {
      component.display();
    }
  }
}
