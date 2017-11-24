package com.github.chandanv89.java.ciphers;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        assertEquals(originalMessage, decryptedMessage, "Decrypted message didn't match with the original message!");
    }
}
