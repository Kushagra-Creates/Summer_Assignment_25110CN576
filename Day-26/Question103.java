import java.util.Scanner;

public class Question103 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Initialize a random starting account balance and a default secret PIN
        double balance = 5000.00;
        int originalPin = 1234;
        
        System.out.println("--- Welcome to the Automated Teller Machine (ATM) ---");
        
        // Step 1: Secure PIN Verification Check
        System.out.print("Please enter your 4-digit PIN: (default is: 1234)");
        if (!in.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number, Transaction terminated.");
            in.close();
            return;
        }
        
        int enteredPin = in.nextInt();
        if (enteredPin != originalPin) {
            System.out.println("Incorrect PIN! Access Denied.");
            in.close();
            return;
        }
        
        // ATM Main Menu Loop using a While 
        while (true) {
            System.out.println("\n--ATM MAIN MENU--");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            
            if (!in.hasNextInt()) {
                System.out.println("Invalid choice. Please pick an option from the menu.");
                in.next(); // Clear the invalid input buffer
                continue;
            }
            
            int choice = in.nextInt();
            //We use a switch statement to operate the Simulation
            switch (choice) {
                case 1:
                    // Check Balance
                    System.out.printf("Your current balance is: \n"+  balance);
                    break;
                    
                case 2:
                    // Deposit Money
                    System.out.print("Enter amount to deposit: ");
                    if (in.hasNextDouble()) {
                        double depositAmount = in.nextDouble();
                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.printf("Successfully deposited: "+depositAmount+", New Balance: "+ balance);
                        } else {
                            System.out.println("Deposit amount must be positive!");
                        }
                    } else {
                        System.out.println("Invalid numerical amount.");
                        in.next(); // Clear input buffer
                    }
                    break;
                    
                case 3:
                    // Withdraw Money
                    System.out.print("Enter amount to withdraw: ");
                    if (in.hasNextDouble()) {
                        double withdrawAmount = in.nextDouble();
                        if (withdrawAmount > balance) {
                            System.out.println("Transaction Failed: Insufficient Balance!");
                        } else if (withdrawAmount <= 0) {
                            System.out.println("Withdrawal amount must be greater than zero");
                        } else {
                            balance -= withdrawAmount;
                            System.out.printf("Please collect your cash.\nSuccessfully withdrew: "+withdrawAmount+", Remaining Balance: "+ balance);
                        }
                    } else {
                        System.out.println("Invalid numerical amount.");
                        in.next(); // Clear input buffer
                    }
                    break;
                    
                case 4:
                    // Exit Program 
                    System.out.println("Thank you for using our ATM service. Goodbye!");
                    in.close();
                    return; // Terminates the entire program cleanly
                    
                default:
                    System.out.println("Invalid choice! Please select a valid option from 1 to 4.");
            }
        }
    }
}