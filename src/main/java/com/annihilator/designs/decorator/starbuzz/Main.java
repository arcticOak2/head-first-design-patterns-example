package com.annihilator.designs.decorator.starbuzz;

import com.annihilator.designs.decorator.starbuzz.condiment.Mocha;
import com.annihilator.designs.decorator.starbuzz.recipe.Beverage;
import com.annihilator.designs.decorator.starbuzz.recipe.Expresso;

public class Main {

  public static void main(String[] args) {

    // Expresso with double Mocha

    Beverage bvg = new Expresso();
    System.out.println(bvg.getDescription());

    bvg = new Mocha(bvg);
    bvg = new Mocha(bvg);

    System.out.println(bvg.getCost());

  }
}
