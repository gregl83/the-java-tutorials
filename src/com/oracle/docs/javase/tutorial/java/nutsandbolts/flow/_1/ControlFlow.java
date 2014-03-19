package com.oracle.docs.javase.tutorial.java.nutsandbolts.flow._1;

/**
 * Control Flow example
 *
 * a. "second string\nthird string"
 * b. aNumber is greater than 3 so the first if expression passes.  the second if expression
 *    fails.  the else is triggered by the lack of braceses.
 * c. see method c output
 * d. see method d output
 *
 */
public class ControlFlow {
  public static void main(String[] args) {
    ControlFlow.b(3);
    ControlFlow.c(3);
    ControlFlow.d(3);
  }

  public static void b(int aNumber) {
    System.out.println("--b--");

    if (aNumber >= 0)
      if (aNumber == 0)
        System.out.println("first string");
    else System.out.println("second string");
    System.out.println("third string");
  }

  public static void c(int aNumber) {
    System.out.println("--c--");

    if (aNumber >= 0)
      if (aNumber == 0)
        System.out.println("first string");
      else
        System.out.println("second string");

    System.out.println("third string");
  }

  public static void d(int aNumber) {
    System.out.println("--d--");

    if (aNumber >= 0) {
      if (aNumber == 0) {
        System.out.println("first string");
      } else {
        System.out.println("second string");
      }
    }

    System.out.println("third string");
  }
}
