import java.util.Scanner;
public class Question108 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Academic Marksheet Generator ---");
        System.out.print("Enter Student Name: ");
        String studentName = in.nextLine();
        System.out.print("Enter Roll Number: ");
        String rollNum = in.nextLine();
        // Collecting marks for three core modules
        System.out.print("Enter marks for Mathematics (out of 100): ");
        int math = in.nextInt();
        System.out.print("Enter marks for Science (out of 100): ");
        int science = in.nextInt();
        System.out.print("Enter marks for English (out of 100): ");
        int english = in.nextInt();
        // Total Aggregrate 
        int totalCalculated = math + science + english;
        double overallPercentage = (totalCalculated / 300.0) * 100;
        String finalGrade;
        if (overallPercentage >= 90) finalGrade = "A";
        else if (overallPercentage >= 75) finalGrade = "B";
        else if (overallPercentage >= 60) finalGrade = "C";
        else if (overallPercentage >= 50) finalGrade = "D";
        else finalGrade = "Fail (F)";
        // Visualizing Output layout
        System.out.println("\n*************************************************");
        System.out.println("               OFFICIAL REPORT CARD              ");
        System.out.println("*************************************************");
        System.out.println("Student Name: " + studentName + " | Roll No: " + rollNum);
        System.out.println("-------------------------------------------------");
        System.out.println("Mathematics : " + math + " / 100");
        System.out.println("Science     : " + science + " / 100");
        System.out.println("English     : " + english + " / 100");
        System.out.println("-------------------------------------------------");
        System.out.println("GRAND TOTAL : " + totalCalculated + " / 300");
        System.out.printf("PERCENTAGE  : %.2f%%\n", overallPercentage);
        System.out.println("FINAL GRADE : " + finalGrade);
        System.out.println("===================================================");
        in.close();
    }
}