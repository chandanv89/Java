package com.github.chandanv89.java.conversions;

import org.junit.Before;
import org.junit.Test;

/**
 * The type Test hexa decimal to binary.
 */
public class TestHexaDecimalToBinary {
   private HexaDecimalToBinary hex2bin;

   @Before
   public void init() {
      hex2bin = new HexaDecimalToBinary();
   }

   /**
    * Test hex to bin.
    */
   @Test
   public void testHexToBin_1() {
      String[] given = {
              "00", "01", "02", "03", "04", "05",
              "06", "07", "08", "09", "0A", "0B",
              "0C", "0D", "0E", "0F"
      };

      String[] expected = {
              "00", "01", "02", "03", "04", "05",
              "06", "07", "08", "09", "0A", "0B",
              "0C", "0D", "0E", "0F"
      };

      for (String num : given) {
         hex2bin.convert(num);
      }
   }
}
