package com.annihilator.designs.factory.pizza.product.types;

import com.annihilator.designs.factory.pizza.product.Pizza;

public class NYStyleVeggiePizza extends Pizza {
  public NYStyleVeggiePizza() {
      name = "NY Style Sauce and Veggie Pizza";
      dough = "Thin Crust Dough";
      sauce = "Marinara Sauce";

      toppings.add("Grated Reggiano Cheese");
  }
}
