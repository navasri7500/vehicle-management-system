
class VehicleRental {
    boolean vehicleReady = false;

    synchronized void updateVehicle() {
        System.out.println("Vehicle Rental Management: Vehicle is ready for rental");
        vehicleReady = true;
        notifyAll();
    }

    synchronized void checkVehicle() {
        while (!vehicleReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Rental Management: Vehicle is available");
    }
}

class VehicleUpdate extends Thread {
    VehicleRental rental;

    VehicleUpdate(VehicleRental rental) {
        this.rental = rental;
    }

    public void run() {
        rental.updateVehicle();
    }
}

class VehicleMonitor extends Thread {
    VehicleRental rental;

    VehicleMonitor(VehicleRental rental) {
        this.rental = rental;
    }

    public void run() {
        rental.checkVehicle();
    }
}

public class vehicleinter {
    public static void main(String[] args) {
        System.out.println("Vehicle Rental Management System");

        VehicleRental rental = new VehicleRental();

        VehicleUpdate t1 = new VehicleUpdate(rental);
        VehicleMonitor t2 = new VehicleMonitor(rental);

        t2.start();
        t1.start();
    }
}

