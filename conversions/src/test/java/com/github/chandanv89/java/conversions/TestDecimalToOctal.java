package com.github.chandanv89.java.conversions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Java - com.github.chandanv89.java.conversions.TestDecimalToOctal
 * Copyright (C) 2018 chandanv89
 * <p>
 * Created: ${DYA_NAME_SHORT} 23 Mar 2018
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
public class TestDecimalToOctal {
   private DecimalToOctal d2o;

   /**
    * Init.
    */
   @Before
   public void init() {
      d2o = new DecimalToOctal();
   }

   /**
    * Test convert success.
    */
   @Test
   public void testConvert_success() {
      int[] nums = {
              0, 1, 5, 10, 50, 100, 999, 10000, 99999
      };

      int[] octs = {
              0, 1, 5, 12, 62, 144, 1747, 23420, 303237
      };

      int i = 0;
      for (int n : nums)
         assertEquals(octs[i++], (int) d2o.convert(n));
   }
}
