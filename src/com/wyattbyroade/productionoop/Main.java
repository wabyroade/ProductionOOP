package com.wyattbyroade.productionoop;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {

    ArrayList<Product> products;

    products = testCollection();

    Collections.sort(products);

    print(products);
  }

  private static ArrayList<Product> testCollection() {
    ArrayList<Product> products = new ArrayList<>();

    AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
            new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
            new Screen("1366x768", 40, 22), MonitorType.LED);

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  private static void print(ArrayList<Product> inputArrayList) {
    for (Product thisProduct : inputArrayList) {
      System.out.println(thisProduct);
    }
  }
}

