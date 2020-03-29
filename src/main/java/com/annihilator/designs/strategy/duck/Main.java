package com.annihilator.designs.strategy.duck;

import com.annihilator.designs.strategy.duck.behavior.fly.FlyWithWings;
import com.annihilator.designs.strategy.duck.behavior.quack.Squeak;

public class Main {
  public static void main(String[] args) {
    Duck mallardDuck = new Duck(new Squeak(), new FlyWithWings());
    mallardDuck.performFly();
    mallardDuck.performQuack();
  }
}
