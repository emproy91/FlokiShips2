package models;

public class Robotic extends Standard {

    int engines;
    float thrust;

    public Robotic() {
    }

    public Robotic(String name, String fuel, float height, float weight) {
        super(name, fuel, height, weight);
    }

    public Robotic(String name, String fuel, float height, float weight, int engines, float thrust) {
        super(name, fuel, height, weight);
        this.engines = engines;
        this.thrust = thrust;
    }

    public void deploy(){
        System.out.println("Deploy instruments");
        System.out.println("〓 ≡ ╝ ╚ ╔ ╗ ╬ ═ ╓ ╩ ┠ ┨ ┯ ┷ ┏ ┓ ┗ ┛ ┳ ⊥ ﹃﹄ ┌ ┐ └ ┘ ∟ ");
    }

    public void ping(){
        System.out.println("Rover@space-x  ~  ping 216.239.33.96");
        System.out.println("PING google.www.qpcomwifi.com (216.239.33.96) 56(84) bytes of data.");
        System.out.println("64 bytes from 216.239.33.96: icmp_seq=1 ttl=51 time=125 ms");
        System.out.println("64 bytes from 216.239.33.96: icmp_seq=2 ttl=51 time=161 ms");
        System.out.println("2 packets transmitted, 2 received, 0% packet loss, time 4003ms");
        System.out.println("rtt min/avg/max/mdev = 125.193/135.344 ms");
        System.out.println("Rover@space-x  ~  ");
    }

}

// para no tripulada desplegar y mandar ping ok.