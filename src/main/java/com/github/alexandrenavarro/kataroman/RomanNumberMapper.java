package com.github.alexandrenavarro.kataroman;

/**
 * <p>RomanMapper. </p>
 *
 * @author anavarro - Apr 26, 2016
 *
 */
public final class RomanNumberMapper {


    /**
     * mapToRomanNumber.
     *
     * @param aNumericNumber
     * @return
     */
    public static String mapToRomanNumber(final int aNumericNumber) {
        for (final RomanNumber roman : RomanNumber.values()) {
            if (aNumericNumber >= roman.getNumericNumber()) {
                return roman.toString() + mapToRomanNumber(aNumericNumber - roman.getNumericNumber());
            }
        }
        return "";
    }

}
