package com.wyattbyroade.productionoop;

import java.util.Collection;
import java.util.Date;

/**
 * The abstract class Product is designed to be inherited by child classes
 * for any manufactured product. Through implementation of the Item interface,
 * the Product class will expose familiar methods to the rest of the program.
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
public abstract class Product implements Item, Comparable<Product> {

  private int serialNumber;
  private Date manufacturedOn;
  private String name;
  private static int currentProductionNumber = 1;
  private String manufacturer;


  /**
   * Instantiates a new Product object.
   *
   * @param nameInput - the name of the product being instantiated
   */
//constructor for this abstract class will initialize most relevant fields
  public Product(String nameInput) {
    name = nameInput;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date();
    this.manufacturer = Item.manufacturer;
  }

  /**
   * The setProductionNumber method is used to update the static field currentProductionNumber.
   *
   * @param productionNumberInput - the number that will be used as serial number of next Product created.
   */
  public void setProductionNumber(int productionNumberInput) {
    currentProductionNumber = productionNumberInput;
  }

  /**
   * The setName method is used to update the name field of an object inherited from Product.
   *
   * @param nameInput - the number that will be used as serial number of next Product created.
   */
  @Override
  public void setName(String nameInput) {
    name = nameInput;
  }

  /**
   * The getName method is used to return name of the object to calling method.
   *
   * @return String name
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * The getManufactureDate method is used to return manufacturedOn field to calling method.
   *
   * @return String name
   */
  @Override
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  /**
   * The getSerialNumber method is used to return manufacturedOn field to calling method.
   *
   * @return String name
   */
  @Override
  public int getSerialNumber() {
    return serialNumber;
  }

  /**
   * The compareTo method is implemented as required by Comparable&lt;&gt; interface to allow sorting of Product objects.
   *
   * @return int returns result of String-based compareTo method run on the name fields of two objects.
   */
  public int compareTo(Product compProduct) {
    return this.name.compareTo(compProduct.getName());
  }


  /**
   * The printType method loops through an ArrayList<Product> and prints each object that match the specified class
   *
   * @param thisClass - the class of objects to print
   * @param thisCollection - the collection of product objects to loop through
   */
  public static void printType(Class<?> thisClass, Collection thisCollection) {
    for(Object thisObj : thisCollection) {
      if (thisObj.getClass().equals(thisClass)) {
        System.out.println(thisObj);
      }
    }
  }

  /**
   * The countType method loops through an ArrayList<Product> and counts each object that match the specified class
   *
   * @param thisClass - the class of objects to print
   * @param thisCollection - the collection of product objects to loop through
   *
   * @return totalCount  integer count of matching objects
   */
  static int countType(Class<?> thisClass, Collection thisCollection) {
    int count = 0;
    for(Object thisObj : thisCollection) {
      if (thisObj.getClass().equals(thisClass)) {
        count++;
      }
    }
    return count;
  }

  /**
   * Returns String representation of a Product object
   *
   * @return String representation of super class as well as MonitorType to console
   */
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name;
  }

}
