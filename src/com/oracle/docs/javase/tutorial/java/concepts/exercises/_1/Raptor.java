package com.oracle.docs.javase.tutorial.java.concepts.exercises._1;

/**
 * Lockheed Martin F-22 Raptor
 */
public class Raptor extends Airplane {
  static String manufacturer = "Lockheed Martin";
  static String model = "F-22 Raptor";

  // todo aircraft performance characteristics to be used by super class

  public static void main(String[] args) {
    System.out.println(manufacturer + " " + model + " - Pre-Flight Complete");
  }
}