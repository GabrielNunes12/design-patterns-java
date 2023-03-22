package org.example.BehaviouralStructure.State;

import org.example.BehaviouralStructure.State.Interfaces.State;
import org.example.BehaviouralStructure.State.States.IdleState;

public class Main {
  /**
   *  This pattern is particularly useful when an object has a complex set of states and transitions between them,
   *  or when you want to encapsulate the state-specific logic to make the code more maintainable and flexible.
   */
  public static void main(String[] args) {
    //defining initial state
    State initialState = new IdleState();
    //creating our initial context
    Context context = new Context(initialState);
    for(int i = 0; i < 10; i++) {
      context.request();
    }
  }
}
