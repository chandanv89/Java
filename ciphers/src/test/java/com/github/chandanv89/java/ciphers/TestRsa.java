package com.github.chandanv89.java.ciphers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRsa {
    @Test
    void testRsa() {
        RSA rsa = new RSA(1024);

        String originalMsg = "This is a message";
        System.out.println("Original Message: " + originalMsg);

        String encryptedMsg = rsa.encrypt(originalMsg);
        System.out.println("Encrypted Message: " + encryptedMsg);

        String decryptedMsg = rsa.decrypt(encryptedMsg);
        System.out.println("Decrypted Message: " + decryptedMsg);

        assertEquals(originalMsg, decryptedMsg, "Decrypted message didn't match with the original message!");
    }
}
