package com.github.chandanv89.java.conversions;

import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;

public class TestAnyBaseToAnyBase {
   @Test
   public void test_dec2bin() {
      String n = "10";
      int fromBase = 10;
      int toBase = 2;
      try {
         assertEquals("1010", AnyBaseToAnyBase.base2base(n, fromBase, toBase));
      } catch (InputMismatchException e) {
         System.err.println("Invalid input.");
      }
   }

   @Test
   public void test_dec2hex() {
      String n = "10";
      int fromBase = 10;
      int toBase = 16;
      try {
         assertEquals("A", AnyBaseToAnyBase.base2base(n, fromBase, toBase));
      } catch (InputMismatchException e) {
         System.err.println("Invalid input.");
      }
   }

   @Test
   public void test_dec2oct() {
      String n = "10";
      int fromBase = 10;
      int toBase = 8;
      try {
         assertEquals("12", AnyBaseToAnyBase.base2base(n, fromBase, toBase));
      } catch (InputMismatchException e) {
         System.err.println("Invalid input.");
      }
   }

   @Test
   public void test_dec25() {
      String n = "10";
      int fromBase = 10;
      int toBase = 5;
      try {
         assertEquals("20", AnyBaseToAnyBase.base2base(n, fromBase, toBase));
      } catch (InputMismatchException e) {
         System.err.println("Invalid input.");
      }
   }
}
