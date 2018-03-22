package com.github.chandanv89.java.conversions;

import com.github.chandanv89.java.utils.NumericUtility;

/**
 * This class converts a Binary number to a Decimal number
 *
 * @author Unknown
 */
public class BinaryToDecimal implements NumericConverter<Integer, String> {

   @Override
   public Integer convert(String number) {
      int dec = 0, c = 0;
      try {
         if (!NumericUtility.isBinaryString(number)) {
            System.out.println("Invalid binary number");
            return -1;
         }
         int k = Integer.parseInt(number);
         while (k != 0) {
            int d = k % 10;
            dec += d * (int) Math.pow(2, c++);
            k /= 10;
         }
      } catch (Exception e) {
         dec = -1;
         System.err.println("Something went wrong! " + e.getMessage());
      }

      return dec;
   }
}
