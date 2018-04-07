package com.github.chandanv89.java.utils;

import org.apache.commons.lang.StringUtils;

/**
 * The type Numeric utility.
 */
public class NumericUtility {
   NumericUtility() {
      throw new IllegalStateException("Cannot instantiate a utility class.");
   }

   /**
    * Checks if the input string is a valid binary string or number
    *
    * @param binaryString the binary string
    * @return the boolean
    * @throws NumberFormatException the number format exception
    */
   public static boolean isBinaryString(String binaryString) {
      if (binaryString == null || StringUtils.isEmpty(binaryString))
         return false;

      return binaryString.matches("^[01]+$");
   }

   /**
    * Checks if the input number is a valid octal number.
    *
    * @param octNum the oct num
    * @return the boolean
    */
   public static boolean isOctalNumber(Integer octNum) {
      if (octNum == null) return false;

      String octNumStr = String.valueOf(octNum);
      return octNumStr.matches("^[0-7]+$");
   }
}
