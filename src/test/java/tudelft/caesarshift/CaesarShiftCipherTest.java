package tudelft.caesarshift;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void wrap() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        assertTrue(csc.CaesarShiftCipher("zab", 1).equals("abc"));
    }
}
