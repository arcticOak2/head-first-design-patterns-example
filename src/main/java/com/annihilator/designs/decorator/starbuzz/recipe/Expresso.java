package com.annihilator.designs.decorator.starbuzz.recipe;

public class Expresso extends Beverage {

  public Expresso(){
    this.description = "Hey, are you excited to have some hot Expresso";
  }

  public double getCost() {
    return 2.5;
  }
}
