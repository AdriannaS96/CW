import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    @Test
    public void testDecimalToHexConversion() {
        assertEquals("0", Dec2Hex.convertDecimalToHex(0));
        assertEquals("1", Dec2Hex.convertDecimalToHex(1));
        assertEquals("A", Dec2Hex.convertDecimalToHex(10));
        assertEquals("F", Dec2Hex.convertDecimalToHex(15));
        assertEquals("10", Dec2Hex.convertDecimalToHex(16));
        assertEquals("1F", Dec2Hex.convertDecimalToHex(31));
        assertEquals("64", Dec2Hex.convertDecimalToHex(100));
        assertEquals("FF", Dec2Hex.convertDecimalToHex(255));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        Dec2Hex.convertDecimalToHex(-1);
    }

    @Test
    public void testInvalidInput() {
        assertNull(Dec2Hex.convertDecimalToHex(-1));
        assertNull(Dec2Hex.convertDecimalToHex(Integer.MIN_VALUE));
        assertNull(Dec2Hex.convertDecimalToHex(Integer.MAX_VALUE));
        assertNull(Dec2Hex.convertDecimalToHex(Integer.MIN_VALUE + 1));
        assertNull(Dec2Hex.convertDecimalToHex(Integer.MAX_VALUE - 1));
    }
}


