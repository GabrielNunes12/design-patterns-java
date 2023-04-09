package org.example.Structural.Adapter;
import org.example.Structural.Adapter.Model.SecondsToMilliSecondsAdapter;

public class Main {
  public static void main(String[] args) {
    Long seconds = 10000L;
    SecondsToMilliSecondsAdapter adapter = new SecondsToMilliSecondsAdapter(seconds);
    long timeInMillis = adapter.getSeconds();
  }
}
