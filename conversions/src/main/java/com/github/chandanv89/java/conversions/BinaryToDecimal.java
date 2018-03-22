package com.github.chandanv89.java.conversions;

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
         validateBinaryStr(number);
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

   private void validateBinaryStr(String number) {
      if (number != null && !number.matches("^[01]+$"))
         throw new NumberFormatException("Invalid binary string \"" + number + "\"");
   }
}
