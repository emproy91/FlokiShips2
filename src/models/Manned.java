package models;

public class Manned extends Standard implements IAligneble, IEngageable {
    int crew, stay;

    public Manned() { }



    public Manned(String name, String fuel, int height, int weight) {
        super(name, fuel, height, weight);
    }

    public Manned(String name, String fuel, int height, int weight, int crew, int stay) {
        super(name, fuel, height, weight);
        this.crew = crew;
        this.stay = stay;
    }

    @Override
    public String toString() {
        return "Manned{" +
                super.toString() +
                "\n         Crew= " + crew +" P"+
                ", Stay= " + stay +" D"+
                "\n       }";
    }

    @Override
    public void align(){
        System.out.println(" ┠ ╔--╗ ┨ ");
        System.out.println(" ┠ ╚--╝ ┨ ");
        System.out.println(" ship lined up");
        System.out.println("   ");
    }
    @Override
    public void engage(){
        System.out.println("Docking the spaceship.");
        System.out.println(" ┠-╗      ╔-┨ ");
        System.out.println(" ┠-╝      ╚-┨ ");
        System.out.println("The spaceship docked at International Space Station");
        System.out.println("   ");
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10;
    }

    @Override
    public void decelerate() {
        this.speed = this.speed - 10;
    }
}



// new classes mine: space research space in orbit,