package com.wyattbyroade.productionoop;

import java.util.Date;

/**
 * The abstract class Product is designed to be inherited by child classes
 * for any manufactured product. Through implementation of the Item interface,
 * the Product class will expose familiar methods to the rest of the program.
 *
 * @author  Wyatt Byroade
 * @version 1.0
 * @since   2018-09-29
 */
public abstract class Product implements Item {

  private int serialNumber;
  private Date manufacturedOn;
  private String name;
  private static int currentProductionNumber;

  public Product(String nameInput) {
    name = nameInput;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date();
  }

  public void setProductionNumber(int productionNumberInput) {
    currentProductionNumber = productionNumberInput;
  }

  @Override
  public void setName(String nameInput) {
    name = nameInput;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  @Override
  public int getSerialNumber() {
    return serialNumber;
  }

  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name + "\n";
  }

}
