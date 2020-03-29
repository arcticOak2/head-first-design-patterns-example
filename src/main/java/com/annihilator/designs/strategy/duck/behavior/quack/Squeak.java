package com.annihilator.designs.strategy.duck.behavior.quack;

public class Squeak implements QuackingBehavior {
  public void quack() {
    System.out.println("Squeak Squeak!");
  }
}
