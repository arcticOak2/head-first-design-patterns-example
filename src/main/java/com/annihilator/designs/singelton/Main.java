package com.annihilator.designs.singelton;

public class Main {

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    singleton.greet();
  }
}
