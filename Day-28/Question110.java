import java.util.Scanner;

public class Question110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Create Your Bank Account ---");
        System.out.print("Enter Account Holder Name: ");
        String name = in.nextLine();
        System.out.print("Enter Account Number: ");
        String accNumber = in.nextLine();
        double balance = 1000.00; //the balance has a default account 
        boolean run = true; //Boolean variable to control the processing of the loop 
        while (run) {
            System.out.println("\n--- Welcome, " + name + " (Acc: " + accNumber + ") ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = in.nextInt();
            //We use Switch here 
            switch (choice) { 
                case 1: //Case 1: To Check balance 
                    System.out.printf("Current Balance: %.2f\n", balance);
                    break;

                case 2: //Case 2: To Deposit Money 
                    System.out.print("Enter deposit amount: ");
                    double deposit = in.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Deposited %.2f. New Balance: %.2f\n", deposit, balance);
                    } else {
                        System.out.println("Amount must be positive!");
                    }
                    break;

                case 3: //Case 3: To withdraw Money  if the balance is sufficient 
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = in.nextDouble();
                    if (withdrawal > balance) {
                        System.out.println("Transaction Declined: Insufficient Balance!");
                    } else if (withdrawal <= 0) {
                        System.out.println("Amount must be greater than zero!");
                    } else {
                        balance -= withdrawal;
                        System.out.printf("Withdrew %.2f. Remaining Balance: %.2f\n", withdrawal, balance);
                    }
                    break;

                case 4: //Case 4: To exit out of the system
                    System.out.println("Thank you for banking with us!");
                    run = false;
                    break;

                default:
                    System.out.println("Invalid Option! Please select from 1 to 4.");
                    break;
            }
        }
        in.close();
    }
}