package com.annihilator.designs.observer.weather;

import com.annihilator.designs.observer.weather.display.CurrentConditionDisplay;

public class Main {

  public static void main(String[] args) {
    WeatherData ed = new WeatherData();
    CurrentConditionDisplay cd = new CurrentConditionDisplay();
    ed.registerObserver(cd);
    ed.setMeasurements(22,12,38);
  }
}
