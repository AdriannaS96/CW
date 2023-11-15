public class Dec2Hex {
    public static String convertDecimalToHex(int decimalNumber) {
        if (decimalNumber < 0) {
            return "Please enter a non-negative number.";
        }

        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder hexBuilder = new StringBuilder();
        int temp = decimalNumber;

        while (temp != 0) {
            int remainder = temp % 16;
            char hexDigit = (char) (remainder < 10 ? remainder + '0' : remainder - 10 + 'A');
            hexBuilder.insert(0, hexDigit);
            temp /= 16;
        }

        return hexBuilder.toString();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input provided. Please provide an integer.");
            return;
        }

        try {
            int decimalNumber = Integer.parseInt(args[0]);
            String hexValue = convertDecimalToHex(decimalNumber);
            System.out.println("Hexadecimal representation: " + hexValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid decimal number.");
        }
    }
}



