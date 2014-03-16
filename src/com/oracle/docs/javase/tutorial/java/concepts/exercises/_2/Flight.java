package com.oracle.docs.javase.tutorial.java.concepts.exercises._2;

/**
 * Flight is a class for flying aircraft of the type Airplane
 */
public class Flight {
  public static void main(String[] args) {
    System.out.println("Welcome to the Java Flight Class\n");

    if (0 == args.length) {
      System.out.println("No Airplane Type Found");
      System.exit(0);
    } else {
      // Load Airplane and Initialize Flight Controls
      try {
        String airplaneClasspath = "com.oracle.docs.javase.tutorial.java.concepts.exercises._1." + args[0];

        Object airplane = Class.forName(airplaneClasspath).newInstance();

        // todo bind input events to airplane actions
      } catch(Exception e) {
        System.out.println(e);
      }
    }
  }
}