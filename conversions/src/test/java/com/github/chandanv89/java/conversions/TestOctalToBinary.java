package com.github.chandanv89.java.conversions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The type Test octal tobinary.
 */
public class TestOctalToBinary {
   private OctalToBinary o2b = new OctalToBinary();

   /**
    * Test oct 2 bin.
    */
   @Test
   public void testOct2Bin_success() {
      Integer[] octals = {
              1, 2, 3, 4, 5,
              6, 7, 10, 167, 2017
      };

      String[] bins = {
              "1", "10", "11", "100", "101",
              "110", "111", "1010", "10100111", "11111100001"
      };

      int i = 0;
      for (Integer oct : octals)
         assertEquals(bins[i++], o2b.convert(oct));
   }

   /**
    * Test oct 2 bin failure.
    */
   @Test
   public void testOct2Bin_failure() {
   }
}
