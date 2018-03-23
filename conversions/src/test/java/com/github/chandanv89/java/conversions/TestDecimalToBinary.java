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
public class TestDecimalToBinary {
   private DecimalToBinary d2b;

   /**
    * Init.
    */
   @Before
   public void init() {
      d2b = new DecimalToBinary();
   }

   /**
    * Test convert success.
    */
   @Test
   public void testConvert_success() {
      int[] ints = {
              1, 2, 3, 4, 5, 6, 7, 8, 9,
              10, 100, 1000,
              99, 999,
      };

      String[] bins = {
              "1", "10", "11", "100", "101", "110", "111", "1000", "1001",
              "1010", "1100100", "1111101000",
              "1100011", "1111100111"
      };

      int i = 0;
      for (int num : ints)
         assertEquals(bins[i++], d2b.convert(num));
   }
}
