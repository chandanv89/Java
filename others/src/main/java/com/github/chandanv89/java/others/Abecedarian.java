package com.github.chandanv89.java.others;
//Oskar Enmalm 29/9/17
//An Abecadrian is a word where each letter is in alphabetical order

/**
 * The type Abecedarian.
 */
public class Abecedarian {

   /**
    * Is abecedarian boolean.
    *
    * @param s the s
    * @return the boolean
    */
   public static boolean isAbecedarian(String s) {
      int index = s.length() - 1;

      for (int i = 0; i < index; i++) {

         if (s.charAt(i) <= s.charAt(i + 1)) {
         } //Need to check if each letter for the whole word is less than the one before it

         else {
            return false;
         }
      }
      return true;
   }
}
