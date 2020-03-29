package com.annihilator.designs.observer.weather.display;

import com.annihilator.designs.observer.weather.core.Observer;

public class CurrentConditionDisplay implements Observer {

  private float temperature;

  private float humidity;

  private float pressure;

  public void update(float temperature, float pressure, float humidity) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;

    display();
  }

  public void display() {
    System.out.println(String
        .format("temperature: %f\npressure: %f\nhumidity: %f", temperature, pressure, humidity));
  }
}
