package com.github.chandanv89.java.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.logging.Logger;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Java - com.github.chandanv89.java.utils.TestNumericUtility
 * Copyright (C) 2018 chandanv89
 * <p>
 * Created: Fri 06 Apr 2018
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
public class TestNumericUtility {
   private static final Logger LOGGER = Logger.getLogger(TestNumericUtility.class.getName());
   private Long startTimeInMillis;

   /**
    * Init.
    */
   @Before
   public void init() {
      startTimeInMillis = Calendar.getInstance().getTimeInMillis();
      LOGGER.info("Running TestNumericUtility...");
   }

   /**
    * End.
    */
   @After
   public void end() {
      String logMsg = MessageFormat.format("TestNumericUtility ended [in {0}ms]",
            (Calendar.getInstance().getTimeInMillis() - startTimeInMillis));
      LOGGER.info(logMsg);
   }

   @Test
   public void testIllegalStateException() {
      try {
         NumericUtility numericUtility = new NumericUtility();
      } catch (IllegalStateException e) {
         assertTrue(true);
         return;
      }
      assertFalse(false);
   }

   /**
    * Test is binary string.
    */
   @Test
   public void testIsBinaryString() {
      LOGGER.info("Testing NumericUtility.isBinaryString...");
      assertTrue(NumericUtility.isBinaryString("0"));
      assertTrue(NumericUtility.isBinaryString("11111"));
      assertTrue(NumericUtility.isBinaryString("01010101"));
      assertTrue(NumericUtility.isBinaryString("1101001101"));
      assertFalse(NumericUtility.isBinaryString("102"));
      assertFalse(NumericUtility.isBinaryString(""));
      assertFalse(NumericUtility.isBinaryString(null));
   }

   /**
    * Test is octal number.
    */
   @Test
   public void testIsOctalNumber() {
      LOGGER.info("Testing NumericUtility.isOctalNumber...");
      assertTrue(NumericUtility.isOctalNumber(112));
      assertTrue(NumericUtility.isOctalNumber(7));
      assertTrue(NumericUtility.isOctalNumber(0));
      assertTrue(NumericUtility.isOctalNumber(2245));
      assertFalse(NumericUtility.isOctalNumber(null));
      assertFalse(NumericUtility.isOctalNumber(8));
      assertFalse(NumericUtility.isOctalNumber(9));
      assertFalse(NumericUtility.isOctalNumber(18));
      assertFalse(NumericUtility.isOctalNumber(198));
   }
}
