package com.wyattbyroade.productionoop;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * The class EmployeeInfo is used to get employee and department data from the user and validate it
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
public class EmployeeInfo {
  private StringBuilder name;
  private String code;
  private String deptId;
  Pattern p;
  private Scanner in;

  /**
   * Instantiates a EmployeeInfo object
   */
  EmployeeInfo() {
//    in = new Scanner(System.in);
    in = Main.scan;
    setName();
    setDeptId();
//    in.close();
  }

  /*
   * Display prompt and get user input for deptId field
   *
   * @return String representation of user-entered department Id
   */
  private String getDeptId() {
    System.out.print("Please enter the department ID: ");
    return in.nextLine();
  }

  /**
   * Setter method for deptId; Calls getDeptId() method to prompt for user input
   */
  private void setDeptId() {
    String tempDeptId = getDeptId();
    if (validId(tempDeptId)) {
      deptId = reverseString(tempDeptId);
    }
    else {
      deptId = "None01";
    }
  }

  /**
   * Getter method for deptId
   *
   * @return String representation of departmentId
   */
  private String getId() {
    return deptId;
  }

  /**
   * Validate departmentId as entered by user
   *
   * @param id   the id input by the user
   *
   * @return boolean representation of whether the id is valid
   */
  private boolean validId(String id) {
    //String regexString = "^\\w{4}\\d{2}";
    String regexString = "^[A-Z]{1}[a-z]{3}\\d{2}";
    return ((id != null)
            && (!id.equals(""))
            && (id.matches(regexString)));
  }

  /**
   * Recursive function used to reverse department ID for "security"
   *
   * @param id   departmentId as entered by user
   *
   * @return String representation of reversed department Id
   */
  private String reverseString(String id) {
    if (id.length() <= 1) return id;
    else return reverseString(id.substring(1)) + id.charAt(0);
  }

  /**
   * Getter method for employee name field
   *
   * @return String representation of employee name
   */
  public StringBuilder getName() {
    return new StringBuilder(name);
  }

  /**
   * Return employee code
   *
   * @return String representation of employee code(first initial last name)
   */
  public String getCode() {
    return code;
  }

  /**
   * Check get name from user and check for valid format before setting field
   */
  private void setName() {
    StringBuilder name = new StringBuilder(inputName());
    if (checkName(name)) {
      // create userCode from entered name
      createEmployeeCode(name);
    } else {
      // create guest userCode
      code = "guest";
    }
  }

  /**
   * Turn first and last name into a code with first initial and last name
   *
   * @param name   the name input
   */
  private void createEmployeeCode(StringBuilder name) {
    String[] nameParts = name.toString().split(" ");
    code = nameParts[0].substring(0,1) + nameParts[1];
  }

  /**
   * Get name by prompting user
   *
   * @return String containing name as directly entered by user
   */
  private String inputName() {
    System.out.print("Please enter your first and last name: ");
    return in.nextLine();
  }

  /**
   * Check Name for requested format
   *
   * @param name   the name input
   *
   * @return boolean value referring to whether the name is formatted as specified with space between two names.
   */
  private boolean checkName(StringBuilder name) {
    String tempString = name.toString();
    String regexString = "^\\w+\\s+\\S+";
      return ((!tempString.equals(""))
              && (tempString.matches(regexString)));
    }


  /**
   * Returns String representation of a Product object
   *
   * @return String representation of super class as well as MonitorType to console
   */
  public String toString() {
    return "Employee Code : " + code + "\n"
            + "Department Number : " + deptId;
  }

}
