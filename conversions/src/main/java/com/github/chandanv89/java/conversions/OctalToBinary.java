package com.github.chandanv89.java.conversions;

/**
 * Converts any Octal number to a Binary number
 *
 * @author Zachary Jones
 * @author chandanv89
 */
public class OctalToBinary implements NumericConverter<String, Integer> {
   @Override
   public String convert(Integer number) {
      String binStr;

      try {
         // check if the input number is indeed octal
         Integer.parseInt(String.valueOf(number), 8);

         binStr = Integer.toBinaryString(number);
      } catch (NumberFormatException e) {
         binStr = "0";
         System.err.println("Something went wrong while converting the input to binary string! "
                 + e.getMessage());
      }

      return binStr;
   }
}