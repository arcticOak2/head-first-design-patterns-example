package com.annihilator.designs.decorator.starbuzz.condiment;

import com.annihilator.designs.decorator.starbuzz.recipe.Beverage;

public class Mocha extends Condiment {

  private Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
    this.description = "Added Mocha";
  }

  public String getDescription() {
    return description;
  }

  public double getCost() {
    return 1 + beverage.getCost();
  }
}
