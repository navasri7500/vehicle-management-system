class Vehicle {
    private int vehicleId;
    private String vehicleName;
    private int rentPerDay;

    static String companyName = "ABC Vehicle Rentals";

    Vehicle(int id, String name, int rent) {
        vehicleId = id;
        vehicleName = name;
        rentPerDay = rent;
    }

    public void display() {
        System.out.println("Vehicle ID   : " + vehicleId);
        System.out.println("Vehicle Name : " + vehicleName);
        System.out.println("Rent/Day     : Rs." + rentPerDay);
    }

    public void calculateRent(int days) {
        System.out.println("Total Rent : Rs." + (days * rentPerDay));
    }

    public void calculateRent(int days, int discount) {
        int total = (days * rentPerDay) - discount;
        System.out.println("Total Rent after Discount : Rs." + total);
    }

    static void companyDetails() {
        System.out.println("Company Name : " + companyName);
    }
}

public class rental {
    public static void main(String[] args) {
        Vehicle.companyDetails();

        Vehicle v1 = new Vehicle(101, "Car", 1000);

        System.out.println("\nVehicle Details");
        v1.display();

        System.out.println("\nRent Calculation");
        v1.calculateRent(3);
        v1.calculateRent(3, 500);
    }
}