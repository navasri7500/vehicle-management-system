import VehicleRental.Vehicle.VehicleRental;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VehicleRental v = new VehicleRental();

        v.input();
        v.getinput();

        System.out.println("Enter Rent Per Day:");
        float rent = sc.nextFloat();

        System.out.println("Enter Number of Days:");
        float days = sc.nextFloat();

        System.out.println("Enter Discount:");
        float discount = sc.nextFloat();

        v.calculateRent(rent, days, discount);

        v.display();
    }
}