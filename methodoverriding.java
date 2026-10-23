import java.util.Scanner;

class Vehicle {
    String companyName = "ABC Vehicle Rentals";
    String ownerName = "Mr. Kumar";
    String location = "Chennai";

    void displayCompany() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Owner Name   : " + ownerName);
        System.out.println("Location     : " + location);
    }

    void rentVehicle() {
        System.out.println("General Vehicle Rental");
    }
}

class Car extends Vehicle {
    void rentVehicle() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car Name : ");
        String carName = sc.nextLine();

        System.out.print("Enter Rent Per Day : ");
        int rentPerDay = sc.nextInt();

        System.out.print("Enter Number of Days : ");
        int days = sc.nextInt();

        int totalRent = rentPerDay * days;

        System.out.println("\n----- Vehicle Rental Details -----");
        displayCompany();

        System.out.println("Vehicle Type : Car");
        System.out.println("Car Name     : " + carName);
        System.out.println("Rent Per Day : ₹" + rentPerDay);
        System.out.println("Days         : " + days);
        System.out.println("Total Rent   : ₹" + totalRent);

        sc.close();
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.rentVehicle();
    }
}