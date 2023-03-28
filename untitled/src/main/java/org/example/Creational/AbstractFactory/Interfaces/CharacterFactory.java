package org.example.Creational.AbstractFactory.Interfaces;

import org.example.Creational.AbstractFactory.Entities.CharacterA;
import org.example.Creational.AbstractFactory.Entities.Faction;

public interface CharacterFactory {
  public CharacterA createCharacter();
  public Faction crateFaction();

}
