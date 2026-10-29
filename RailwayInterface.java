import java.util.Scanner;

interface Reservation {
    void bookTicket();
}

class RailwayTicket implements Reservation {

    String passengerName;
    String trainName;
    int seats;

    RailwayTicket(String passengerName, String trainName, int seats) {
        this.passengerName = passengerName;
        this.trainName = trainName;
        this.seats = seats;
    }

    public void bookTicket() {
        System.out.println("\n--- RESERVATION DETAILS ---");
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Train Name     : " + trainName);
        System.out.println("Seats Booked   : " + seats);
        System.out.println("Status         : Reservation Confirmed");
    }
}

public class RailwayInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RAILWAY RESERVATION MANAGEMENT SYSTEM");

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Train Name: ");
        String train = sc.nextLine();

        System.out.print("Enter Number of Seats: ");
        int seats = sc.nextInt();

        RailwayTicket ticket = new RailwayTicket(name, train, seats);

        ticket.bookTicket();

        sc.close();
    }
}