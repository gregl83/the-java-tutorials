package com.oracle.docs.javase.tutorial.java.concepts.exercises._2;

/**
 * An interface for airplanes with radar
 *
 * Note: a radar type class should implement this interface but for the sake of demo airplanes themselves will implement
 */
public interface Radar {
  public void toggleRadar ();

  public void getTarget (int targetId);
}