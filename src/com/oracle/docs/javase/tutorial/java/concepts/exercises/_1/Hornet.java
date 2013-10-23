package com.oracle.docs.javase.tutorial.java.concepts.exercises._1;

/**
 * McDonnell Douglas F/A-18 Hornet
 */
public class Hornet extends Airplane {
  static String manufacturer = "McDonnell Douglas";
  static String model = "F/A-18 Hornet";

  // todo aircraft performance characteristics to be used by super class

  public static void main(String[] args) {
    System.out.println(manufacturer + " " + model + " - Pre-Flight Complete");
  }
}