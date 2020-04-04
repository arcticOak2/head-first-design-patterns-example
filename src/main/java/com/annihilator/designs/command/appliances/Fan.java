package com.annihilator.designs.command.appliances;

import com.annihilator.designs.command.appliances.State.Switch;

public class Fan {
  private Switch mode;

  public Fan() {
    mode = Switch.OFF;
  }

  public Switch getMode() {
    return mode;
  }

  public void switchOn() {
    mode = Switch.HIGH;
  }

  public void switchOff() {
    mode = Switch.OFF;
  }

  public void switchLow() {
    mode = Switch.LOW;
  }

  public void switchMedium() {
    mode = Switch.MEDIUM;
  }
}
