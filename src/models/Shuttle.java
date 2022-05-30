package models;

/**
 * Child class inherited from Standard.
 */
public class Shuttle extends Standard {

    /**
     * This represents local attributes.
     */
    int load, boosters;

    /**
     * Create a new instances of the Shuttle class.
     */
    public Shuttle (){};
    public Shuttle(String name, String fuel, int height, int weight) {
        super(name, fuel, height, weight);
    }

    /**
     * Overloading and overriding methods.
     */
    public Shuttle(String name, String fuel, int height, int weight, int load, int boosters) {
        super(name, fuel, height, weight);
        this.load = load;
        this.boosters = boosters;

    }

    /**
     * Create a new character string with the parameters of the class.
     * @return String array with data.
     */
    @Override
    public String toString() {
        return "Shuttle{" +
                super.toString() +
                "\n         Load= " + load +" Ton"+
                ", Boosters= " + boosters +
                "\n       }";
    }


    public void cBoosters() {
        System.out.println(boosters+" Coupled rocket boosters.");
        System.out.println("|>>===⊃");
        System.out.println("|>>>======D");
        System.out.println("|>>===⊃");
        System.out.println("   ");
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
        System.out.println("|----------***333>>>===⊃");
        System.out.println("|--------*3333333>>>======D");
        System.out.println("|----------***333>>>===⊃");
        System.out.println("   ");

    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getBoosters() {
        return boosters;
    }

    public void setBoosters(int boosters) {
        this.boosters = boosters;
    }


    @Override
    public void accelerate() {
        this.speed = this.speed + 100;
    }

    @Override
    public void decelerate() {
        this.speed = this.speed - 100;
    }
}

