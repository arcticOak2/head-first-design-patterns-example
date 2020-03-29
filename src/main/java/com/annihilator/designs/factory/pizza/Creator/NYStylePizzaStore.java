package com.annihilator.designs.factory.pizza.Creator;

import com.annihilator.designs.factory.pizza.product.Pizza;
import com.annihilator.designs.factory.pizza.product.types.NYStyleCheesePizza;
import com.annihilator.designs.factory.pizza.product.types.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

  public Pizza createPizza(String item) {
    if (item.equals("cheese"))
      return new NYStyleCheesePizza();
    else if(item.equals("veggie"))
      return new NYStyleVeggiePizza();
    else
      return null;
  }
}
