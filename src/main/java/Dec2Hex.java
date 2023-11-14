import java.util.Scanner;

public class Dec2Hex {

    public static void main(String args[]) {
        try {
            if (args.length == 0) {
                System.out.println("Please provide a decimal number as a comman>
                return;
            }

            int decimalNumber = Integer.parseInt(args[0]);

            if (decimalNumber < 0) {
                System.out.println("Please provide a non-negative decimal numbe>
                return;
            }

            char hexChars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'>
            int rem;
        String hexadecimal = "";
            System.out.println("Converting the Decimal Value " + decimalNumber >

            while (decimalNumber != 0) {
                rem = decimalNumber % 16;
                hexadecimal = hexChars[rem] + hexadecimal;
                decimalNumber = decimalNumber / 16;
            }

            System.out.println("Hexadecimal representation is: " + (hexadecimal>

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid decimal n>
        }
    }
}
