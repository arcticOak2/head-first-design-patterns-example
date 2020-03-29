package com.annihilator.designs.factory.pizza.Creator;

import com.annihilator.designs.factory.pizza.product.Pizza;
import com.annihilator.designs.factory.pizza.product.types.ChicagoStyleCheesePizza;
import com.annihilator.designs.factory.pizza.product.types.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

  public Pizza createPizza(String item) {
    if (item.equals("cheese"))
      return new ChicagoStyleCheesePizza();
    else if(item.equals("veggie"))
      return new ChicagoStyleVeggiePizza();
    else
      return null;
  }
}
