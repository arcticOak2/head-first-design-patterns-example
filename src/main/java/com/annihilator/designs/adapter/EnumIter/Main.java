package com.annihilator.designs.adapter.EnumIter;

import com.annihilator.designs.adapter.EnumIter.EnumerationIterator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    Hashtable<String, String> map = new Hashtable<String, String>();
    map.put("name", "Abhijeet Kumar");
    map.put("address", "Bangalore, India");
    map.put("email", "searchabhijeet@gmail.com");
    Enumeration<String> elements = map.elements();
    Iterator enumerationIterator = new EnumerationIterator(elements);
    while (enumerationIterator.hasNext()) {
      System.out.println(enumerationIterator.next());
    }
    enumerationIterator.remove();
  }
}
