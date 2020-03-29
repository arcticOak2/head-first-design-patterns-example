package com.annihilator.designs.observer.weather;

import com.annihilator.designs.observer.weather.core.Observer;
import com.annihilator.designs.observer.weather.core.Subject;
import java.util.ArrayList;

public class WeatherData implements Subject {

  private ArrayList<Observer> observers;

  private float temperature;

  private float pressure;

  private float humidity;

  public WeatherData() {
    observers = new ArrayList<Observer>();
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void notifyObservers() {
    for (Observer obs : observers) {
      obs.update(this.temperature, this.pressure, this.humidity);
    }
  }

  private void measurementChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float pressure, float humidity) {
    this.temperature = temperature;
    this.pressure = pressure;
    this.humidity = humidity;
    measurementChanged();
  }
}
