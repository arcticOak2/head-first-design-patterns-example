package com.annihilator.designs.decorator.starbuzz.recipe;

public abstract class Beverage {

  protected String description = "Empty";

  public String getDescription() {
    return description;
  }

  public abstract double getCost();
}
