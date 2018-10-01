package com.wyattbyroade.productionoop;

import java.util.Date;

/**
 * The Item interface sets up the consistent set of methods that will be used for any manufactured
 * item, contained by any classes that implement it.
 *
 * @author Wyatt Byroade
 * @version 1.0
 * @since 2018-09-29
 */
public interface Item {

  String manufacturer = "OracleProduction";

  void setProductionNumber(int productionNumberInput);

  void setName(String nameInput);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();
}