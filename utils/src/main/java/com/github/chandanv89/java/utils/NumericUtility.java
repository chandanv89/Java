package com.github.chandanv89.java.utils;

import org.apache.commons.lang.StringUtils;

/**
 * The type Numeric utility.
 */
public class NumericUtility {
   /**
    * Checks if the input string is a valid binary string or number
    *
    * @param binaryString the binary string
    * @return the boolean
    * @throws NumberFormatException the number format exception
    */
   public static boolean isBinaryString(String binaryString) throws NumberFormatException {
      if (binaryString == null || StringUtils.isEmpty(binaryString))
         return false;

      if (!binaryString.matches("^[01]+$"))
         throw new NumberFormatException("Invalid binary string \"" + binaryString + "\"");

      return true;
   }
}
