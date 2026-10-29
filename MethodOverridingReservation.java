import java.util.Scanner;

class Reservation {

    String passengerName;

    void getDetails(String passengerName) {
        this.passengerName = passengerName;
    }

    void allocateSeat() {
        System.out.println("\nPassenger Name : " + passengerName);
        System.out.println("Seat Type      : General Seat");
        System.out.println("Seat Number    : G12");
    }
}

class SleeperReservation extends Reservation {

    void allocateSeat() {
        System.out.println("\nPassenger Name : " + passengerName);
        System.out.println("Seat Type      : Sleeper");
        System.out.println("Seat Number    : S25");
    }
}

public class MethodOverridingReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RAILWAY RESERVATION MANAGEMENT SYSTEM");
        System.out.println("1. General Coach");
        System.out.println("2. Sleeper Coach");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        Reservation r;

        if (choice == 1)
            r = new Reservation();
        else
            r = new SleeperReservation();

        r.getDetails(name);
        r.allocateSeat();

        
    }
}