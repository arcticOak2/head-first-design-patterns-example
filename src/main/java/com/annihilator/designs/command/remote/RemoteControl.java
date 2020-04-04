package com.annihilator.designs.command.remote;

import com.annihilator.designs.command.remote.command.Command;
import com.annihilator.designs.command.remote.command.NoCommand;

public class RemoteControl {

  private Command[] switchOnCommands;
  private Command[] switchOffCommands;
  private Command undoCommand;

  public RemoteControl() {
    switchOnCommands = new Command[2];
    switchOffCommands = new Command[2];

    NoCommand noCommand = new NoCommand();
    undoCommand = noCommand;

    for (int i = 0; i < switchOnCommands.length; i++) {
      switchOnCommands[i] = noCommand;
      switchOffCommands[i] = noCommand;
    }
  }

  public void setCommands(int slot, Command switchOnCommands, Command switchOffCommands) {
    this.switchOnCommands[slot] = switchOnCommands;
    this.switchOffCommands[slot] = switchOffCommands;
  }

  public void onButtonWasPressed(int slot) {
    switchOnCommands[slot].execute();
    undoCommand = switchOnCommands[slot];
  }

  public void offButtonWasPressed(int slot) {
    switchOffCommands[slot].execute();
    undoCommand = switchOffCommands[slot];
  }

  public void undoWasPressed() {
    undoCommand.undo();
  }
}
