package com.github.chandanv89.java.conversions;

import java.util.Scanner;

/**
 * The type Test.
 */
class Test {
   private static final int sizeOfIntInHalfBytes = 8;
   private static final int numberOfBitsInAHalfByte = 4;
   private static final int halfByte = 0x0F;
   private static final char[] hexDigits = {
           '0', '1', '2', '3', '4', '5', '6', '7',
           '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
   };

   /**
    * Dec to hex string.
    *
    * @param dec the dec
    * @return the string
    */
   public static String decToHex(int dec) {
      StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);
      hexBuilder.setLength(sizeOfIntInHalfBytes);
      for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i) {
         int j = dec & halfByte;
         hexBuilder.setCharAt(i, hexDigits[j]);
         dec >>= numberOfBitsInAHalfByte;
      }
      return hexBuilder.toString();
   }

   /**
    * The entry point of application.
    *
    * @param args the input arguments
    */
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Write your Number to convert into HexaDecimal: ");
      int dec = 305445566;
      String hex = Integer.toHexString(dec);
      hex = decToHex(dec);
      System.out.println(hex);
   }
}