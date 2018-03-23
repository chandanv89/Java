package com.github.chandanv89.java.conversions;

/**
 * This class converts Decimal numbers to Octal Numbers
 * Copyright (C) 2018  chandanv89
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
public class DecimalToOctal implements NumericConverter<Integer, Integer> {
   @Override
   public Integer convert(Integer number) {
      int d, s = 0, c = 0;

      while (number != 0) {
         d = number % 8;
         s += d * (int) Math.pow(10, c++);
         number /= 8;
      }

      return s;
   }
}
