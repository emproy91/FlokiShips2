package models;

public abstract class Standard {
    public String name, fuel;
    public int height, weight, speed;

    public Standard(){ this.speed = 100 ;}
    public abstract void accelerate();
    public abstract void decelerate();


    public Standard(String name, String fuel, int height, int weight){
        this.name = name;
        this.fuel = fuel;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  " Name= '" + name + '\'' +
                ", Fuel= '" + fuel + '\'' +
                ",\n         Height= " + height +" m"+
                ", Weight= " + weight +" Ton"+
                ", Speed= " + speed +" Km/h"+
                ' ';
    }
}
