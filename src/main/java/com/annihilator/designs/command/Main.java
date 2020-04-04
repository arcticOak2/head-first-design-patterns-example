package com.annihilator.designs.command;

import com.annihilator.designs.command.appliances.BedroomLight;
import com.annihilator.designs.command.appliances.Fan;
import com.annihilator.designs.command.remote.RemoteControl;
import com.annihilator.designs.command.remote.command.Command;
import com.annihilator.designs.command.remote.command.SwitchOffBedroomLight;
import com.annihilator.designs.command.remote.command.SwitchOffFan;
import com.annihilator.designs.command.remote.command.SwitchOnBedroomLight;
import com.annihilator.designs.command.remote.command.SwitchOnFan;

public class Main {

  public static void main(String[] args) {
    RemoteControl control = new RemoteControl();
    Fan fan = new Fan();
    Command offFan = new SwitchOffFan(fan);
    Command onFan = new SwitchOnFan(fan);

    BedroomLight bedroomLight = new BedroomLight();

    SwitchOnBedroomLight onBedroomLight = new SwitchOnBedroomLight(bedroomLight);
    SwitchOffBedroomLight offBedroomLight = new SwitchOffBedroomLight(bedroomLight);

    control.setCommands(0, onFan, offFan);
    control.setCommands(1, onBedroomLight, offBedroomLight);

    control.onButtonWasPressed(0);
    control.offButtonWasPressed(0);
    control.undoWasPressed();

    control.onButtonWasPressed(0);

    control.onButtonWasPressed(1);
    control.undoWasPressed();
  }
}
