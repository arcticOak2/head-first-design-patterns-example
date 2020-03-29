package com.annihilator.designs.factory.pizza.Creator;

import com.annihilator.designs.factory.pizza.PizzaMenu.Menu;
import com.annihilator.designs.factory.pizza.product.Pizza;

public abstract class PizzaStore {
  public Pizza orderPizza(Menu type) {
    Pizza pizza;

    pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  public abstract Pizza createPizza(Menu type);
}
