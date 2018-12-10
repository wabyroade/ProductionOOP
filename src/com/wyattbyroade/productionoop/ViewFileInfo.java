package com.wyattbyroade.productionoop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The class ViewFileInfo allows the user to return a String object with the contents of the log file, or output it
 * directly to the console.
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
class ViewFileInfo {

  /**
   * Read file contents from data log file and display to console.
   */
  static void outputDataFileToConsole() {
    ProcessFiles fileObject = new ProcessFiles();
    try {
      String allFileData = getBigFileString(fileObject.getDataFilePath().toString());
      System.out.println(allFileData);
    }
    catch (FileNotFoundException e) {
      System.err.println("File not found: ");
      System.err.println(e.toString());
    } catch (IOException e) {
      System.err.println("Problem with source file: ");
      System.err.println(e.toString());
    } catch (Exception e) {
      System.err.println("Non-specific exception: ");
      e.printStackTrace();
    }
  }

  /**
   * Open data log file and return as one String
   *
   * @param fileName   String object with full path of data log file
   *
   * @return String representation of data file contents
   */
  private static String getBigFileString(String fileName)throws Exception
  {
    return new String(Files.readAllBytes(Paths.get(fileName)));
  }
}
