//https://youtu.be/BZwIsKUVAzk
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		boolean rest = true, isPrinted = false;

		while (rest != false) {
			double numInput = 0.0, result = 0.0;
			int num;
			String input;

			System.out.println("Enter the calculator mode: Standard/Scientific?");
			input = scnr.next();
			input = input.toLowerCase();

			if (input.equals("standard")) {

				System.out.println("The calculator will operate in standard mode.");
				while (isPrinted == false) {
					System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");

					input = scnr.next();
					input = input.toLowerCase();
					switch (input) {
					case "+":
						System.out.println("How many numbers do you want to add?");
						num = scnr.nextInt();
						System.out.println("Enter " + num + " numbers");
						for (int i = 0; i < num; i++) {
							numInput = scnr.nextDouble();
							result += numInput;
						}
						isPrinted = true;
						break;
					case "-":
						System.out.println("How many numbers do you want to subtract?");
						num = scnr.nextInt();
						System.out.println("Enter " + num + " numbers");
						for (int i = 0; i < num; i++) {
							numInput = scnr.nextDouble();

							if (i == 0) {
								result = numInput;
							} else {
								result -= numInput;
							}
						}
						isPrinted = true;
						break;
					case "*":
						System.out.println("How many numbers do you want to multiply?");
						num = scnr.nextInt();
						System.out.println("Enter " + num + " numbers");
						result = 1;
						for (int i = 0; i < num; i++) {
							numInput = scnr.nextDouble();
							result *= numInput;
						}
						isPrinted = true;
						break;
					case "/":
						System.out.println("How many numbers do you want to divide?");
						num = scnr.nextInt();
						System.out.println("Enter " + num + " numbers");
						for (int i = 0; i < num; i++) {
							numInput = scnr.nextDouble();
							if (i == 0) {
								result = numInput;
							} else {
								result /= numInput;
							}
						}
						isPrinted = true;
						break;
					default:
						System.out.println("Invalid operator " + input);
					}
				}
			}

			else if (input.equals("scientific")) {

				System.out.println("The calculator will operate in scientific mode.");

				while (isPrinted == false) {
					System.out.println(
							"Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");

					input = scnr.next();
					input = input.toLowerCase();
					switch (input) {
					case "+":
						System.out.println("How many numbers do you want to add?");
						num = scnr.nextInt();
						System.out.println("Enter " + num + " numbers");
						for (int i = 0; i < num; i++) {
							numInput = scnr.nextDouble();
							result += numInput;
						}
						isPrinted = true;
						break;
					case "-":
						System.out.println("How many numbers do you want to subtract?");
						num = scnr.nextInt();
						System.out.println("Enter " + num + " numbers");
						for (int i = 0; i < num; i++) {
							numInput = scnr.nextDouble();
							if (i == 0) {
								result = numInput;
							} else {
								result -= numInput;
							}
						}
						isPrinted = true;
						break;
					case "*":
						System.out.println("How many numbers do you want to multiply?");
						num = scnr.nextInt();
						System.out.println("Enter " + num + " numbers");
						result = 1;
						for (int i = 0; i < num; i++) {
							numInput = scnr.nextDouble();
							result *= numInput;
						}
						isPrinted = true;
						break;
					case "/":
						System.out.println("How many numbers do you want to divide?");
						num = scnr.nextInt();
						System.out.println("Enter " + num + " numbers");
						for (int i = 0; i < num; i++) {
							numInput = scnr.nextDouble();

							if (i == 0) {
								result = numInput;
							} else {
								result /= numInput;
							}
						}
						isPrinted = true;
						break;
					case "sin":
						System.out.println("Enter a number in radians to find the sine");
						numInput = scnr.nextInt();
						result = Math.sin(numInput);
						isPrinted = true;
						break;

					case "cos":
						System.out.println("Enter a number in radians to find the cosine");
						numInput = scnr.nextInt();
						result = Math.cos(numInput);
						isPrinted = true;
						break;
					case "tan":
						System.out.println("Enter a number in radians to find the tangent");
						numInput = scnr.nextInt();
						result = Math.tan(numInput);
						isPrinted = true;
						break;
					default:
						System.out.println("Invalid operator " + input);
					}
				}

			}

			if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/") || input.equals("sin") || input.equals("cos") || input.equals("tan")) {
				System.out.println("Result: " + result);
				System.out.println("Do you want to start over? (Y/N)");

				input = scnr.next();
				input = input.toLowerCase();

				if (input.equals("n")) {
					rest = false;
				} else {
					isPrinted = false;
				}
			}

		}
		System.out.println("Goodbye");
		scnr.close();
	}
}