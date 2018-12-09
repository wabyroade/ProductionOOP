package com.wyattbyroade.productionoop;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {
  StringBuilder name;
  String code;
  String deptId;
  Pattern p;
  Scanner in;

  public EmployeeInfo() {
    in = new Scanner(System.in);
    setName();
    setDeptId();
    in.close();
  }

  public String getDeptId() {
    System.out.print("Enter department id: ");
    String enteredCode = in.nextLine();
    return enteredCode;
  }

  private void setDeptId() {
    String tempDeptId = getDeptId();
    if (validId(tempDeptId)) {
      deptId = reverseString(tempDeptId);
    }
    else {
      deptId = "None01";
    }
  }

  private String getId() {
    return deptId;
  }

  private boolean validId(String id) {
    String regexString = "^\\w{4}\\d{2}";
    return ((id != null)
            && (!id.equals(""))
            && (id.matches(regexString)));
  }

  public String reverseString(String id) {
    if (id.length() <= 1) return id;
    else return reverseString(id.substring(1)) + id.charAt(0);
  }

  public StringBuilder getName() {
    return new StringBuilder(name);
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    StringBuilder name = new StringBuilder(inputName());
    if (checkName(name)) {
      // create userCode from entered name
      createEmployeeCode(name);
    } else {
      // create guest userCode
      code = "Guest";
    }
  }

  private void createEmployeeCode(StringBuilder name) {
    String[] nameParts = name.toString().split(" ");
    code = nameParts[0].substring(0,1) + nameParts[1];
  }

  private String inputName() {
    System.out.print("Enter first and last name: ");
    String enteredName = in.nextLine();
    return enteredName;
  }

  private boolean checkName(StringBuilder name) {
    String tempString = name.toString();
    String regexString = "^\\w+\\s+\\w+";
      return ((tempString != null)
              && (!tempString.equals(""))
              && (tempString.matches(regexString)));
    }


  /**
   * Returns String representation of a Product object
   *
   * @return String representation of super class as well as MonitorType to console
   */
  public String toString() {
    return "Code : " + code + "\n"
            + "Department Id : " + deptId;
  }

}
