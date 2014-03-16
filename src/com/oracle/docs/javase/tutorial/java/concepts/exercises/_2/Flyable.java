package com.oracle.docs.javase.tutorial.java.concepts.exercises._2;

/**
 * An interface for objects that can fly
 */
public interface Flyable {
  public void changeSpeed (int mph);

  public void changeBankAngle (int angle);

  public void changePitchAngle (int angle);

  public void takeoff ();

  public void land ();
}