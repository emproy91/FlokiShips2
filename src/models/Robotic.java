package models;

public class Robotic extends Standard {

    int engines;
    float thrust;

    public Robotic() { }


    public Robotic(String name, String fuel, int height, int weight) {
        super(name, fuel, height, weight);
    }

    public Robotic(String name,String fuel, int height, int weight, int engines, float thrust) {
        super(name, fuel, height, weight);
        this.engines = engines;
        this.thrust = thrust;
    }

    @Override
    public String toString() {
        return "Robotic{" +
                super.toString() +
                "\n         Engines= " + engines +
                ", Thrust= " + thrust + " Kg"+
                "\n       }";
    }

    public void deploy(){
        System.out.println("Deploy instruments");
        System.out.println("〓 ≡ ╝ ╚ ╔ ╗ ╬ ═ ╓ ╩ ┠ ┨ ┯ ┷ ┏ ┓ ┗ ┛ ┳ ⊥ ﹃﹄ ┌ ┐ └ ┘ ∟ ");
        System.out.println("The instruments have been deployed.");
        System.out.println("   ");
    }

    public void ping(){
        System.out.println("Rover@space-x  ~  ping 216.239.33.96");
        System.out.println("PING floki.www.FlokiShips.com (216.239.33.96) 56(84) bytes of data.");
        System.out.println("64 bytes from 216.239.33.96: icmp_seq=1 ttl=51 time=125 ms");
        System.out.println("64 bytes from 216.239.33.96: icmp_seq=2 ttl=51 time=161 ms");
        System.out.println("2 packets transmitted, 2 received, 0% packet loss, time 4003ms");
        System.out.println("rtt min/avg/max/mdev = 125.193/135.344/145.344/130.041 ms");
        System.out.println("Rover@space-x  ~  ");
        System.out.println("   ");
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 20;
    }

    @Override
    public void decelerate() {
        this.speed = this.speed - 20;
    }

}
