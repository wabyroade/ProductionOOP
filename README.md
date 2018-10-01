# Production OOP

The Production OOP program is a mock manufacturing management
application that makes use of several tenets of object oriented
design and programming.

## Getting Started

To use this program, simply include the package files in your Java project and create a concrete class that extends the **Product** class to make use of the fields and methods defined in the **Item** interface.

### Prerequisites

This program should run on any modern JRE version(6+).

### Installation and Use

Simply copy the **Product.java**, **ItemType.java**, **Item.java** into your package src folder and create a concrete class to extend the Product class as seen below:

```java
public class AutomotivePart extends Product { }
```

### Methods specified by Item interface:
*  String manufacturer = "OracleProduction";

*  void setProductionNumber(int productionNumberInput);

*  void setName(String nameInput);

*  String getName();

*  Date getManufactureDate();

*  int getSerialNumber();
