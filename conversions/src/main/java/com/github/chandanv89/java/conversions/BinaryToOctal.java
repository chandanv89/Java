package com.github.chandanv89.java.conversions;

import com.github.chandanv89.java.utils.NumericUtility;

/**
 * Converts any Binary number to an Octal Number
 *
 * @author Zachary Jones
 */
public class BinaryToOctal implements NumericConverter<Integer, String> {
   @Override
   public Integer convert(String number) {
      if (!NumericUtility.isBinaryString(number)) {
         System.out.println("Invalid binary number!");
         return -1;
      }

      try {
         Integer octNum = binaryToOctal(Integer.parseInt(number));
         return NumericUtility.isOctalNumber(octNum) ? octNum : -1;
      } catch (Exception e) {
         System.err.println(e.getMessage());
         return -1;
      }
   }

   /**
    * This method converts a binary number to
    * an octal number.
    *
    * @param b The binary number
    * @return The octal number
    */
   private int binaryToOctal(int b) {
      int o = 0, r, j = 1;
      while (b != 0) {
         r = b % 10;
         o = o + r * j;
         j = j * 2;
         b = b / 10;
      }
      return o;
   }
}
