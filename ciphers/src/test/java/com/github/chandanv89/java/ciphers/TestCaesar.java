package com.github.chandanv89.java.ciphers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The type Test caesar.
 */
public class TestCaesar {
   /**
    * Test encode.
    */
   @Test
   public void testCaesar() {
      String message = "Sample Message";
      int shift = 4 % 26;

      String encodedMsg = Caesar.encode(message, shift);
      System.out.println("Encoded Message: " + encodedMsg);

      String decodedMsg = Caesar.decode(encodedMsg, shift);
      System.out.println("Decoded Message: " + decodedMsg);

      assertEquals("Decoded message didn't match with the original message!", message, decodedMsg);
   }
}
