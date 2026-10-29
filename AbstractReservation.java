import java.util.Scanner;
abstract class Train {

    String trainName;
    String source;
    String destination;

    void getDetails(String trainName, String source, String destination) {
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
    }

    abstract void displaySchedule();
}
class ExpressTrain extends Train {
    void displaySchedule() {
        System.out.println("\n===== EXPRESS TRAIN =====");
        System.out.println("Train Name  : " + trainName);
        System.out.println("Source      : " + source);
        System.out.println("Destination : " + destination);
        System.out.println("Departure   : 08:30 AM");
        System.out.println("Arrival     : 04:45 PM");
    }
}
class SuperfastTrain extends Train {
    void displaySchedule() {
        System.out.println("\n===== SUPERFAST TRAIN =====");
        System.out.println("Train Name  : " + trainName);
        System.out.println("Source      : " + source);
        System.out.println("Destination : " + destination);
        System.out.println("Departure   : 06:00 AM");
        System.out.println("Arrival     : 01:30 PM");
    }
}

public class AbstractReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RAILWAY RESERVATION MANAGEMENT SYSTEM");

        System.out.print("Enter Train Name: ");
        String trainName = sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        ExpressTrain express = new ExpressTrain();
        express.getDetails(trainName, source, destination);

        SuperfastTrain superfast = new SuperfastTrain();
        superfast.getDetails(trainName, source, destination);

        Train t;

        t = express;
        t.displaySchedule();

        t = superfast;
        t.displaySchedule();

        
    }
}