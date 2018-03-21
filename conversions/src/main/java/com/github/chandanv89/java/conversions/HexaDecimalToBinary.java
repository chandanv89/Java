package com.github.chandanv89.java.conversions;

/**
 * The type Hexa to bin.
 */
public class HexaDecimalToBinary implements NumericConverter<String, String> {
   /**
    * Convert.
    *
    * @param numHex the num hex
    */
   @Override
   public String convert(String numHex) {
      int conHex = Integer.parseInt(numHex, 16);
      return padBinStr(Integer.toBinaryString(conHex));
   }

   /**
    * Complete digits string.
    *
    * @param binStr the bin num
    * @return the string
    */
   private String padBinStr(String binStr) {
      StringBuilder paddedBinStr = new StringBuilder(binStr);
      int defecient = 4 - binStr.length() % 4;
      for (int i = 0; i < defecient; i++) {
         paddedBinStr.insert(0, "0");
      }
      return wordify(paddedBinStr.toString());
   }

   private String wordify(String binStr) {
      StringBuilder wordified = new StringBuilder();

      for (int i = 0; i < binStr.length(); i++) {
         if (i > 1 && i % 4 == 0) wordified.append(" ");
         wordified.append(binStr.charAt(i));
      }

      return wordified.toString();
   }
}