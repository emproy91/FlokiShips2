package models;

public class OrbitResearch extends Standard implements IAligneble, IEngageable {
    String country;
    float orbitRadius;



    public OrbitResearch() { }

    public OrbitResearch(String name, String fuel, int height, int weight) {
        super(name, fuel, height, weight);
    }

    public OrbitResearch(String name, String fuel, int height, int weight, String country, float orbitRadius) {
        super(name, fuel, height, weight);
        this.country = country;
        this.orbitRadius = orbitRadius;
    }

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