package com.github.chandanv89.java.conversions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The type Test binary to octal.
 */
public class TestBinaryToOctal {
   private BinaryToOctal b2o;

   /**
    * Init.
    */
   @Before
   public void init() {
      b2o = new BinaryToOctal();
   }

   /**
    * Test convert success.
    */
   @Test
   public void testConvert_success() {
      String[] validBinStrs = {
              "0000", "0001", "0010", "0100", "1", "11"
      };

      int i = 0;
      int[] validOcts = {0, 1, 2, 4, 1, 3};

      for (String bin : validBinStrs)
         assertEquals(validOcts[i++], (int) b2o.convert(bin));
   }

   /**
    * Test convert failure.
    */
   @Test
   public void testConvert_failure() {
      String[] invalidBinStr = {"_1000", "_10001111", "1000", "11100", "1001"};

      for (String bin : invalidBinStr)
         assertEquals(-1, (int) b2o.convert(bin));
   }
}
