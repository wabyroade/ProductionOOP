package com.wyattbyroade.productionoop;

/**
 * The ScreenDriver class is used to instantiate and output string representation of a screen object.
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
public class ScreenDriver {
  public static void testScreen() {
    Screen screen1 = new Screen("640x480",40,22);
    System.out.println(screen1);
  }
}
