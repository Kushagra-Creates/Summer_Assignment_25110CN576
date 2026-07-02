import java.util.Scanner;
public class Question111{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalSeats = 50; // Let's say we have total 50 seats in the theater hall
        int bookedSeats = 0;
        int ticketPrice = 150; // Let's say it cost 150 per ticket
        while (true) {
            int availableSeats = totalSeats - bookedSeats;
            System.out.println("\n--- Movie Ticket Booking Counter ---");
            System.out.println("Available Seats: " + availableSeats + " / " + totalSeats);
            System.out.println("1. Book Tickets");
            System.out.println("2. View Booking Status");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = in.nextInt();
            //Using If else to control the cases
            if (choice == 1) { //Case 1: When we have to book tickets
                if (availableSeats == 0) {
                    System.out.println("Show is Housefull! No tickets available.");
                    continue;
                }
                System.out.print("Enter number of tickets you want to book: ");
                int ticketsNeeded = in.nextInt();
                if (ticketsNeeded <= 0) {
                    System.out.println("Invalid quantity!");
                } else if (ticketsNeeded > availableSeats) {
                    System.out.println("Sorry, only " + availableSeats + " seats are left.");
                } else {
                    bookedSeats += ticketsNeeded;
                    int totalCost = ticketsNeeded * ticketPrice;
                    System.out.println("Booking Confirmed! Successfully booked " + ticketsNeeded + " tickets.");
                    System.out.println("Total Amount Paid: " + totalCost);
                }
            } 
            else if (choice == 2) { //Case 2: Vuewing the booking seats
                System.out.println("\n--- Status Report ---");
                System.out.println("Seats Booked   : " + bookedSeats);
                System.out.println("Seats Remaining: " + availableSeats);
                System.out.println("Total Revenue  : " + (bookedSeats * ticketPrice));
            } 
            else if (choice == 3) { //Case 3: Exiting the program loop 
                System.out.println("Closing counter application.");
                break;
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }
        in.close();
    }
}