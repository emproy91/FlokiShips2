package models;

public class OrbitResearch extends Standard implements IAligneble, IEngageable {

    /**
     * This represents local attributes.
     */
    String country;
    float orbitRadius;


    /**
     * Create a new instances of the OrbitResearch class.
     */
    public OrbitResearch() { }

    public OrbitResearch(String name, String fuel, int height, int weight) {
        super(name, fuel, height, weight);
    }

    /**
     * Overloading and overriding methods.
     */
    public OrbitResearch(String name, String fuel, int height, int weight, String country, float orbitRadius) {
        super(name, fuel, height, weight);
        this.country = country;
        this.orbitRadius = orbitRadius;
    }

    /**
     * Create a new character string with the parameters of the class.
     * @return String array with data.
     */
    @Override
    public String toString() {
        return "OrbitResearch{" +
                super.toString() +
                "\n         Country= " + country +
                ", orbitRadius= " + orbitRadius + " Km"+
                "\n       }";
    }
    public void welcome() {
        System.out.println(" ┠ Welcome to space research center in earth orbit ┨ ");
        System.out.println(" ┠                     "+name+"                    ┨ ");
        System.out.println("   ");
    }

    @Override
    public void align() {
        System.out.println(" ┠ ┯ ┷ ┯ ┷ ┨ ");
        System.out.println(" ┠ ┷ ┯ ┷ ┯ ┨ ");
        System.out.println(" ship lined up");
        System.out.println("   ");
    }

    @Override
    public void engage() {
        System.out.println(" ┠ ┷  ┷  ┷  ┷ ┨ ");
        System.out.println(" ┠            ┨ ");
        System.out.println(" ┠ ┯  ┯  ┯  ┯ ┨ ");
        System.out.println("The spaceship docked");
        System.out.println("   ");
    }



    @Override
    public void accelerate() {
        this.speed = 27600; ;
    }

    @Override
    public void decelerate() {
        this.speed = this.speed - 1;
    }
}