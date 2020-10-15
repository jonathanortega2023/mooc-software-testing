package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    private romannumeral roman;
    
    @BeforeEach
    public void initialize() {
        this.roman = new romannumeral();
    }

    @Test
    public void singleNumber() {
        romannumeral roman = new romannumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        romannumeral roman = new romannumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        romannumeral roman = new romannumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        romannumeral roman = new romannumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }
}
