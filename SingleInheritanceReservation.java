import java.util.Scanner;
class Passenger {
    String name;
    int age;

    void getPassengerDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Reservation extends Passenger {
    String source, destination, coachType;

    void getReservationDetails(String source, String destination, String coachType) {
        this.source = source;
        this.destination = destination;
        this.coachType = coachType;
    }

    void displayTicket() {
        System.out.println("\n===== RAILWAY TICKET =====");
        System.out.println("Passenger Name : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Source         : " + source);
        System.out.println("Destination    : " + destination);
        System.out.println("Coach Type     : " + coachType);

        if (age >= 18)
            System.out.println("Booking Status : Confirmed");
        else
            System.out.println("Booking Status : Waiting List");
    }
}

public class SingleInheritanceReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Reservation r = new Reservation();

        System.out.println("RAILWAY RESERVATION MANAGEMENT SYSTEM");

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Coach Type (General/Sleeper/AC): ");
        String coachType = sc.nextLine();

        r.getPassengerDetails(name, age);
        r.getReservationDetails(source, destination, coachType);

        r.displayTicket();

        sc.close();
    }
}