package com.oracle.docs.javase.tutorial.java.concepts.exercises._2;

import java.util.HashMap;

/**
 * Airplane SuperClass
 */
public abstract class Airplane implements Flyable {
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

  public Airplane(String manufacturere, String model){
    this.manufacturer = manufacturere;
    this.model = model;

    System.out.println(manufacturer + " " + model + " - Pre-Flight Complete");
  }

  public HashMap getStats() {
    HashMap stats = new HashMap();

    stats.put("speed", speed);

    stats.put("bankAngle", bankAngle);
    stats.put("bearing", bearing);

    stats.put("pitchAngle", pitchAngle);
    stats.put("altitude", altitude);

    stats.put("manufacturer", manufacturer);
    stats.put("model", model);

    return stats;
  }

  public void changeSpeed (int mph) {
    // todo validate speed

    speed = speed + mph;

    // todo change speed as long as speed is greater or less than zero
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
    // todo perform takeoff maneuver and rollout
  }

  public void land () {
    // todo perform landing maneuver and touchdown
  }
}