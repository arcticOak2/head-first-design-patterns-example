package com.annihilator.designs.factory.pizza;

import com.annihilator.designs.factory.pizza.Creator.ChicagoStylePizzaStore;
import com.annihilator.designs.factory.pizza.Creator.NYStylePizzaStore;
import com.annihilator.designs.factory.pizza.Creator.PizzaStore;
import com.annihilator.designs.factory.pizza.PizzaMenu.Menu;

public class Main {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYStylePizzaStore();
    PizzaStore chicagoStore = new ChicagoStylePizzaStore();

    nyStore.orderPizza(Menu.CHEESE);
    System.out.println("___________________________________");
    chicagoStore.orderPizza(Menu.CHEESE);
  }
}
