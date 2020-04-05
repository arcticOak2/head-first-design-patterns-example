package com.annihilator.designs.adapter.EnumIter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {

  Enumeration enumeration;

  public EnumerationIterator(Enumeration enumeration) {
    this.enumeration = enumeration;
  }

  public boolean hasNext() {
    return enumeration.hasMoreElements();
  }

  public Object next() {
    return enumeration.nextElement();
  }

  public void remove() {
    throw new UnsupportedOperationException(
        "Enumeration just don't support remove, it's a read only interface.");
  }
}
