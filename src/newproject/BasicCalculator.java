package newproject;
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to choose an operation
        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        // Initialize a result variable
        double result = 0;

        // Perform the chosen operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }
        // Display the result
        System.out.println("The result is: " + result);
    }
}



