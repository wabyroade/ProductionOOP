package com.wyattbyroade.productionoop;

import java.util.ArrayList;
import java.util.Collections;

 /**
 * The Main class serves as the driver for the rest of the classes in the package.
 *
 * @author      Wyatt Byroade
 * @version     0.8 Beta
 */
public class Main {

   /**
   * The main method to run upon execution of the application to test various output.
   * <p>
   * this code includes source code from Repl.it for JPP 16 by prof. Scott Vanselow.
   * </p>
   *
   * @param  args  String array, not used in this version.
   */
  public static void main(String[] args) {

    ArrayList<Product> products;

    products = testCollection();

    Collections.sort(products);

    print(products);
  }

   /**
    * The testCollection method instantiates objects of multiple types that are derived from Product.
    *
    * @return  ArrayList&lt;Product&gt; containing the test objects instantiated
    */
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

   /**
    * The print method loops through ArrayList passed to it and prints the String representation of each to the console.
    *
    * @param  inputArrayList  ArrayList&lt;Product&gt; all objects of classes derived from Product
    */
  private static void print(ArrayList<Product> inputArrayList) {
    for (Product thisProduct : inputArrayList) {
      System.out.println(thisProduct);
    }
  }
}

