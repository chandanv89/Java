package com.github.chandanv89.java.conversions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Java
 * Copyright (C) 2018  a556551
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
public class TestDecimalToHexaDecimal {
   private DecimalToHexaDecimal d2x;

   /**
    * Init.
    */
   @Before
   public void init() {
      d2x = new DecimalToHexaDecimal();
   }

   /**
    * Test convert success.
    */
   @Test
   public void testConvert_success() {
      int[] nums = {
              0, 1, 5, 8,
              10, 15, 20, 50,
              100, 999, 1000, 10000,
              99999, 1000000, 999999, 9999999,
              99999999, 999999999
      };

      String[] hex = {
              "00000000", "00000001", "00000005", "00000008",
              "0000000A", "0000000F", "00000014", "00000032",
              "00000064", "000003E7", "000003E8", "00002710",
              "0001869F", "000F4240", "000F423F", "0098967F",
              "05F5E0FF", "3B9AC9FF"
      };

      int i = 0;
      for (int n : nums)
         assertEquals(hex[i++], d2x.convert(n));
   }
}
