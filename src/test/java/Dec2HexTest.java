import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    @Test
    public void testDecimalToHexConversion() {
        assertEquals("F", Dec2Hex.convertDecimalToHex(15));
        assertEquals("1", Dec2Hex.convertDecimalToHex(1));
        assertEquals("19", Dec2Hex.convertDecimalToHex(25));
        assertEquals("1E", Dec2Hex.convertDecimalToHex(30));
        assertEquals("6A", Dec2Hex.convertDecimalToHex(106));
        assertEquals("0", Dec2Hex.convertDecimalToHex(0));
    }

    @Test
    public void testInvalidInput() {
        assertEquals("Enter non-negative number.", Dec2Hex.convertDecimalToHex(-1));
    }
}






