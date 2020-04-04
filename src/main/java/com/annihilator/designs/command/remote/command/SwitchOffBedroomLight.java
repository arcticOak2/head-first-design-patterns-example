package com.annihilator.designs.command.remote.command;

import com.annihilator.designs.command.appliances.BedroomLight;
import com.annihilator.designs.command.appliances.State.Switch;

public class SwitchOffBedroomLight implements Command {

  BedroomLight light;
  Switch prevSwitch;

  public SwitchOffBedroomLight(BedroomLight light) {
    this.light = light;
    this.prevSwitch = Switch.NULL;
  }

  public void execute() {
    System.out.println("Switching off the light");
    prevSwitch = light.getMode();
    light.switchOff();
  }

  public void undo() {
    switch(prevSwitch) {
      case HIGH:
        System.out.println("Switching on the light");
        light.switchOn();
        break;
      case OFF:
        System.out.println("Switching off the light");
        light.switchOff();
        break;
      case MEDIUM:
        System.out.println("Switching light to dim");
        light.switchDim();
        break;
    }
  }
}
