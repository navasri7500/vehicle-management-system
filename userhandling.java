import java.util.Scanner;

class VehicleNotAvailableException extends Exception {
    VehicleNotAvailableException(String message) {
        super(message);
    }
}

class userhandling {
    static void rentVehicle(int available, int required)
            throws VehicleNotAvailableException {

        if (required > available) {
            throw new VehicleNotAvailableException(
                "Vehicle is not available for rental"
            );
        }

        System.out.println("Vehicle rented successfully");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vehicle Rental System");

        System.out.print("Enter available vehicles: ");
        int available = sc.nextInt();

        System.out.print("Enter required vehicles: ");
        int required = sc.nextInt();

        try {
            rentVehicle(available, required);
        } catch (VehicleNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Rental process completed");
        sc.close();
    }
}