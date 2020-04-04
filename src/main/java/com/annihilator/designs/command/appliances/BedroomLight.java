package com.annihilator.designs.command.appliances;

import com.annihilator.designs.command.appliances.State.Switch;

public class BedroomLight {

  private Switch mode;

  public Switch getMode() {
    return mode;
  }

  public BedroomLight() {
    this.mode = Switch.OFF;
  }

  public void switchOn() {
    mode = Switch.HIGH;
  }

  public void switchOff() {
    mode = Switch.OFF;
  }

  public void switchDim() {
    mode = Switch.MEDIUM;
  }
}
