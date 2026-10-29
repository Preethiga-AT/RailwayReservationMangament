import java.util.Scanner;
interface PassengerDetails {
    void passengerInfo();
}
interface TicketDetails {
    void ticketInfo();
}
class Reservation implements PassengerDetails, TicketDetails {
    String name;
    String coach;

    Reservation(String name, String coach) {
        this.name = name;
        this.coach = coach;
    }

    public void passengerInfo() {
        System.out.println("Passenger Name : " + name);
    }

    public void ticketInfo() {
        System.out.println("Coach Type     : " + coach);
        System.out.println("Booking Status : Confirmed");
    }
}

public class InterfaceReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RAILWAY RESERVATION MANAGEMENT SYSTEM");

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Coach Type: ");
        String coach = sc.nextLine();

        PassengerDetails p = new Reservation(name, coach);
        TicketDetails t = new Reservation(name, coach);

        System.out.println("\n===== TICKET DETAILS =====");

        
        p.passengerInfo();
        t.ticketInfo();

    
    }
}