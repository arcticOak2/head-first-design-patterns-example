package com.annihilator.designs.observer.weather.core;

public interface Observer {

  public void display();

  public void update(float temperature, float pressure, float humidity);
}
