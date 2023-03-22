package org.example.BehaviouralStructure.State.States;

import org.example.BehaviouralStructure.State.Context;
import org.example.BehaviouralStructure.State.Interfaces.State;

public class WalkingState implements State {
  @Override
  public void handle(Context context) {
    System.out.println("Walking!!");
    context.setState(new AttackState());
  }
}
