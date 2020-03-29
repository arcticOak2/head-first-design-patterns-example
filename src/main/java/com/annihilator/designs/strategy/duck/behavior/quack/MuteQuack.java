package com.annihilator.designs.strategy.duck.behavior.quack;

public class MuteQuack implements QuackingBehavior {

  public void quack() {
    System.out.println("I can't Quack!");
  }
}
