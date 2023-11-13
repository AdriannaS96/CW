import java.util.Scanner;

class Dec2Hex {
    public static void main(String args[]) {
        if (args.length > 0) {
            try {
                int arg1 = Integer.parseInt(args[0]);
                if (arg1 >= 0) {
                    char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                    String hexadecimal = "";

                    System.out.println("Converting the Decimal Value " + arg1 + " to Hex...");

                    while (arg1 != 0) {
                        int rem = arg1 % 16;
                        hexadecimal = ch[rem] + hexadecimal;
                        arg1 = arg1 / 16;
                    }

                    System.out.println("Hexadecimal representation is: " + hexadecimal);
                } else {
                    System.out.println("Invalid input. Please provide a non-negative integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide a valid integer.");
            }
        } else {
            System.out.println("No input provided. Please provide an integer.");
        }
    }
}
