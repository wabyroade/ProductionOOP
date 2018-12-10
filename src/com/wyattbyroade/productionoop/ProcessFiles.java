package com.wyattbyroade.productionoop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


/**
 * The class ProcessFiles is used to output production data to log file rather than console
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
class ProcessFiles {
  private Path p;
  private Path p2;
  private Path p3;

  /**
   * Instantiates a new ProcessFiles object, which also creates log folder if it doesn't currently exist.
   */
  ProcessFiles() {
    // Uncomment and/or modify one of the following three lines depending on test environment
    p = Paths.get("/Users/NONAME/LineTests"); // Absolute path for MacOS
    //p = Paths.get("LineTests"); // More versatile relative path to output data in project folder - PROBABLY IDEAL
    //p = Paths.get("C:\\LineTests"); // Absolute path for MS Windows


    p2 = Paths.get("TestResults.txt");
    p3 = p.resolve(p2);
    CreateDirectory();
  }

  /**
   * Create directory where log file will be stored
   */
  private void CreateDirectory() {
    if (!Files.exists(p)) {
      try {
        Files.createDirectories(p);
      } catch (Exception e) {
        System.err.println("Unable to create directory. Is correct filesystem set?");
        e.printStackTrace();
      }
    }
  }

  /**
   * write toString() data from an employee object to log file
   *
   * @param emp   EmployeeInfo object of the employee data to be written
   */
  void WriteFile(EmployeeInfo emp) throws IOException {
    File appendFile = new File(p3.toString());
    FileWriter appendDataObj = new FileWriter(appendFile, true);
    appendDataObj.write(emp.toString() + "\n");
    appendDataObj.close();
  }

  /**
   * Write toString() data from each object in an ArrayList<Product> list
   *
   * @param products ArrayList<Product> containing one to many objects of various Product types
   */
  void WriteFile(ArrayList<Product> products) throws IOException {
    File appendFile = new File(p3.toString());
    FileWriter appendDataObj = new FileWriter(appendFile, true);
    for (Product p : products) {
      appendDataObj.append(p.toString());
      appendDataObj.append("\n");
    }
    appendDataObj.close();
  }

  /**
   * Getter method for p3 (full file path) field; not in specification but used to make viewing that data easier
   *
   * @return Path full path of data log file
   */
  Path getDataFilePath() {
    return p3;
  }
}
