class Railway {
    boolean ticketAvailable = false;

    synchronized void bookTicket() {
        try {
            System.out.println("Thread 1: Ticket Counter locked");

            while (!ticketAvailable) {
                System.out.println("Thread 1: Waiting...");
                wait();
            }

            System.out.println("Thread 1: Ticket booked");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void releaseTicket() {
        System.out.println("Thread 2: Ticket Counter locked");
        ticketAvailable = true;

        System.out.println("Thread 2: Ticket released");
        notify();

        System.out.println("Thread 2: Thread 1 notified");
    }
}

public class RailwayDeadlockPrevention{
    public static void main(String[] args) {

        Railway r = new Railway();

        Thread t1 = new Thread(() -> r.bookTicket());
        Thread t2 = new Thread(() -> r.releaseTicket());

        t1.start();

        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }
}