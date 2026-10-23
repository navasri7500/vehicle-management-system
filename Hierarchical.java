
import java.util.Scanner;

class Vehicle {
    String companyName = "ABC Vehicle Rentals";
    String customerName;
    Scanner sc;

    Vehicle(Scanner sc) {
        this.sc = sc;
    }

    void getCustomer() {
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.println("Company Name : " + companyName);
        System.out.println("Customer Name: " + customerName);
    }
}

class Car extends Vehicle {
    Car(Scanner sc) {
        super(sc);
    }

    void rentCar() {
        getCustomer();

        System.out.print("Enter Car Name: ");
        String carName = sc.nextLine();

        System.out.print("Enter Rent Per Day: ");
        int rent = sc.nextInt();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();
        sc.nextLine();

        int total = rent * days;

        System.out.print("Do you have a Credit Card? (yes/no): ");
        String card = sc.nextLine();

        System.out.print("Is Monthly Offer Available? (yes/no): ");
        String offer = sc.nextLine();

        double discount = 0;

        if (card.equalsIgnoreCase("yes")) {
            discount += total * 0.10;
        }

        if (offer.equalsIgnoreCase("yes")) {
            discount += total * 0.05;
        }

        double finalAmount = total - discount;

        System.out.println("\n----- Car Rental Details -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Name      : " + carName);
        System.out.println("Rent Per Day  : Rs." + rent);
        System.out.println("Days          : " + days);
        System.out.println("Total Rent    : Rs." + total);
        System.out.println("Discount      : Rs." + discount);
        System.out.println("Final Amount  : Rs." + finalAmount);
    }
}

class Bike extends Vehicle {
    Bike(Scanner sc) {
        super(sc);
    }

    void rentBike() {
        getCustomer();

        System.out.print("Enter Bike Name: ");
        String bikeName = sc.nextLine();

        System.out.print("Enter Rent Per Day: ");
        int rent = sc.nextInt();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();
        sc.nextLine();

        int total = rent * days;

        System.out.print("Do you have a Credit Card? (yes/no): ");
        String card = sc.nextLine();

        System.out.print("Is Monthly Offer Available? (yes/no): ");
        String offer = sc.nextLine();

        double discount = 0;

        if (card.equalsIgnoreCase("yes")) {
            discount += total * 0.10;
        }

        if (offer.equalsIgnoreCase("yes")) {
            discount += total * 0.05;
        }

        double finalAmount = total - discount;

        System.out.println("\n----- Bike Rental Details -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Bike Name     : " + bikeName);
        System.out.println("Rent Per Day  : Rs." + rent);
        System.out.println("Days          : " + days);
        System.out.println("Total Rent    : Rs." + total);
        System.out.println("Discount      : Rs." + discount);
        System.out.println("Final Amount  : Rs." + finalAmount);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== ABC Vehicle Rental System =====");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.print("Choose Vehicle (1 or 2): ");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            Car c = new Car(sc);
            c.rentCar();
        } else if (choice == 2) {
            Bike b = new Bike(sc);
            b.rentBike();
        } else {
            System.out.println("Invalid Choice");
        }
    }
}

