import java.util.Scanner;

public class Question113{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;

        System.out.println("--- Welcome to the Simple Calculator ---");

        while (running) {
            // Display Menu options
            System.out.println("\n*** CALCULATOR MENU ***");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");
            int choice = in.nextInt();

            // Handling numbers and calculation depending on the choice
            switch (choice) {
                case 1://Case 1: Addition of two numbers 
                    System.out.print("Enter first number: ");
                    double num1 = in.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = in.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;

                case 2: //Case 2: Subtraction of two Numbers
                    System.out.print("Enter first number: ");
                    num1 = in.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = in.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;

                case 3: //Case 3: Multiplication of two numbers
                    System.out.print("Enter first number: ");
                    num1 = in.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = in.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                    break;

                case 4: //Case 4: Division of two numbers
                    System.out.print("Enter first number: ");
                    num1 = in.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = in.nextDouble();
                    
                    // Critical safety check to prevent dividing by zero
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;

                case 5: // Exiting the Program
                    System.out.println("Thank you for using the calculator. Goodbye!");
                    running = false; // Stops the loop
                    break;

                default:
                    System.out.println("Invalid choice! Please pick an option from 1 to 5.");
                    break;
            }
        }
        in.close();
    }
}