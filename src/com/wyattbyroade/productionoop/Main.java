package com.wyattbyroade.productionoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * The Main class serves as the driver for the rest of the classes in the package.
 *
 * @author      Wyatt Byroade
 * @version     0.8 Beta
 */
public class Main {

  // arraylist to hold Product objects of various subtypes
  //public static ArrayList<Product> products;
  static ArrayList<Product> products = new ArrayList<>();
  static Scanner scan = new Scanner(System.in);

   /**
   * The main method to run upon execution of the application to test various output.
   * <p>
   * this code includes source code from Repl.it for JPP 16 by prof. Scott Vanselow.
   * </p>
   *
   * @param  args  String array, not used in this version.
   */
  public static void main(String[] args) {
    boolean exitCodeRecd = false;

    // Next 7 lines are test driver code; leave commented out for interactive mode
    //    products = testCollection();
    //    Collections.sort(products);
    //    ViewFileInfo.outputDataFileToConsole();
    //    Product.printType(MoviePlayer.class,products);
    //    print(products);
    //    EmployeeInfo thisEmployee = new EmployeeInfo();
    //    TestProductionLine.testProductionLine();

    EmployeeInfo thisEmployee = new EmployeeInfo();

    while (!exitCodeRecd) {

      int menuSelection = runMainMenu();

      switch (menuSelection) {
        case 1:
          //Create a new production product run
          System.out.println("You selected to create a new production product run.");
          addProductMenu();
          break;
        case 2:
          //View previously produced products
          System.out.println("You selected to view a previously produced product.");
          print(products);
          break;
        case 3:
          //View production statistics
          System.out.println("You selected to view a production statistics.");
          int numProducts = products.size();
          int numAudioPlayers = Product.countType(AudioPlayer.class,products);
          int numMoviePlayers = Product.countType(MoviePlayer.class,products);
          System.out.println("You have produced a total of " + numProducts + " products, including " + numAudioPlayers
          + " AudioPlayer products and " + numMoviePlayers + " MoviePlayer products");
          break;
        case 4:
          //View production log
          System.out.println("You selected to view a production log text.");
          ViewFileInfo.outputDataFileToConsole();
          break;
        case 5:
          //Exit
          System.out.println("You selected to exit the program. Have a nice day.");
          exitCodeRecd = true;
          break;
      }
      System.out.println("\n");
      try {
        Thread.sleep(1400);
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
    }
  }

   /**
    * The testCollection method instantiates objects of multiple types that are derived from Product.
    *
    * @return  ArrayList&lt;Product&gt; containing the test objects instantiated
    */
  private static ArrayList<Product> testCollection() {
    ArrayList<Product> products = new ArrayList<>();

    AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman","WAV");
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

   /**
    * The runMainMenu displays a text based menu and checks user input for
    * any issues.
    *
    * @return   int of item selected in menu to be receieved by switch statement
    */
   private static int runMainMenu() {
     int thisMenuSelection = -1;
     // display welcome message and initial prompt, then receive user input
     System.out.println("Root Menu: ");
     boolean goodSelection = false;
     while (!goodSelection) {
       System.out.println("What would you like to do?:\n"
               + "1-Add New Product\n"
               + "2-Display Previous Products\n"
               + "3-Display Production Statistics\n"
               + "4-Display Production Log\n"
               + "5-Exit");
       try {
         String userInput = scan.nextLine();
         thisMenuSelection = Integer.parseInt(userInput);
         if ((thisMenuSelection > 0) && (thisMenuSelection < 6)) {
           goodSelection = true;
         } else {
           throw new Exception("Menu Selection out of range. Try again");
         }
       } catch (NumberFormatException ex) {
         System.out.println("Number must be entered for menu choice. Try again");
       } catch (Exception ex) {
         System.out.println(ex.getMessage());
       }
     }
     return thisMenuSelection;
   }


  /**
   * The addProductMenu method displays a text based menu to determine the type of product to create.
   *
   * @return   boolean value that represents whether or not an object was created.
   */
  private static boolean addProductMenu() {
    int thisItemSelection = -1;
    boolean goodSelection = false;
    while (!goodSelection) {
      System.out.println("Would you like to create an AudioPlayer or MoviePlayer?:\n"
              + "1-AudioPlayer\n"
              + "2-MoviePlayer\n"
              + "3-Go back");
      try {
        String userInput = scan.nextLine();
        thisItemSelection = Integer.parseInt(userInput);
        if ((thisItemSelection > 0) && (thisItemSelection < 4)) {
          goodSelection = true;
        } else {
          throw new Exception("Menu Selection out of range. Try again");
        }
      } catch (NumberFormatException ex) {
        System.out.println("Number must be entered for menu choice. Try again");
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }
    if (thisItemSelection == 1) {
      System.out.println("Menu to add AudioPlayer");
      audioPlayerEntry();
    }
    else if (thisItemSelection == 2) {
      System.out.println("Menu to add MoviePlayer");
      moviePlayerEntry();
    }
    else {
      return false;
    }
    return true;
  }

  /**
   * The audioPlayerEntry method displays a text based menu to enter an AudioPlayer Product from user input
   *
   * @return   boolean value that represents whether or not an object was created.
   */
  private static boolean audioPlayerEntry() {
    try {
      System.out.print("Enter name of product: ");
      String nameInput = scan.nextLine();
      System.out.print("Enter number for specification of product: 1) MP3   2) WAV ");
      String specInput = scan.nextLine();
      int thisItemSpec = Integer.parseInt(specInput);
      if (thisItemSpec == 1) {
        AudioPlayer tempAudioPlayer = new AudioPlayer(nameInput,"MP3");
        products.add(tempAudioPlayer);
        return true;
      }
      else if (thisItemSpec == 2) {
        AudioPlayer tempAudioPlayer = new AudioPlayer(nameInput,"WAV");
        products.add(tempAudioPlayer);
        return true;
      }
      else {
        throw new Exception("Menu Selection out of range. Try again");
      }
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    return false;
  }

  /**
   * The moviePlayerEntry method displays a text based menu to enter an MoviePlayer Product from user input
   *
   * @return   boolean value that represents whether or not an object was created.
   */
  private static boolean moviePlayerEntry() {
    try {
      System.out.print("Enter name of product: ");
      String nameInput = scan.nextLine();
      System.out.print("Enter number for screen type of product: 1) LCD   2) LED ");
      String screenInput = scan.nextLine();
      MonitorType screenType;
      int thisScreenType = Integer.parseInt(screenInput);
      if (thisScreenType == 1) {
        screenType = MonitorType.LCD;
      }
      else if (thisScreenType == 2) {
        screenType = MonitorType.LED;
      }
      else {
        throw new Exception("Menu Selection out of range. Try again");
      }
      System.out.print("Enter screen resolution: ");
      String resolutionInput = scan.nextLine();
      System.out.print("Enter screen refresh rate: ");
      String refreshRateInput = scan.nextLine();
      int refreshRate = Integer.parseInt(refreshRateInput);
      System.out.print("Enter screen response time: ");
      String responseTimeInput = scan.nextLine();
      int responseTime = Integer.parseInt(responseTimeInput);
      MoviePlayer tempMovPlayer = new MoviePlayer(nameInput,new Screen(resolutionInput,refreshRate,responseTime),screenType);
      products.add(tempMovPlayer);

    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    return false;
  }

}

