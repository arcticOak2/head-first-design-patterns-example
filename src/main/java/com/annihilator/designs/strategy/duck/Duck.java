package com.annihilator.designs.strategy.duck;

import com.annihilator.designs.strategy.duck.behavior.fly.FlyBehavior;
import com.annihilator.designs.strategy.duck.behavior.quack.QuackingBehavior;

public class Duck {

  private QuackingBehavior quackingBehavior;

  private FlyBehavior flyBehavior;

  public Duck(QuackingBehavior quackingBehavior, FlyBehavior flyBehavior) {
    this.quackingBehavior = quackingBehavior;
    this.flyBehavior = flyBehavior;
  }

  public FlyBehavior getFlyBehavior() {
    return flyBehavior;
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public QuackingBehavior getQuackingBehavior() {
    return quackingBehavior;
  }

  public void setQuackingBehavior(
      QuackingBehavior quackingBehavior) {
    this.quackingBehavior = quackingBehavior;
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackingBehavior.quack();
  }
}
