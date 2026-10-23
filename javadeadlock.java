class javadeadlock {
    static Object car = new Object();
    static Object bike = new Object();

    public static void main(String[] args) {
        Thread customer1 = new Thread(() -> {
            synchronized (car) {
                System.out.println("Customer 1: Car rental started");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                synchronized (bike) {
                    System.out.println("Customer 1: Bike rental requested");
                }
            }
        });

        Thread customer2 = new Thread(() -> {
            synchronized (bike) {
                System.out.println("Customer 2: Bike rental started");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                synchronized (car) {
                    System.out.println("Customer 2: Car rental requested");
                }
            }
        });

        System.out.println("Vehicle Rental Management");

        customer1.start();
        customer2.start();
    }
}