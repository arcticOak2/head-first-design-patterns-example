package com.annihilator.designs.singelton;

public class Singleton {

  private volatile static Singleton singleton;

  private Singleton() {
  }

  // Synchronizing at method level will be a bottleneck for multiple threads when the lazy loading will be done
  public static Singleton getInstance() {
    if (null == singleton) {
      synchronized (Singleton.class) {
        if (null == singleton) {
          singleton = new Singleton();
        }
      }
    }

    return singleton;
  }

  public void greet() {
    System.out
        .println("Hey there, if you have come till this code, don't forget to star the repo :)");
  }
}
