public class Dec2Hex {

    public static String convertDecimalToHex(int decimal) {
        if (decimal < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        if (decimal == 0) {
            return "0";
        }

        StringBuilder hex = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            hex.insert(0, Integer.toHexString(remainder));
            decimal = decimal / 16;
        }

        return hex.toString();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Error:Please enter an integer.");
            System.exit(1);
        }

        try {
            int decimal = Integer.parseInt(args[0]);
            String hex = convertDecimalToHex(decimal);
            System.out.println("Hexadecimal representation is: " + hex);
        } catch (NumberFormatException e) {
            System.err.println("Error: Input must be a valid integer.");
            System.exit(1);
        }
    }
}
