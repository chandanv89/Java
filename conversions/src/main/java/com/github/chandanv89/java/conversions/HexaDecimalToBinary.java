package com.github.chandanv89.java.conversions;

/**
 * The type Hexa to bin.
 */
public class HexaDecimalToBinary {
   /**
    * Convert.
    *
    * @param numHex the num hex
    */
   public String convert(String numHex) {
      //String a HexaDecimal:
      int conHex = Integer.parseInt(numHex, 16);
      //Hex a Binary:
      String binary = Integer.toBinaryString(conHex);
      //Presentation:
      System.out.println(numHex + " = " + completeDigits(binary));
      return binary;
   }

   /**
    * Complete digits string.
    *
    * @param binNum the bin num
    * @return the string
    */
   private String completeDigits(String binNum) {
      StringBuilder binNumBuilder = new StringBuilder(binNum);
      int LONG_BITS = 8;
      for (int i = binNumBuilder.length(); i < LONG_BITS; i++) {
         binNumBuilder.insert(0, "0");
      }
      binNum = binNumBuilder.toString();
      return binNum;
   }
}