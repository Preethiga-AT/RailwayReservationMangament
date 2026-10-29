// Experiment No: 1
// Title: Railway Reservation Management System using Class, Objects and Constructors

class Passenger {

    // Data Members
    String passengerName;
    int passengerAge;
    String gender;
    String trainName;
    int trainNumber;
    String coachType;
    String source;
    String destination;

    // Default Constructor
    Passenger() {
        passengerName = "Not Booked";
        passengerAge = 0;
        gender = "Not Specified";
        trainName = "No Train";
        trainNumber = 0;
        coachType = "General";
        source = "Unknown";
        destination = "Unknown";
    }

    // Parameterized Constructor
    Passenger(String passengerName, int passengerAge, String gender,
              String trainName, int trainNumber, String coachType,
              String source, String destination) {

        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.gender = gender;
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.coachType = coachType;
        this.source = source;
        this.destination = destination;
    }

    // Copy Constructor
    Passenger(Passenger p) {
        this.passengerName = p.passengerName;
        this.passengerAge = p.passengerAge;
        this.gender = p.gender;
        this.trainName = p.trainName;
        this.trainNumber = p.trainNumber;
        this.coachType = p.coachType;
        this.source = p.source;
        this.destination = p.destination;
    }

    // Method
    void displayTicket() {

        System.out.println("------------------------------------------");
        System.out.println("      RAILWAY RESERVATION TICKET");
        System.out.println("------------------------------------------");
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Passenger Age  : " + passengerAge);
        System.out.println("Gender         : " + gender);
        System.out.println("Train Name     : " + trainName);
        System.out.println("Train Number   : " + trainNumber);
        System.out.println("Coach Type     : " + coachType);
        System.out.println("Source         : " + source);
        System.out.println("Destination    : " + destination);
        System.out.println("Booking Status : Confirmed");
        System.out.println("------------------------------------------");
    }
}

public class RailwayReservation{

    public static void main(String[] args) {

        // Object using Default Constructor
        System.out.println("USING DEFAULT CONSTRUCTOR");
        Passenger p1 = new Passenger();
        p1.displayTicket();

        // Object using Parameterized Constructor
        System.out.println("\nUSING PARAMETERIZED CONSTRUCTOR");
        Passenger p2 = new Passenger(
                "Preethiga",
                18,
                "Female",
                "Kovai Express",
                12676,
                "Sleeper",
                "Coimbatore",
                "Chennai");
        p2.displayTicket();

        // Object using Copy Constructor
        System.out.println("\nUSING COPY CONSTRUCTOR");
        Passenger p3 = new Passenger(p2);
        p3.displayTicket();
    }
}