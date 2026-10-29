import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class RailwayUserDefined {
    void bookTicket(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                "Passenger must be 18 or above!"
            );
        }

        System.out.println("Ticket booked successfully!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter passenger age: ");
            int age = sc.nextInt();

           RailwayUserDefined r = new RailwayUserDefined();
            r.bookTicket(age);

        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}