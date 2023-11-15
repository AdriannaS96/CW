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
        assertEquals("0", Dec2Hex.convertDecimalToHex(0)); // Dodane sprawdzenie dla zera
    }

    @Test
    public void testInvalidInput() {
        // Zmieniono oczekiwany wyjątek z napisu na NumberFormatException
        assertThrows(NumberFormatException.class, () -> Dec2Hex.convertDecimalToHex(-1));
    }

    @Test
    public void testRandomNumber() {
        assertEquals("2A", Dec2Hex.convertDecimalToHex(42));
    }

    @Test
    public void testAnotherNumber() {
        assertEquals("80", Dec2Hex.convertDecimalToHex(128));
    }
}

