package org.example.Creational.AbstractFactory.Factories;

import org.example.Creational.AbstractFactory.Entities.CharacterA;
import org.example.Creational.AbstractFactory.Entities.Faction;
import org.example.Creational.AbstractFactory.Entities.FactionC;
import org.example.Creational.AbstractFactory.Entities.Warrior;
import org.example.Creational.AbstractFactory.Interfaces.CharacterFactory;

public class WarriorFactory implements CharacterFactory {

  @Override
  public CharacterA createCharacter() {
    return new Warrior();
  }

  @Override
  public Faction crateFaction() {
    return new FactionC();
  }
}
