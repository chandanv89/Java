package com.github.chandanv89.java.ciphers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The type Test rsa.
 */
public class TestRsa {
   /**
    * Test rsa.
    */
   @Test
   public void testRsa() {
      RSA rsa = new RSA(1024);

      String originalMsg = "This is a message";
      System.out.println("Original Message: " + originalMsg);

      String encryptedMsg = rsa.encrypt(originalMsg);
      System.out.println("Encrypted Message: " + encryptedMsg);

      String decryptedMsg = rsa.decrypt(encryptedMsg);
      System.out.println("Decrypted Message: " + decryptedMsg);

      assertEquals("Decrypted message didn't match with the original message!", originalMsg, decryptedMsg);
   }
}
