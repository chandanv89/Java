package com.github.chandanv89.java.conversions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The type Test binary to decimal.
 */
public class TestBinaryToDecimal {
   private BinaryToDecimal b2d;

   /**
    * Init.
    */
   @Before
   public void init() {
      b2d = new BinaryToDecimal();
   }

   /**
    * Test convert success.
    */
   @Test
   public void testConvert_success() {
      String[] binStrs = {
              "0001", "110", "0100", "1011",
              "1111", "11011110", "10100", "10"
      };

      int[] dec = {1, 6, 4, 11, 15, 222, 20, 2};

      int i = 0;

      for (String bin : binStrs)
         assertEquals(dec[i++], (int) b2d.convert(bin));
   }

   /**
    * Test convert failure.
    */
   @Test
   public void testConvert_failure() {
      String[] invalidBinStrs = {"2", "010118", "ab111"};
      for (String num : invalidBinStrs)
         assertEquals(-1, (int) b2d.convert(num));
   }
}
