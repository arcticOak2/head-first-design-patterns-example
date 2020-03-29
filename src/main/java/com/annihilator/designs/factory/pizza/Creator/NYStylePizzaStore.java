package com.annihilator.designs.factory.pizza.Creator;

import com.annihilator.designs.factory.pizza.PizzaMenu.Menu;
import com.annihilator.designs.factory.pizza.product.Pizza;
import com.annihilator.designs.factory.pizza.product.types.NYStyleCheesePizza;
import com.annihilator.designs.factory.pizza.product.types.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

  public Pizza createPizza(Menu item) {
    if (item.equals(Menu.CHEESE))
      return new NYStyleCheesePizza();
    else if(item.equals(Menu.VEGGIE))
      return new NYStyleVeggiePizza();
    else
      return null;
  }
}
