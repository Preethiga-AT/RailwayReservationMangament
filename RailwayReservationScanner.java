// Experiment No: 3
// Railway Reservation Management System using Scanner Class

import java.util.Scanner;

public class RailwayReservationScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RAILWAY RESERVATION MANAGEMENT SYSTEM");

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Coach Type (General/Sleeper/AC): ");
        String coach = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.println("\n------ TICKET DETAILS ------");
        System.out.println("Passenger Name : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Coach Type     : " + coach);
        System.out.println("Destination    : " + destination);
        System.out.println("Booking Status : Confirmed");

        sc.close();
    }
}