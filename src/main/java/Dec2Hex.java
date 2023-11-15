import java.util.Scanner;

class Dec2Hex {

	public static String convertDecimalToHex(int decimal) {
		if (decimal < 0) {
            		return "Please enter a non negative number.";
		}
		
		char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		String hexadecimal = "";

		while (decimal != 0) {
			int rem = decimal % 16;
			hexadecimal = ch[rem] + hexadecimal;
			decimal = decimal / 16;
		}

		return hexadecimal;
	}

	public static void main(String args[]) {
		if (args.length == 0) {
			System.out.println("Please provide an argument to the program. E.g. 15");
			System.exit(0);
		} else {
			try {
				for ( String arg : args ) {
					int intArg = Integer.parseInt(arg);
					String result = convertDecimalToHex(intArg);
					System.out.println("Hexadecimal representation is: " + result);
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Invalid argument. Please provide a valid integer.");
				System.exit(0);
			}
		}
	}
}



