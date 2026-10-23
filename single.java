
import java.util.Scanner;

class Vehicle {
    String companyName = "ABC Vehicle Rentals";

    void displayCompany() {
        System.out.println("Company Name : " + companyName);
    }
}

class Car extends Vehicle {
    String carName;
    int rentPerDay;

    void rentVehicle() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car Name: ");
        carName = sc.nextLine();

        System.out.print("Enter Rent Per Day: ");
        rentPerDay = sc.nextInt();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        int totalRent = rentPerDay * days;

        sc.nextLine();

        System.out.print("Do you have a Credit Card? (yes/no): ");
        String card = sc.nextLine();

        double discount = 0;

        if (card.equalsIgnoreCase("yes")) {
            discount = totalRent * 0.10;
        }

        double finalAmount = totalRent - discount;

        System.out.println("\n----- Vehicle Rental Details -----");

        displayCompany();

        System.out.println("Vehicle Type : Car");
        System.out.println("Car Name     : " + carName);
        System.out.println("Rent Per Day : Rs." + rentPerDay);
        System.out.println("Days         : " + days);
        System.out.println("Total Rent   : Rs." + totalRent);
        System.out.println("Discount     : Rs." + discount);
        System.out.println("Final Amount : Rs." + finalAmount);

        sc.close();
    }
}

public class single {
    public static void main(String[] args) {
        Car c = new Car();
        c.rentVehicle();
    }
}

