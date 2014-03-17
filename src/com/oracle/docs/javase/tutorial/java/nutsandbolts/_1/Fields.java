package com.oracle.docs.javase.tutorial.java.nutsandbolts._1;

/**
 * Java fields and illegal fields examples
 */
public class Fields {
  public static int NUMBER_OF_GEARS = 6;
  public static final int DAYS_IN_YEAR = 365;

  public int $notGood = 666;
  public int _notRecommended = 777;

  public static void main(String[] args) {
    byte byteMin = -128;
    // byte byteUnder = -129;
    byte byteMax = 127;
    // byte byteOver = 128;

    short shortMin = -32768;
    // short shortUnder = -32769;
    short shortMax = 32767;
    // short shortOver = 32768;

    int intMin = -2147483648;
    // int intUnder = -2147483649;
    int intMax = 2147483647;
    // int intOver = 2147483648;

    // long min is too long
    long longPositive = 1983;
    long longNegative = -1000;
    // long longDouble = 1.78;
    // long longUnderscore = 1234_5678_9012_3456l;

    float floatWholePositive = 100;
    float floatWholeNegative = -99;
    float floatValid = 19.83f;
    float floatValidNegative = -38.91f;
    // float floatInvalid = 19.83;

    double doubleWhole = 100;
    double doubleDefault = 19.79;
    double doubleValid = 19.79d;
    double doubleNgeative = -97.91d;
    double doubleFloat = 19.79f;

    boolean booleanTrue = true;
    // boolean booleanOne = 1;
    boolean booleanFalse = false;
    // boolean booleanZero - 0;
    boolean booleanComparison = (1 == 1);

    char charSingleQuotes = 'a';
    // char charDoubleQuotes = "a";
    char charUnicodeMin = '\u0000';
    char charUnicodeMax = '\uffff';

    // todo hexadecimal and unicode

    // int 1nvalidName = 1;
    int validNam3 = 3;
  }
}