package org.example.Creational.FactoryMethods.Gateways;

import org.example.Creational.FactoryMethods.Interfaces.PaymentGateway;

public class SquareGateway implements PaymentGateway {
  @Override
  public void authorize() {

  }

  @Override
  public void capture() {

  }

  @Override
  public void nothing() {

  }
  @Override
  public String toString() {
    return "SquareGateway{}";
  }
}
