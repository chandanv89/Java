package com.github.chandanv89.java.others;

/***
 * A number is said to be Krishnamurthy number if it is equal to
 * the sum all the factorials of its digits.
 *
 * For example: 145 -> 1! + 4! + 5! -> 1 + 24 + 120 -> 145
 *
 * For explanation: http://j.mp/2I6aGYz
 *
 * @Author chandanv89
 */
public class KrishnamurthyNumber {
   /**
    * Is valid boolean.
    *
    * @param number the number
    * @return the boolean
    */
   public static boolean isValid(int number) {
      int a, b, s = 0;
      a = number;
      while (a > 0) {
         b = a % 10;
         s = s + fact(b);
         a = a / 10;
      }
      return s == number;
   }

   /**
    * Fact int.
    *
    * @param n the n
    * @return the int
    */
   private static int fact(int n) {
      int i, p = 1;
      for (i = n; i >= 1; i--)
         p = p * i;
      return p;
   }
}
