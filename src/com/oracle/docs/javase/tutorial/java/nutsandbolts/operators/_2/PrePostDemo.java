package com.oracle.docs.javase.tutorial.java.nutsandbolts.operators._2;

/**
 * Operator Prefix and Postfix example
 */
class PrePostDemo {
  public static void main(String[] args){
    int i = 3;
    i++;
    System.out.println(i);    // "4"
    ++i;
    System.out.println(i);    // "5"
    System.out.println(++i);  // "6"
    System.out.println(i++);  // "6" again because value is changed postfix (print function)
    System.out.println(i);    // "7"
  }
}