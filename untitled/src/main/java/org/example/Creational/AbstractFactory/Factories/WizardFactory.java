package org.example.Creational.AbstractFactory.Factories;

import org.example.Creational.AbstractFactory.Entities.CharacterA;
import org.example.Creational.AbstractFactory.Entities.Faction;
import org.example.Creational.AbstractFactory.Entities.FactionD;
import org.example.Creational.AbstractFactory.Entities.Wizard;
import org.example.Creational.AbstractFactory.Interfaces.CharacterFactory;

public class WizardFactory implements CharacterFactory {
  @Override
  public CharacterA createCharacter() {
    return new Wizard();
  }

  @Override
  public Faction crateFaction() {
    return new FactionD();
  }
}
