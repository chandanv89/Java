package com.github.chandanv89.java.conversions;

/**
 * This class converts a Decimal number to a Binary number
 *
 * @author Unknown
 */
public class DecimalToBinary implements NumericConverter<String, Integer> {
   @Override
   public String convert(Integer number) {
      Integer k, s = 0, c = 0, d;
      k = number;
      while (k != 0) {
         d = k % 2;
         s = s + d * (int) Math.pow(10, c++);
         k /= 2;
      }

      return String.valueOf(s);
   }
}
