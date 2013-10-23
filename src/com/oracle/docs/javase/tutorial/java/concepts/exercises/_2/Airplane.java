package com.oracle.docs.javase.tutorial.java.concepts.exercises._2;

/**
 * Airplane SuperClass
 */
public class Airplane implements Flyable {
  // velocity
  int speed = 0;

  // turning
  int bankAngle = 0; // angle of bank
  int bearing = 0; // compass bearing

  // climbing/descending
  int pitchAngle = 0; // angle of pitch
  int altitude = 0; // altitude in ft

  String manufacturer;
  String model;

  public static void main (String[] args) {
    // todo constructor
  }

  public void changeSpeed (int mph) {
    // todo validate speed

    speed = speed + mph;
  }

  public void changeBankAngle (int angle) {
    // todo validate bank angle

    bankAngle = bankAngle + angle;

    // todo change bearing as long as bank angle is greater or less than zero
  }

  public void changePitchAngle (int angle) {
    // todo validate pitch angle

    pitchAngle = pitchAngle + angle;

    // todo change altitude as long as pitch angel is greater or less than zero
  }

  public void takeoff () {
    // todo perform takeoff procedures and rollout
  }

  public void land () {
    // todo perform landing procedures and touchdown
  }
}