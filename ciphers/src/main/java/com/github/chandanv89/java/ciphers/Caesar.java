package com.github.chandanv89.java.ciphers;

/**
 * The type Caesar.
 * <p> A Java implementation of com.github.chandanv89.java.ciphers.Caesar Cipher.</p>
 * <p>It is a type of substitution cipher in which each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet.</p>
 *
 * @author : FAHRI YARDIMCI
 */
public class Caesar {
   /**
    * Encode string.
    *
    * @param message the message
    * @param shift   the shift
    * @return the string
    */
   public static String encode(String message, int shift) {
      StringBuilder encoded = new StringBuilder();
      for (int i = 0; i < message.length(); i++) {
         int current = message.charAt(i); //using char to shift characters because ascii is in-order latin alphabet
         if (current == 32) {
            encoded.append(" ");
         } else if (current >= 65 && current <= 90) {
            int numAlphabet = message.charAt(i);
            if (shift + numAlphabet > 90) {
               int j = 90 - numAlphabet;
               char nextKey = (char) (65 + (shift - j - 1));
               encoded.append(nextKey);

            } else {
               char nextKey = (char) (current + shift);
               encoded.append(nextKey);
            }
         } else if (current >= 97 && current <= 122) {
            int numAlphabet = message.charAt(i);
            if (shift + numAlphabet > 122) {
               int j = 122 - numAlphabet;
               char nextKey = (char) (97 + (shift - j - 1));
               encoded.append(nextKey);
            } else {
               char nextKey = (char) (current + shift);
               encoded.append(nextKey);
            }
         }
      }
      return encoded.toString();
   }

   /**
    * Decode string.
    *
    * @param message the message
    * @param shift   the shift
    * @return the string
    */
   public static String decode(String message, int shift) {
      StringBuilder decoded = new StringBuilder();
      for (int i = 0; i < message.length(); i++) {
         int current = message.charAt(i);
         if (current == 32) {
            decoded.append(" ");
         } else if (current >= 65 && current <= 90) {
            int numAlphabet = message.charAt(i);
            if (numAlphabet - shift < 65) {
               int j = numAlphabet - 65;
               char nextKey = (char) (90 - (shift - j - 1));
               decoded.append(nextKey);

            } else {
               char nextKey = (char) (current - shift);
               decoded.append(nextKey);
            }
         } else if (current >= 97 && current <= 122) {
            int numAlphabet = message.charAt(i);
            if (numAlphabet - shift < 97) {
               int j = numAlphabet - 97;
               char nextKey = (char) (122 - (shift - j - 1));
               decoded.append(nextKey);
            } else {
               char nextKey = (char) (current - shift);
               decoded.append(nextKey);
            }
         }
      }
      return decoded.toString();
   }
}