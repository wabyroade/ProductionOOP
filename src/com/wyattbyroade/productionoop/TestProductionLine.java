package com.wyattbyroade.productionoop;

/**
 * The class TestProductionLine is merely a driver for testing other classes and methods.
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
public class TestProductionLine {

  /**
   * Driver to test various features of Production application
   */
  public static void testProductionLine() {
    EmployeeInfo thisEmployee = new EmployeeInfo();
    System.out.println(thisEmployee);
    ProcessFiles fileOutput = new ProcessFiles();
    try {
      fileOutput.WriteFile(thisEmployee);
    }
    catch (Exception e) {
      System.err.println("Failed to write employee data to file");
    }

    try {
      fileOutput.WriteFile(Main.products);
    }
    catch (Exception e) {
      System.err.println("Failed to products ArrayList data to file");
    }



//    for (Product thisProduct : Main.products) {
//      System.out.println(thisProduct);
//    }

  }
}
