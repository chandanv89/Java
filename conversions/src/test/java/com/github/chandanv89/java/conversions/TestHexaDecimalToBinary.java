package com.github.chandanv89.java.conversions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
              "06", "07",
              "08", "09",
              "0A", "0B",
              "0C", "0D",
              "0E", "0F"
      };

      String[] expected = {
              "0000", "0001", "0010", "0011", "0100", "0101",
              "0110", "0111",
              "0000 1000", "0000 1001",
              "0000 1010", "0000 1011",
              "0000 1100", "0000 1101",
              "0000 1110", "0000 1111"
      };

      int i = 0;
      for (String num : given) {
         assertEquals(expected[i++], hex2bin.convert(num));
      }
   }
}
