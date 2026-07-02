import java.util.Random;
import java.util.Scanner;

public class Question101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        
        // We generate a random number between 1 and 100 using the java random class
        int targetNumber = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;
        
        System.out.println("--Welcome adventurer to this Game of Chances--");
        System.out.println("I have selected a number between 1 and 100 and you're job is to try and guess it!");
        System.out.println("And in the end if you founnd the number We'll see how many tries it took you");
        
        // general game loop
        while (true) {
            System.out.print("Enter your guess: ");
            
            // Check if user input is an actual integer
            if (!in.hasNextInt()) {
                System.out.println("Have you failed Maths in preschool, Try and use that brain of yours.");
                System.out.println("Give them rusted gears a spin, Let's Do this once again: ");
                in.next(); // Clear the invalid input buffer
                continue;
            }
            
            guess = in.nextInt();
            numberOfTries++;
            
            // Check the guess against the target
            if (guess < targetNumber) {
                System.out.println("Too Low! raise you're expectations and Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too High! you're going ahead of yourself, Try again.");
            } else {
                // Correct guess handles termination
                System.out.println("\n--Congratulations! You've guessed the right number!--");
                System.out.println("The number was: " + targetNumber);
                System.out.println("It took you " + numberOfTries + " attempts.");
                if(numberOfTries!=1)
                System.out.println("|Well done but next time I wanna see the number of tries lower|");
                else
                    System.out.println("You...Are you the Chosen one!!");
                break; // Exit the game loop
            }
        }
        
        in.close();
    }
}