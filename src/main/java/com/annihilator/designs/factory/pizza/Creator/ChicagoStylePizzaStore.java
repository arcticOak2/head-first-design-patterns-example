package com.annihilator.designs.factory.pizza.Creator;

import com.annihilator.designs.factory.pizza.PizzaMenu.Menu;
import com.annihilator.designs.factory.pizza.product.Pizza;
import com.annihilator.designs.factory.pizza.product.types.ChicagoStyleCheesePizza;
import com.annihilator.designs.factory.pizza.product.types.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

  public Pizza createPizza(Menu item) {
    if (item.equals(Menu.CHEESE))
      return new ChicagoStyleCheesePizza();
    else if(item.equals(Menu.VEGGIE))
      return new ChicagoStyleVeggiePizza();
    else
      return null;
  }
}
