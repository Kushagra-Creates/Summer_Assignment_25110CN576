import java.util.Scanner;

public class Question104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = 0;
        char answer;
        //We'll use 3 predefined questions here otherwise we'll have to call an external api in order to get new changing questions 
        System.out.println("---Welcome to the Quiz---");

        // Question 1
        System.out.println("\nQ1. Which language is used for Android Development?");
        System.out.println("A. Swift\nB. Java\nC. C++\nD. Python");
        System.out.print("Your Answer: ");
        answer = in.next().toUpperCase().charAt(0);
        if (answer == 'B') {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! Correct answer is B.");
        }

        // Question 2
        System.out.println("\nQ2. What is the brain of a computer called?");
        System.out.println("A. RAM\nB. Hard Disk\nC. CPU\nD. Monitor");
        System.out.print("Your Answer: ");
        answer = in.next().toUpperCase().charAt(0);
        if (answer == 'C') {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! Correct answer is C.");
        }

        // Question 3
        System.out.println("\nQ3. Which of these is a database management system?");
        System.out.println("A. MySQL\nB. HTML\nC. CSS\nD. Java");
        System.out.print("Your Answer: ");
        answer = in.next().toUpperCase().charAt(0);
        if (answer == 'A') {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! Correct answer is A.");
        }

        // Final Score Display
        System.out.println("\n--- Quiz Finished ---");
        System.out.println("Your Score: " + score + " out of 3");
        
        in.close();
    }
}