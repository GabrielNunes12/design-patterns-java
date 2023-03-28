package org.example.Creational.AbstractFactory.Game;

import org.example.Creational.AbstractFactory.Entities.CharacterA;
import org.example.Creational.AbstractFactory.Entities.Faction;
import org.example.Creational.AbstractFactory.Interfaces.CharacterFactory;

public class Game {
  private CharacterFactory characterFactory;
  private Faction faction;
  private CharacterA characterA;

  public Game(CharacterFactory characterFactory) {
    this.characterFactory = characterFactory;
    this.faction = characterFactory.crateFaction();
    this.characterA = characterFactory.createCharacter();
  }
  public String play() {
    //printing out the name of the player and the faction's quantity
    return characterA.getName() + faction.getQuantity();
  }
}
