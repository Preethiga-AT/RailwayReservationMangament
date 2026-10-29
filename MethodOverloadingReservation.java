```````````````````````````````````````````````````class Reservation {

    // Private data members
    private String passengerName;
    private int age;

    // Public static variable
    public static String railwayName = "Indian Railways";

    // Public method
    public void setPassenger(String passengerName, int age) {
        this.passengerName = passengerName;
        this.age = age;
    }

    // Method Overloading - 1
    public void bookTicket() {
        System.out.println("\n----- General Ticket -----");
        System.out.println("Railway : " + railwayName);
        System.out.println("Passenger : " + passengerName);
        System.out.println("Age : " + age);
        System.out.println("Coach : General");
    }

    // Method Overloading - 2
    public void bookTicket(String coachType) {
        System.out.println("\n----- Reserved Ticket -----");
        System.out.println("Railway : " + railwayName);
        System.out.println("Passenger : " + passengerName);
        System.out.println("Age : " + age);
        System.out.println("Coach : " + coachType);
    }

    // Method Overloading - 3
    public void bookTicket(String coachType, String destination) {
        System.out.println("\n----- Reserved Ticket -----");
        System.out.println("Railway : " + railwayName);
        System.out.println("Passenger : " + passengerName);
        System.out.println("Age : " + age);
        System.out.println("Coach : " + coachType);
        System.out.println("Destination : " + destination);
        System.out.println("Booking Status : Confirmed");
    }

    // Private method
    private void securityCheck() {
        System.out.println("Passenger details verified successfully.");
    }

    // Public method to access private method
    public void verifyPassenger() {
        securityCheck();
    }

    // Public static method
    public static void displayRailway() {
        System.out.println("Welcome to " + railwayName);
    }
}

public class MethodOverloadingReservation {


    public static void main(String[] args) {

        // Calling static method
        Reservation.displayRailway();

        // Creating object
        Reservation r = new Reservation();

        // Setting passenger details
        r.setPassenger("Preethiga", 18);

        // Calling private method through public method
        r.verifyPassenger();

        // Calling overloaded methods
        r.bookTicket();

        r.bookTicket("Sleeper");

        r.bookTicket("AC 3 Tier", "Chennai");
    }
}