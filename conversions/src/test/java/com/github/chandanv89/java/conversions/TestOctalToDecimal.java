package com.github.chandanv89.java.conversions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The type Test octal to decimal.
 */
public class TestOctalToDecimal {
   private OctalToDecimal o2d = new OctalToDecimal();

   /**
    * Test o 2 d.
    */
   @Test
   public void testO2d() {
      String[] octals = {
              "01", "02", "03", "04", "05",
              "06", "07", "10", "11", "12"
      };

      Integer[] decs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

      int i = 0;
      for (String oct : octals)
         assertEquals(decs[i++], o2d.convert(oct));
   }

   /**
    * Test o 2 d failed.
    */
   @Test
   public void testO2d_failed() {
      String[] octals = {
              "01.1", "08", "18", "2018"
      };

      for (String oct : octals)
         assertEquals(new Integer(-1), o2d.convert(oct));
   }
}
