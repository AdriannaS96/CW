import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    @Test
    public void testDecimalToHexConversion() {
        assertEqual("F", Dec2Hex.convertDecimalToHex(15));
        assertEqual("1", Dec2Hex.convertDecimalToHex(1));
        assertEqual("19", Dec2Hex.convertDecimalToHex(25));
        assertEqual("1E", Dec2Hex.convertDecimalToHex(30));
        assertEqual("6A", Dec2Hex.convertDecimalToHex(106));
        assertEqual("0", Dec2Hex.convertDecimalToHex(0));
    }

    @Test
    public void testInvalidInput() {
        assertEqual("Enter non-negative number.", Dec2Hex.convertDecimalToHex(-1));
    }

    private void assertEqual(String expected, String actual) {
        try {
            assertEquals(expected, actual);
        } catch (AssertionError e) {
            System.out.println("Assertion Error: " + e.getMessage());
            throw e;
        }
    }
}





