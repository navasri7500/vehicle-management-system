import java.util.Scanner;

class Vehicle {
    String customerName;
    int days;
    int rentPerDay;
    int totalRent;

    void bookVehicle(String name, int d, int rent) {
        customerName = name;
        days = d;
        rentPerDay = rent;
        totalRent = days * rentPerDay;

        System.out.println("\n******** BOOKING DETAILS ********");
        System.out.println("Booking Number : BR2026");
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Rental Days    : " + days);
        System.out.println("Rent Per Day   : Rs." + rentPerDay);
        System.out.println("Amount to Pay  : Rs." + totalRent);
        System.out.println("Booking Status : Booking Confirmed");
    }

    void receiveVehicle() {
        System.out.println("\n******** VEHICLE RECEIVING ********");
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Vehicle Status : Received Successfully");
        System.out.println("Payment Status : Completed");
        System.out.println("Thank You! Visit Again.");
    }
}

class RentalService {
    void processBooking(Vehicle v) {
        v.bookVehicle(v.customerName, v.days, v.rentPerDay);
        v.receiveVehicle();
    }
}

public class interfacevehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle vehicle = new Vehicle();

        System.out.println("===== VEHICLE RENTAL SYSTEM =====");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Customer Name: ");
                vehicle.customerName = sc.nextLine();

                System.out.print("Enter Rental Days: ");
                vehicle.days = sc.nextInt();

                vehicle.rentPerDay = 1000;
                System.out.println("\nVehicle Name: Car");

                RentalService service1 = new RentalService();
                service1.processBooking(vehicle);
                break;

            case 2:
                System.out.print("Enter Customer Name: ");
                vehicle.customerName = sc.nextLine();

                System.out.print("Enter Rental Days: ");
                vehicle.days = sc.nextInt();

                vehicle.rentPerDay = 500;
                System.out.println("\nVehicle Name: Bike");

                RentalService service2 = new RentalService();
                service2.processBooking(vehicle);
                break;

            case 3:
                System.out.println("Thank You! Visit Again.");
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}