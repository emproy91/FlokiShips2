import models.*;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Instance is created for the scanner class
    protected static Scanner scanner = new Scanner(System.in);

    // List of Standard Ship
    protected static ArrayList<Standard> listShip = new ArrayList<Standard>();

    // Boolean start Standard Ship
    static Boolean standardShip = false;

    static String nObj = "-";
    static String nObj2 = "-";
    public static void main(String[] args) {

        Standard energía = new Shuttle("Energía", "Querosseno+O(liq)", 60, 2400, 100, 4);
        Robotic curiosity = new Robotic("Curiosity", "PuO2", 3, 899, 6, (float) 336.73);
        Manned dragon2 = new Manned("dragon2", "NH4CIO4+AL", 8, 1, 8, 3);
        OrbitResearch iSS = new OrbitResearch("ISS", "__", 8, 420, "International", (float) 386.4);

        listShip.add(energía);
        listShip.add(curiosity);
        listShip.add(dragon2);
        listShip.add(iSS);

        System.out.println("┠﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃┨");
        System.out.println("┠ Welcome to Floki ships ┨");
        System.out.println("┠﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃┨");
        System.out.println("   ");

        int option = -1;

        while (option != 0) {
            System.out.println("To see available models, press 1 and enter.");
            System.out.println("To create your own model, press 2 and enter.");
            System.out.println("To exit, press 0 and enter.");
            System.out.println("   ");


            option = Integer.parseInt(scanner.next());
            if (option == 1) {
                System.out.println("We have the following models available: ");
                System.out.println("   ");
                System.out.println("        " + listShip + "\n ");
                System.out.println("   ");
                System.out.println("You can also create your own");
                System.out.println("Write the number of the option of your choice");
                System.out.println("1- Shuttle");
                System.out.println("2- Robotic");
                System.out.println("3- Manned");
                System.out.println("4- OrbitResearch");
                System.out.println("0- to return to the back menu");

                // return option;
            } else if (option == 2) {
                System.out.println("To create your own model.");
                create();
            } else if (option == 0) {
                System.out.println("See you ...");
            } else {
                System.out.println("Option not valid");
            }

        }


    }

    public static void create() {
        int mkr = 0;

        mkr = Integer.parseInt(scanner.next());

        String name, fuel;
        int height, weight, speed;
        int load, boosters;
        int engines;
        float thrust;

        switch (mkr) {
            case 1:
                // ship name
                System.out.println("Please type spacecraft name and enter");
                name = scanner.next();
                nObj = name.toLowerCase();
                System.out.println(nObj);
                // name fuel
                System.out.println("Please type spacecraft name Fuel");
                fuel = scanner.next();

                // ship height
                while (true) {
                    try {
                        System.out.println("Please type spacecraft height in meters");
                        height = Integer.parseInt(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                // ship weight
                while (true) {
                    try {
                        System.out.println("Please type spacecraft weight in tons");
                        weight = Integer.parseInt(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                // ship load
                while (true) {
                    try {
                        System.out.println("Please type spacecraft load in tons");
                        load = Integer.parseInt(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                // ship boosters
                while (true) {
                    try {
                        System.out.println("Please type the amount of boosters");
                        boosters = Integer.parseInt(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                Standard nObj = new Shuttle(name, fuel, height, weight, load, boosters);
                listShip.add(nObj);
                break;
            case 2:
                // ship name
                System.out.println("Please type spacecraft name and enter");
                name = scanner.next();
                nObj2 = name.toLowerCase();
                // name fuel
                System.out.println("Please type spacecraft name Fuel");
                fuel = scanner.next();

                // ship height
                while (true) {
                    try {
                        System.out.println("Please type spacecraft height in meters");
                        height = Integer.parseInt(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                // ship weight
                while (true) {
                    try {
                        System.out.println("Please type spacecraft weight in tons");
                        weight = Integer.parseInt(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                // ship engines
                while (true) {
                    try {
                        System.out.println("Please type spacecraft load in tons");
                        engines = Integer.parseInt(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                // ship thrust
                while (true) {
                    try {
                        System.out.println("Please type the spacecraft thrust in tons");
                        thrust =  Float.parseFloat(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                Robotic nObj2 = new Robotic(name, fuel, height, weight, engines, thrust);
                listShip.add(nObj2);
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;

        }

    }

}
/*
        System.out.println(energía.toString());
        System.out.println(curiosity.toString());
        System.out.println(dragon2.toString());
        System.out.println(iSS.toString());

        System.out.println("   ");
*/

/*
        System.out.println(((Shuttle) energía).getLoad());
        System.out.println(((Shuttle) energía).fuel);
        ((Shuttle) energía).cBoosters();
        ((Shuttle) energía).takeoff();
        ((Shuttle) energía).accelerate();
        ((Shuttle) energía).accelerate();
        System.out.println(((Shuttle) energía).speed);
        ((Shuttle) energía).accelerate();
        ((Shuttle) energía).accelerate();
        System.out.println(((Shuttle) energía).speed);
        ((Shuttle) energía).decelerate();
        System.out.println(((Shuttle) energía).speed);
*/