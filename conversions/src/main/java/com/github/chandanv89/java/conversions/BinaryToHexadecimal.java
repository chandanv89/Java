package com.github.chandanv89.java.conversions;

import com.github.chandanv89.java.utils.NumericUtility;

/**
 * Converts any Binary Number to a Hexadecimal Number
 *
 * @author Nishita Aggarwal
 */
public class BinaryToHexadecimal implements NumericConverter<String, String> {

   /**
    * This method converts a binary number to
    * a hexadecimal number.
    *
    * @param number The binary number
    * @return The hexadecimal number
    */
   @Override
   public String convert(String number) {
      StringBuilder hexStr = new StringBuilder();

      try {
         if (!NumericUtility.isBinaryString(number)) {
            System.out.println("Invalid binary number!");
            return null;
         }

         String binary = padBinStr(number);
         int digitNumber = 1;
         int sum = 0;

         //binary = "011110101010";

         for (int i = 0; i < binary.length(); i++) {
            if (digitNumber == 1)
               sum += Integer.parseInt(binary.charAt(i) + "") * 8;
            else if (digitNumber == 2)
               sum += Integer.parseInt(binary.charAt(i) + "") * 4;
            else if (digitNumber == 3)
               sum += Integer.parseInt(binary.charAt(i) + "") * 2;
            else if (digitNumber == 4 || i < binary.length() + 1) {
               sum += Integer.parseInt(binary.charAt(i) + "");
               digitNumber = 0;
               if (sum < 10)
                  hexStr.append(sum);
               else if (sum == 10)
                  hexStr.append("A");
               else if (sum == 11)
                  hexStr.append("B");
               else if (sum == 12)
                  hexStr.append("C");
               else if (sum == 13)
                  hexStr.append("D");
               else if (sum == 14)
                  hexStr.append("E");
               else if (sum == 15)
                  hexStr.append("F");
               sum = 0;
            }
            digitNumber++;
         }
      } catch (NumberFormatException e) {
         hexStr = new StringBuilder();
         System.err.println(e.getMessage());
      }

      return hexStr.toString();
   }

   private String padBinStr(String binStr) {
      if (binStr.length() % 4 == 0) return binStr;

      int defecient = 4 - binStr.length() % 4;
      StringBuilder padding = new StringBuilder();
      for (int i = 0; i < defecient; i++) padding.append("0");

      return padding.toString() + binStr;
   }
}
