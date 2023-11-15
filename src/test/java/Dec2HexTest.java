import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    @Test
    public void testDecimalToHexConversion() {
        String result = Dec2Hex.convertDecimalToHex(15);
        assertEquals("F", result);

        result = Dec2Hex.convertDecimalToHex(1);
        assertEquals("1", result);

        result = Dec2Hex.convertDecimalToHex(25);
        assertEquals("19", result);

        result = Dec2Hex.convertDecimalToHex(30);
        assertEquals("1E", result);

        result = Dec2Hex.convertDecimalToHex(106);
        assertEquals("6A", result);
    }

    @Test
    public void testInvalidInput() {
        String result = Dec2Hex.convertDecimalToHex(-1);
        assertEquals("Enter non negative number.", result);
    }
}



