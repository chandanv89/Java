package com.github.chandanv89.java.conversions;

/**
 * Converts any Octal Number to a Decimal Number
 *
 * @author Zachary Jones
 */
public class OctalToDecimal implements NumericConverter<Integer, String> {
   @Override
   public Integer convert(String number) {
      int dec;
      try {
         dec = Integer.parseInt(number, 8);
      } catch (NumberFormatException e) {
         dec = -1;
         System.err.println("Invalid octal number! " + e.getMessage());
      }
      return dec;
   }
}