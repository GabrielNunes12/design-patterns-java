package org.example.Creational.FactoryMethods.Factories;

import org.example.Creational.FactoryMethods.Gateways.PaypalGateway;
import org.example.Creational.FactoryMethods.Gateways.SquareGateway;
import org.example.Creational.FactoryMethods.Gateways.StripeGateway;
import org.example.Creational.FactoryMethods.Interfaces.PaymentGateway;

public class PaymentFactory {
  public static PaymentGateway gateway(String arg) {
    switch (arg) {
      case "PAYPAL":
        return new PaypalGateway();
      case "STRIPE":
        return new StripeGateway();
      case "SQUARE":
        return new SquareGateway();
      default:
        throw new IllegalArgumentException("Invalid argument!");
    }
  }
}
