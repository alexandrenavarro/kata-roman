package com.github.alexandrenavarro.kataroman;

import static org.assertj.core.api.Assertions.assertThat;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * <p>RomanMapperTest. </p>
 *
 * @author anavarro - Apr 27, 2016
 *
 */
@RunWith(JUnitParamsRunner.class)
public final class RomanMapperTest {

    /**
     * should_return_roman_number_when_a_numeric_number_is_set.
     *
     * @param romanNumber
     * @param numericNumber
     */
    @Test
    @Parameters({ "I, 1", "II, 2", "III, 3", "IV, 4", "V, 5", "VI, 6", "VII, 7", "VIII, 8", "IX, 9", "X, 10", "XI, 11", "XIV, 14", "XV, 15",
            "XIX, 19", "XX, 20", "XXIV, 24", "XXIX, 29", "XL, 40", "XLIX, 49", "LI, 51", "LXIX, 69", "LXXIX, 79", "LXXXIX, 89", "XC, 90", "XCII, 92",
            "XCIX, 99", "C, 100", "DI, 501", "DL, 550", "DXXX, 530", "DCCVII, 707", "DCCCXC, 890", "MD, 1500", "MDCCC, 1800", "CM, 900", "M, 1000",
            "MMM, 3000" })
    public void should_return_roman_number_when_a_numeric_number_is_set(final String romanNumber, final int numericNumber) {
        assertThat(RomanNumberMapper.mapToRomanNumber(numericNumber)).isEqualTo(romanNumber);
    }

}
