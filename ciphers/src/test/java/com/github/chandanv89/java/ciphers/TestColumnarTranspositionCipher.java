package com.github.chandanv89.java.ciphers;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

/**
 * The type Test columnar transposition cipher.
 */
public class TestColumnarTranspositionCipher {

   /**
    * Test columnar transposition cipher.
    */
   @Test
   public void testColumnarTranspositionCipher_default_success() {
      String originalMessage = "ColumnarTranspositionCipher";
      String passcode = UUID.randomUUID().toString();
      System.out.println("Original Message: " + originalMessage);
      String encryptedMessage = ColumnarTranspositionCipher.encrpyter(originalMessage, passcode);
      System.out.println("Encrypted Message: " + encryptedMessage);

      String decryptedMessage = ColumnarTranspositionCipher.decrypter();
      System.out.println("Decrypted Message: " + decryptedMessage);

      assertEquals("Decrypted message didn't match with the original message!", originalMessage, decryptedMessage);
   }
}
