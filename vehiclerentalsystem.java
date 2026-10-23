import java.util.Scanner;

class Vehicle {
    Vehicle() {
        System.out.println("Welcome to Vehicle Rental System");
    }

    void rent(Scanner sc) {
        System.out.println("\nAvailable Vehicles:");
        System.out.println("Car");
        System.out.println("Bike");
        System.out.println("Truck");
        System.out.println("Scooty");
        System.out.println("Omni");

        System.out.print("\nEnter Vehicle Type: ");
        String vehicleType = sc.nextLine();

        System.out.println("You selected: " + vehicleType);
    }

    void rent(int days) {
        int rentPerDay = 500;

        System.out.println("\n----- Rental Details -----");
        System.out.println("Rental Days  : " + days);
        System.out.println("Rent Per Day : Rs." + rentPerDay);
        System.out.println("Total Rent   : Rs." + (rentPerDay * days));
    }
}

public class vehiclerentalsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle v = new Vehicle();

        v.rent(sc);

        System.out.print("Enter Rental Days: ");
        int days = sc.nextInt();

        v.rent(days);

        sc.close();
    }
}