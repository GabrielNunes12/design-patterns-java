package org.example.BehaviouralStructure.State.States;

import org.example.BehaviouralStructure.State.Context;
import org.example.BehaviouralStructure.State.Interfaces.State;

public class AttackState implements State {

  @Override
  public void handle(Context context) {
    System.out.println("Attacking!!");
    context.setState(new BlockingState());
  }

}
