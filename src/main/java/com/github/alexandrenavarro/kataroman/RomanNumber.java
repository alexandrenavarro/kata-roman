package com.github.alexandrenavarro.kataroman;


/**
 * <p>RomanNumber. </p>
 *
 * @author anavarro - Apr 27, 2016
 *
 */
public enum RomanNumber {
    
    // Must be order by decimal number desc because of the mapToRomanNumberString 
    M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);
    
    private final int decimalNumber;
    
    /**
     * Constructor.
     *
     * @param aRomanLetter
     * @param aNumber
     */
    private RomanNumber(final int aNumber) {
        this.decimalNumber = aNumber;
    }


    /**
     * getDecimalNumber.
     *
     * @return
     */
    public int getDecimalNumber() {
        return this.decimalNumber;
    }
    
    /**
     * mapToRomanNumberString.
     *
     * @param aDecimalNumber
     * @return
     */
    public static String mapToRomanNumberString(final int aDecimalNumber) {
        for (final RomanNumber roman : RomanNumber.values()) {
            if (aDecimalNumber >= roman.getDecimalNumber()) {
                return roman.toString() + mapToRomanNumberString(aDecimalNumber - roman.getDecimalNumber());
            }
        }
        return "";
    }

    
}
