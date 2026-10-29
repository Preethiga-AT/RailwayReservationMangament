import java.util.Scanner;

class RailwayReservation {

    int availableSeats;

    RailwayReservation(int seats) {
        availableSeats = seats;
    }

    synchronized void bookTicket(String passenger, int seats) {

        System.out.println("\n" + passenger + " is trying to book "
                + seats + " seat(s).");

        while (availableSeats < seats) {

            System.out.println("Seats are not available.");
            System.out.println(passenger + " is waiting...");

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        availableSeats = availableSeats - seats;

        System.out.println("Booking successful for " + passenger);
        System.out.println("Remaining Seats: " + availableSeats);
    }

    synchronized void cancelTicket(String passenger, int seats) {

        System.out.println("\n" + passenger + " is cancelling "
                + seats + " seat(s).");

        availableSeats = availableSeats + seats;

        System.out.println("Cancellation successful.");
        System.out.println("Available Seats: " + availableSeats);

        notify();
    }
}

class BookingThread extends Thread {

    RailwayReservation reservation;
    String passenger;
    int seats;

    BookingThread(RailwayReservation reservation,
                  String passenger, int seats) {

        this.reservation = reservation;
        this.passenger = passenger;
        this.seats = seats;
    }

    public void run() {
        reservation.bookTicket(passenger, seats);
    }
}

class CancellationThread extends Thread {

    RailwayReservation reservation;
    String passenger;
    int seats;

    CancellationThread(RailwayReservation reservation,
                       String passenger, int seats) {

        this.reservation = reservation;
        this.passenger = passenger;
        this.seats = seats;
    }

    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        reservation.cancelTicket(passenger, seats);
    }
}

public class RailwayInterThread {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RAILWAY RESERVATION MANAGEMENT SYSTEM");

        System.out.print("Enter Available Seats: ");
        int availableSeats = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Booking Passenger Name: ");
        String bookingName = sc.nextLine();

        System.out.print("Enter Seats Required: ");
        int bookingSeats = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Cancellation Passenger Name: ");
        String cancelName = sc.nextLine();

        System.out.print("Enter Seats to Cancel: ");
        int cancelSeats = sc.nextInt();

        RailwayReservation reservation =
                new RailwayReservation(availableSeats);

        BookingThread booking =
                new BookingThread(reservation,
                                  bookingName, bookingSeats);

        CancellationThread cancellation =
                new CancellationThread(reservation,
                                       cancelName, cancelSeats);

        booking.start();
        cancellation.start();

        sc.close();
    }
}