package com.oracle.docs.javase.tutorial.java.concepts.exercises._2;

/**
 * Lockheed Martin F-22 Raptor
 */
public class Raptor extends Airplane implements ThrustVectorable, Radar {
  // todo aircraft performance characteristics to be used by super class

  public Raptor() {
    super("Lockheed Martin", "F-22 Raptor");
  }

  public void vectorThrust(int angle) {
    // todo validate vector angle

    vectorAngle = vectorAngle + angle;

    // todo change velocity (direction) as long as vector angel is greater or less than zero
  }

  public void toggleRadar () {
    // todo toggle radar
  }

  public void getTarget (int targetId) {
    // todo return target with id
  }
}