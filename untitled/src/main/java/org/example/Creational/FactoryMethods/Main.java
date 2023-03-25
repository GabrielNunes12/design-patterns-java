package org.example.Creational.FactoryMethods;

import org.example.Creational.FactoryMethods.Factories.PaymentFactory;
import org.example.Creational.FactoryMethods.Interfaces.PaymentGateway;

public class Main {
  public static void main(String[] args) {
    PaymentGateway stripeGateway = PaymentFactory.gateway("stripe".toUpperCase());
    PaymentGateway paypalGateway = PaymentFactory.gateway("paypal".toUpperCase());
    PaymentGateway squareGateway = PaymentFactory.gateway("square".toUpperCase());
    //will throw an error saying (Invalid argument)
    PaymentGateway invalidGateway = PaymentFactory.gateway("aa".toUpperCase());

    System.out.println("[" + stripeGateway + paypalGateway + squareGateway + invalidGateway + "]");
  }
}
