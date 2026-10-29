import java.util.Scanner;

class InvalidSpeedException extends Exception {

    InvalidSpeedException() {
        super("Invalid train speed!");
    }
}

public class TrainSpeedMonitor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RAILWAY TRAIN MOVEMENT SYSTEM");

        System.out.print("Enter Train Name: ");
        String trainName = sc.nextLine();

        System.out.print("Enter Train Speed: ");
        int speed = sc.nextInt();

        try {

            if (speed < 0 || speed > 120) {
                throw new InvalidSpeedException();
            }

            System.out.println();
            System.out.println("Train Name : " + trainName);

            if (speed == 0) {
                System.out.println("Status : Train Stopped");
            } else {
                System.out.println("Speed  : " + speed + " km/h");
                System.out.println("Status : Train Moving");
            }

        } catch (InvalidSpeedException e) {

            System.out.println();
            System.out.println("Exception : " + e.getMessage());
            System.out.println("Status : Train Movement Not Allowed");
        }

        sc.close();
    }
}
