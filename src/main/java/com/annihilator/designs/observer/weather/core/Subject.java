package com.annihilator.designs.observer.weather.core;

import com.annihilator.designs.observer.weather.core.Observer;

public interface Subject {

  public void registerObserver(Observer o);

  public void removeObserver(Observer o);

  public void notifyObservers();
}
