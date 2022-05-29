package models;

public class Manned extends Standard {
    int crew;
    int stay;

    public Manned() { }

    public Manned(String name, String fuel, float height, float weight) {
        super(name, fuel, height, weight);
    }

    public Manned(String name, String fuel, float height, float weight, int crew, int stay) {
        super(name, fuel, height, weight);
        this.crew = crew;
        this.stay = stay;
    }


    public void align(){
        System.out.println(" ┠ ╔--╗ ┨ ");
        System.out.println(" ┠ ╚--╝ ┨ ");
    }
    // para tripulada alinear y acoplar.
    public void engage(){
        System.out.println("Docking the spaceship.");
        System.out.println("〓 ≡ ╝ ╚ ╔ ╗ ╬ ═ ╓ ╩ ┠ ┨ ┯ ┷ ┏ ┓ ┗ ┛ ┳ ⊥ ﹃﹄ ┌ ┐ └ ┘ ∟ ");
        System.out.println(" ┠-╗      ╔-┨ ");
        System.out.println(" ┠-╝      ╚-┨ ");
        System.out.println("The spaceship docked at International Space Station");
    }


}



// new classes mine: space research space in orbit,