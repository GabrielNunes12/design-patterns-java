package org.example.Creational.AbstractFactory.Entities;

public class CharacterA {
  private String name;
  private Faction faction;
  private String surname;
  private boolean alreadyMaximumLevel;

  public CharacterA() {
  }

  public CharacterA(String name, Faction faction, String surname, boolean alreadyMaximumLevel) {
    this.name = name;
    this.faction = faction;
    this.surname = surname;
    this.alreadyMaximumLevel = alreadyMaximumLevel;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Faction getFaction() {
    return faction;
  }

  public void setFaction(Faction faction) {
    this.faction = faction;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public boolean isAlreadyMaximumLevel() {
    return alreadyMaximumLevel;
  }

  public void setAlreadyMaximumLevel(boolean alreadyMaximumLevel) {
    this.alreadyMaximumLevel = alreadyMaximumLevel;
  }
}
