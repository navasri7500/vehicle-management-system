class Vehicle {
    String name;
    double rent;

    Vehicle(String name, double rent) {
        this.name = name;
        this.rent = rent;
    }
}

class RentalThread extends Thread {
    Vehicle v;
    int days;

    RentalThread(Vehicle v, int days) {
        this.v = v;
        this.days = days;
    }

    public void run() {
        double total = 0;

        for (int i = 1; i <= days; i++) {
            total = total + v.rent;
        }

        System.out.println("Total Rent : Rs." + total);
    }
}

public class vehiclethread {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Car", 1000);
        RentalThread t = new RentalThread(v, 3);

        System.out.println("Rental Process Started");
        System.out.println("Vehicle : " + v.name);
        System.out.println("Rent Per Day : Rs." + v.rent);
        System.out.println("Days : " + t.days);

        t.start();
    }
}