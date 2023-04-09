package org.example.Structural.Adapter.Model;

public class SecondsToMilliSecondsAdapter {
  private Long seconds;
  public SecondsToMilliSecondsAdapter() {
  }

  public SecondsToMilliSecondsAdapter(Long seconds) {
    this.seconds = seconds;
  }

  public Long getSeconds() {
    return seconds * 1000;
  }

  public void setSeconds(Long seconds) {
    this.seconds = seconds;
  }
}
