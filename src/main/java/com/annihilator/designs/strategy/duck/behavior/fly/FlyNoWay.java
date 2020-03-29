package com.annihilator.designs.strategy.duck.behavior.fly;

public class FlyNoWay implements FlyBehavior {
  public void fly() {
    System.out.println("I can't fly!");
  }
}
