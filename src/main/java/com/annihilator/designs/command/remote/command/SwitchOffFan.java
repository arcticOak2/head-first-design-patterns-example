package com.annihilator.designs.command.remote.command;

import com.annihilator.designs.command.appliances.Fan;
import com.annihilator.designs.command.appliances.State.Switch;

public class SwitchOffFan implements Command {
  Fan fan;
  Switch prevSwitch;

  public SwitchOffFan(Fan fan) {
    this.fan = fan;
    this.prevSwitch = Switch.NULL;
  }

  public void execute() {
    System.out.println("Switching off the fan");
    prevSwitch = fan.getMode();
    fan.switchOff();
  }

  public void undo() {
    switch(prevSwitch) {
      case HIGH:
        System.out.println("Switching on the fan");
        fan.switchOn();
        break;
      case OFF:
        System.out.println("Switching off the fan");
        fan.switchOff();
        break;
      case MEDIUM:
        System.out.println("Switching fan to the medium speed");
        fan.switchMedium();
        break;
      case LOW:
        System.out.println("Switching fan to the low speed");
        fan.switchLow();
        break;
    }
  }
}
