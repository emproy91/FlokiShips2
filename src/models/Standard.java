package models;

public abstract class Standard {
    String name, fuel;
    float height, weight;

    public Standard(){}

    public Standard(String name, String fuel, float height, float weight){
        // super();
        this.name = name;
        this.fuel = fuel;
        this.height = height;
        this.weight = weight;
    }

}
