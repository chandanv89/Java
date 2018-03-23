package com.github.chandanv89.java.conversions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * The type Test binary to hexadecimal.
 */
public class TestBinaryToHexadecimal {
   private BinaryToHexadecimal b2h;

   /**
    * Init.
    */
   @Before
   public void init() {
      b2h = new BinaryToHexadecimal();
   }

   /**
    * Test conver success.
    */
   @Test
   public void testConver_success() {
      String[] binStrs = {
              "0000", "0001", "0010", "0100",
              "1000", "10001111", "1", "11",
              "1010", "1100", "1101", "1110",
              "1001", "1011"
      };

      String[] hexStrs = {
              "0", "1", "2", "4",
              "8", "8F", "1", "3",
              "A", "C", "D", "E",
              "9", "B"
      };

      int i = 0;
      for (String b : binStrs)
         assertEquals(hexStrs[i++], b2h.convert(b));
   }

   /**
    * Test convert failure.
    */
   @Test
   public void testConvert_failure() {
      assertNull(b2h.convert("12"));
      assertNull(b2h.convert(null));
   }
}
