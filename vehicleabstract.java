import java.util.Scanner;

abstract class Vehicle {
    abstract void checkAvailability();
}

class Car extends Vehicle {
    void checkAvailability() {
        System.out.println("Car : 5 Available");
    }
}

class Bike extends Vehicle {
    void checkAvailability() {
        System.out.println("Bike : 8 Available");
    }
}

class Van extends Vehicle {
    void checkAvailability() {
        System.out.println("Van : 3 Available");
    }
}

class RentalService {
    void checkVehicle(Vehicle v) {
        v.checkAvailability();
    }
}

public class vehicleabstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RentalService service = new RentalService();

        System.out.println("===== VEHICLE RENTAL =====");
        System.out.print("\nEnter number of vehicles: ");
        int n = sc.nextInt();

        System.out.println("\n1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Van");

        for (int i = 1; i <= n; i++) {
            System.out.print("\nEnter vehicle type: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                Car car = new Car();
                service.checkVehicle(car);
            } else if (choice == 2) {
                Bike bike = new Bike();
                service.checkVehicle(bike);
            } else if (choice == 3) {
                Van van = new Van();
                service.checkVehicle(van);
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}