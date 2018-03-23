package com.github.chandanv89.java.conversions;

import java.util.ArrayList;

/**
 * The type Decimal to any base.
 *
 * @author Varun Upadhyay (https://github.com/varunu28)
 */
public class DecimalToAnyBase implements NumericConverter<String, Integer> {
   public static final int BINARY = 2;
   public static final int OCTAL = 8;
   public static final int DECIMAL = 10;
   public static final int HEXA = 16;

   private int base;

   /**
    * Instantiates a new Decimal to any base.
    */
   public DecimalToAnyBase() {
      this.base = DECIMAL;
   }

   /**
    * Instantiates a new Decimal to any base.
    *
    * @param base the base
    */
   public DecimalToAnyBase(int base) {
      this.base = base;
   }

   /**
    * This method produces character value of the input integer and returns it
    *
    * @param base integer of which we need the character value of
    * @return character value of input integer
    */
   private static char reVal(int base) {
      if (base >= 0 && base <= 9)
         return (char) (base + '0');
      else
         return (char) (base - 10 + 'A');
   }

   @Override
   public String convert(Integer number) {
      if (base <= 0) throw new IllegalStateException("Base cannot be less than 1!");

      ArrayList<Character> charArr = new ArrayList<>();

      while (number > 0) {
         charArr.add(reVal(number % base));
         number /= base;
      }

      StringBuilder str = new StringBuilder(charArr.size());

      for (Character c : charArr) {
         str.append(c);
      }

      return str.reverse().toString();
   }
}
