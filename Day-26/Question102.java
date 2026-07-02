import java.util.Scanner;

public class Question102 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("--This is a Voting Eligibility System--");
        System.out.print("Please enter your age: ");
        
        // We ensure the user actually entered an integer
        if (in.hasNextInt()) {
            int age = in.nextInt();
            
            // we validate if the user entered an unrealistic or negative numbers
            if (age < 0 || age > 150) {
                System.out.println("Invalid Entry! Please enter a realistic age.");
            } 
            // We check voting age criteria usually it's 18+
            else if (age >= 18) {
                System.out.println("Status: YOU ARE ELIGIBLE TO VOTE.");
                System.out.println("You can cast your vote in the upcoming elections.");
            } 
            //We handle underage scenario
            else {
                int yearsLeft = 18 - age;
                System.out.println("Status: YOU ARE NOT ELIGIBLE TO VOTE.");
                System.out.println("You are currently not eligible to vote. You will be eligible in " + yearsLeft + " year(s).");
            }
        } else {
            System.out.println("Error: Please enter age as a valid numerical value.");
        }
        
        in.close();
    }
}