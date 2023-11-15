import java.util.Scanner;

public class Dec2Hex {

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("No input provided. enter an integer.");
            return;
        }

        try {
            int decimal = Integer.parseInt(args[0]);
            if (decimal < 0) {
                System.out.println("Enter non-negative number.");
                return;
            }

            String hexadecimal = convertDecimalToHex(decimal);

            System.out.println("Hexadecimal representation is: " + hexadecimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
        }
    }

    public static String convertDecimalToHex(int decimal) {
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        StringBuilder hexadecimal = new StringBuilder();

        while (decimal != 0) {
            rem = decimal % 16;
            hexadecimal.insert(0, ch[rem]);
            decimal = decimal / 16;
        }

        return hexadecimal.toString();
    }
}




