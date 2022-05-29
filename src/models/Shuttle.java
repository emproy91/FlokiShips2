package models;

public class Shuttle extends Standard {

    int load, boosters;

    public Shuttle (){};

    public Shuttle(String name, String fuel, float height, float weight) {
        super(name, fuel, height, weight);
    }

    public Shuttle(String name, String fuel, float height, float weight, int load, int boosters) {
        super(name, fuel, height, weight);
        this.load = load;
        this.boosters = boosters;
    }

    public void boosters() {
        System.out.println("Coupled rocket boosters.");
        System.out.println("|>>===");
        System.out.println("|>>>=====D");
        System.out.println("|>>===");
    }

    public void takeoff() {
        System.out.println("Start ignition and countdown to takeoff...");
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(10 - i);
        }
        System.out.println("|------***333>>>===");
        System.out.println("|----*3333333>>>=====D");
        System.out.println("|------***333>>>===");

    }

}

// para tripulada alinear y acoplar.