package com.github.chandanv89.java.conversions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Java
 * Copyright (C) 2018 chandanv89
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
public class TestDecimalToAnyBase {
   private DecimalToAnyBase b2x;

   /**
    * Init.
    */
   @Before
   public void init() {
      b2x = new DecimalToAnyBase();
   }

   /**
    * Test convert binary.
    */
   @Test
   public void testConvert_binary() {
      setBase(DecimalToAnyBase.BINARY);

      assertEquals("1111", b2x.convert(15));
   }

   /**
    * Test convert octal.
    */
   @Test
   public void testConvert_octal() {
      setBase(DecimalToAnyBase.OCTAL);

      assertEquals("17", b2x.convert(15));
   }

   /**
    * Test convert decimal.
    */
   @Test
   public void testConvert_decimal() {
      setBase(DecimalToAnyBase.DECIMAL);

      assertEquals("15", b2x.convert(15));
   }

   /**
    * Test convert hexa.
    */
   @Test
   public void testConvert_hexa() {
      setBase(DecimalToAnyBase.HEXA);

      assertEquals("F", b2x.convert(15));
   }

   /**
    * Test convert random.
    */
   @Test
   public void testConvert_random() {
      setBase(20);

      assertEquals("10", b2x.convert(20));
   }

   private void setBase(int base) {
      b2x = new DecimalToAnyBase(base);
   }
}
