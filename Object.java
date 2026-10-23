class Vehicle {
    String name;
    int rentPerDay;

    Vehicle() {
        name = "Bike";
        rentPerDay = 500;
    }

    Vehicle(String n, int r) {
        name = n;
        rentPerDay = r;
    }

    Vehicle(Vehicle v) {
        name = v.name;
        rentPerDay = v.rentPerDay;
    }

    void displayRent(int days) {
        int total = rentPerDay * days;

        System.out.println("Vehicle Name : " + name);
        System.out.println("Rent Per Day : ₹" + rentPerDay);
        System.out.println("Days         : " + days);
        System.out.println("Total Rent   : ₹" + total);
        System.out.println();
    }
}

public class Object {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();

        System.out.println("Default Constructor");
        v1.displayRent(3);

        Vehicle v2 = new Vehicle("Car", 1000);

        System.out.println("Parameterized Constructor");
        v2.displayRent(5);

        Vehicle v3 = new Vehicle(v2);

        System.out.println("Copy Constructor");
        v3.displayRent(2);
    }
}