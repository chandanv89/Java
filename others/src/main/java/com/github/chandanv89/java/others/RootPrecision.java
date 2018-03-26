package com.github.chandanv89.java.others;

/**
 * The type Root precision.
 */
public class RootPrecision {
   /**
    * Square root double.
    *
    * @param N is the input number
    * @param P is precision value for eg - P is 3 in 2.564 and 5 in 3.80870.
    * @return the double
    */
   public static double squareRoot(int N, int P) {
      double rv;

      double root = Math.pow(N, 0.5);

//calculate precision to power of 10 and then multiply it with root value.
      int precision = (int) Math.pow(10, P);
      root = root * precision;
/*typecast it into integer then divide by precision and again typecast into double
so as to have decimal points upto P precision */

      rv = (int) root;
      return rv / precision;
   }
}
