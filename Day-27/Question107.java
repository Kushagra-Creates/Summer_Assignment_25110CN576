import java.util.Scanner;

public class Question107 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Indian Salary Calculator ---");
        System.out.print("Enter Employee Name: ");
        String name = in.nextLine();
        System.out.print("Enter Monthly Basic Salary (): ");
        double basic = in.nextDouble();
        //General Salary components 
        double hra = basic * 0.40;  // 40% House Rent Allowance
        double da = basic * 0.10;   // 10% Dearness Allowance
        double pf = basic * 0.12;   // 12% Provident Fund (Deduction)
        // Gross Salary is total earnings before deductions
        double grossSalary = basic + hra + da;
        // Net Salary (In-Hand Pay) is earnings minus deductions
        double netSalary = grossSalary - pf;
        // Displaying the Salary Slip Layout\
        System.out.println("=========================================");
        System.out.println("         MONTHLY SALARY SLIP             ");
        System.out.println("Employee Name :\t " + name);
        System.out.printf("Basic Pay:\t %.2f\n", basic);
        System.out.printf("HRA (40%%):\t %.2f\n", hra);
        System.out.printf("DA (10%%):\t %.2f\n", da);
        System.out.println("-----------------------------------------");
        System.out.printf("GROSS EARNING:\t %.2f\n", grossSalary);
        System.out.printf("PF Deduction (12%%):\t %.2f\n", pf);
        System.out.println("-----------------------------------------");
        System.out.printf("NET IN-HAND PAY:\t %.2f\n", netSalary);
        System.out.println("=========================================");
        in.close();
    }
}