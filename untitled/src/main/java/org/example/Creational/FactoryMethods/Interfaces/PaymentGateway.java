package org.example.Creational.FactoryMethods.Interfaces;

public interface PaymentGateway {
  void authorize();
  void capture();
  void nothing();
}
