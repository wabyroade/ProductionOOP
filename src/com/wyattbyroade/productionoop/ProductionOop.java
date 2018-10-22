package com.wyattbyroade.productionoop;

/**
* The Production OOP program is a mock manufacturing management
* application that makes use of several tenets of object oriented
* design and programming.
*
* @author  Wyatt Byroade
* @version 1.0
* @since   2018-09-29
*/

//added a useless comment to test git command line
// - wyatt 10/22/18
public class ProductionOop {

  public static void main(String[] args) {
    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.code);
    }
  }
}

class Widget extends Product {

  Widget(String name) {
    super(name);
  }
}
