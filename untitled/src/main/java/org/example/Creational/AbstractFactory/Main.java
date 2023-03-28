package org.example.Creational.AbstractFactory;

import org.example.Creational.AbstractFactory.Factories.ArcherFactory;
import org.example.Creational.AbstractFactory.Factories.WarriorFactory;
import org.example.Creational.AbstractFactory.Factories.WizardFactory;
import org.example.Creational.AbstractFactory.Game.Game;

public class Main {
  public static void main(String[] args) {
    Game game1 = new Game(new WarriorFactory());
    System.out.println(game1.play());
    Game game2 = new Game(new WizardFactory());
    System.out.println(game2.play());
    Game game3 = new Game(new ArcherFactory());
    System.out.println(game3.play());

  }
}
