import java.util.Scanner;
class Passenger {
    String name;
    int ticketNo;

    void getPassenger(String name, int ticketNo) {
        this.name = name;
        this.ticketNo = ticketNo;
    }
}
class Cancellation extends Passenger {
    String reason;
    void getCancellationReason(String reason) {
        this.reason = reason;
    }
}
class Refund extends Cancellation {
    void displayDetails() {
        System.out.println("\n===== TICKET CANCELLATION =====");
        System.out.println("Passenger Name : " + name);
        System.out.println("Ticket Number  : " + ticketNo);
        System.out.println("Reason         : " + reason);
        if (reason.equalsIgnoreCase("Medical")) {
            System.out.println("Refund Status  : Full Refund");
        } else {
            System.out.println("Refund Status  : 50% Refund");
        }
    }
}
public class MultilevelInheritanceReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Refund r = new Refund();
        System.out.println("RAILWAY TICKET CANCELLATION SYSTEM");
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Ticket Number: ");
        int ticketNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Cancellation Reason (Medical/Personal): ");
        String reason = sc.nextLine();
        r.getPassenger(name, ticketNo);
        r.getCancellationReason(reason);
        r.displayDetails();
        sc.close();
    }
}