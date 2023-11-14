import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a decimal number: ");
            int decimalNumber = scanner.nextInt();
            scanner.close();

            if (decimalNumber < 0) {
                System.out.println("Please provide a non-negative decimal number.");
                return;
            }

            StringBuilder hexNumber = new StringBuilder();
            while (decimalNumber != 0) {
                int rem = decimalNumber % 16;
                char hexDigit = (rem < 10) ? (char) (rem + '0') : (char) (rem - 10 + 'A');
                hexNumber.insert(0, hexDigit);
                decimalNumber = decimalNumber / 16;
            }

            System.out.println("Hexadecimal equivalent: " + hexNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid decimal number.");
        }
    }
}

