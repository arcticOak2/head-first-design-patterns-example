package com.annihilator.designs.factory.pizza.product.types;

import com.annihilator.designs.factory.pizza.product.Pizza;

public class NYStyleCheesePizza extends Pizza {
  public NYStyleCheesePizza() {
    name = "NY Style Sauce and Cheese Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";

    toppings.add("Grated Reggiano Cheese");
  }
}
