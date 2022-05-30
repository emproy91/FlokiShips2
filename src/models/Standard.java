package models;

/**
 * Represents a basic standard of Spaceship.
 * @author Mauricio Pérez.
 */
public abstract class Standard {

    /**
     * This is the parent class of spaceships available at the government benefit.
     */
    public String name, fuel;
    public int height, weight, speed;

    /**
     * Initial speed.
     */
    public Standard(){ this.speed = 100 ;}
    public abstract void accelerate();
    public abstract void decelerate();


    public Standard(String name, String fuel, int height, int weight){
        this.name = name;
        this.fuel = fuel;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Create a new character string with the parameters of the class.
     * @return String array with data.
     */
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
