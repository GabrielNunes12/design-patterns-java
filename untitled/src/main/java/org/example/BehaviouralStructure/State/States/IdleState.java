package org.example.BehaviouralStructure.State.States;

import org.example.BehaviouralStructure.State.Context;
import org.example.BehaviouralStructure.State.Interfaces.State;

public class IdleState implements State {
  @Override
  public void handle(Context context) {
    System.out.println("Idle!!");
    context.setState(new WalkingState());
  }
}
