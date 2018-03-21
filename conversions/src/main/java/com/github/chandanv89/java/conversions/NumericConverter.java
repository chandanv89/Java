package com.github.chandanv89.java.conversions;

/**
 * The interface Numeric converter.
 *
 * @param <T> the resulting type of the numeric conversion.
 * @param <U> the input type of the number being converted to.
 */
public interface NumericConverter<T, U> {
   /**
    * Convert object.
    *
    * @param number the number being converted.
    * @return the converted numeric form.
    */
   T convert(U number);
}
