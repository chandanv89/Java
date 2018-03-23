package com.github.chandanv89.java.conversions;

/**
 * The type Test.
 */
public class DecimalToHexaDecimal implements NumericConverter<String, Integer> {
   private static final int sizeOfIntInHalfBytes = 8;
   private static final int numberOfBitsInAHalfByte = 4;
   private static final int halfByte = 0x0F;
   private static final char[] hexDigits = {
           '0', '1', '2', '3', '4', '5', '6', '7',
           '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
   };

   @Override
   public String convert(Integer number) {
      StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);
      hexBuilder.setLength(sizeOfIntInHalfBytes);

      for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i) {
         int j = number & halfByte;
         hexBuilder.setCharAt(i, hexDigits[j]);
         number >>= numberOfBitsInAHalfByte;
      }
      return hexBuilder.toString();
   }
}