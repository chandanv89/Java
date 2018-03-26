package com.github.chandanv89.java.others;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * The type Test abecedarian.
 */
public class TestAbecedarian {
   @Test
   public void testAbecedarian() {
      String[] testStrings = {"abcd", "xyz", "def", "stu"};

      for (String str : testStrings)
         assertTrue("Not an Abecedrian! (" + str + ")", Abecedarian.isAbecedarian(str));
   }
}