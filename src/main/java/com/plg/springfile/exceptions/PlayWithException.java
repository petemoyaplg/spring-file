package com.plg.springfile.exceptions;

public class PlayWithException {
  public static void main(String... args) {
    String information = "No information";
    try {
      information = getInformation();
    } catch (MyException e) {
      System.out.println("Exception : " + e.getMessage());
      e.printStackTrace();
    }
    System.out.println(information);
  }

  public static String getInformation() throws MyException {
    return "Une information";
  }
}
