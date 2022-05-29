package models;

public class OrbitResearch extends Standard {
    String country;
    float orbitRadius;

    public OrbitResearch() { }

    public OrbitResearch(String name, String fuel, float height, float weight) {
        super(name, fuel, height, weight);
    }

    public OrbitResearch(String name, String fuel, float height, float weight, String country, float orbitRadius) {
        super(name, fuel, height, weight);
        this.country = country;
        this.orbitRadius = orbitRadius;
    }

    public void welcome() {
        System.out.println(" ┠ Welcome to space research center in earth orbit ┨ ");
        System.out.println(" ┠                     "+name+"                    ┨ ");
    }

}