package org.example.Creational.AbstractFactory.Factories;

import org.example.Creational.AbstractFactory.Entities.Archer;
import org.example.Creational.AbstractFactory.Entities.CharacterA;
import org.example.Creational.AbstractFactory.Entities.Faction;
import org.example.Creational.AbstractFactory.Entities.FactionB;
import org.example.Creational.AbstractFactory.Interfaces.CharacterFactory;

public class ArcherFactory implements CharacterFactory {
  @Override
  public CharacterA createCharacter() {
    return new Archer();
  }

  @Override
  public Faction crateFaction() {
    return new FactionB();
  }
}
