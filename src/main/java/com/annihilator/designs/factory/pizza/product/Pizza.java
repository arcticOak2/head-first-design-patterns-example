package com.annihilator.designs.factory.pizza.product;

import java.util.ArrayList;

public abstract class Pizza {

  protected String name;
  protected String dough;
  protected String sauce;

  protected ArrayList<String> toppings = new ArrayList<String>();

  // This should be abstract as it's not close for the modification.
  // Different Pizzas can have different implementation of this

  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough....");
    System.out.println("Adding sauce....");
    System.out.println("Adding toppings: ");
    for (String topping : toppings) {
      System.out.println(" " + topping);
    }
  }

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place pizza in official pizza store box");
  }
}
