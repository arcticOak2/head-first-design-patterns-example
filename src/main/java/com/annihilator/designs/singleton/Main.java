package com.annihilator.designs.singleton;

public class Main {

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    singleton.greet();
  }
}
