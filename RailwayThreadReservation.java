import java.util.Scanner;

// Thread Class
class SeatAvailability extends Thread {

    String trainName;
    int seats;

    SeatAvailability(String trainName, int seats) {
        this.trainName = trainName;
        this.seats = seats;
    }

    public void run() {

        System.out.println("\nChecking seat availability...");
        
        if (seats > 0) {
            System.out.println("Train Name : " + trainName);
            System.out.println("Seats Available : " + seats);
            System.out.println("Status : Seats Available");
        } else {
            System.out.println("Train Name : " + trainName);
            System.out.println("Status : No Seats Available");
        }
    }
}

public class RailwayThreadReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RAILWAY RESERVATION MANAGEMENT SYSTEM");

        System.out.print("Enter Train Name: ");
        String trainName = sc.nextLine();

        System.out.print("Enter Number of Available Seats: ");
        int seats = sc.nextInt();

        SeatAvailability s = new SeatAvailability(trainName, seats);

        s.start();

        sc.close();
    }
}