/**
 * Represents spaceships builder.
 * @author Mauricio Pérez.
 */

/**
 * Here the necessary classes created are imported.
 */
import models.Standard;
import models.Shuttle;
import models.Robotic;
import models.Manned;
import models.OrbitResearch;

/**
 * The necessary JDK classes are imported here.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * Instance is created for scanner class.
     */
    protected static Scanner scanner = new Scanner(System.in);

    /**
     * Create an object to send Ship list.
     */
    protected static ArrayList<Standard> listShip = new ArrayList<Standard>();

    /**
     * Represents the main class that interacts with the others.
     * @param args to constructors.
     */
    public static void main(String[] args) {

        /**
         * Create an instance of the ships classes.
         */
        Standard energy = new Shuttle("Energy", "Querosseno+O(liq)", 60, 2400, 100, 4);
        Robotic curiosity = new Robotic("Curiosity", "PuO2", 3, 899, 6, (float) 336.73);
        Manned dragon2 = new Manned("dragon2", "NH4CIO4+AL", 8, 1, 8, 3); //
        OrbitResearch iSS = new OrbitResearch("ISS", "__", 73, 420, "International", (float) 386.4);

        /**
         * Add an object to Ship list.
         */
        listShip.add(energy);
        listShip.add(curiosity);
        listShip.add(dragon2);
        listShip.add(iSS);

        /**
         * Welcome to data request.
         */
        System.out.println("┠﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃┨");
        System.out.println("┠ Welcome to Floki ships ┨");
        System.out.println("┠﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃┨");
        System.out.println("   ");

        /**
         * Wildcard variables to menus
         */
        int option = -1;
        String news = "";
        while (option != 0) {
            mMenu(news);
            /**
             * The user's answer typed on the keypad is captured.
             * A try-catch is used to match in numerical type.
             */
            try {

                option = Integer.parseInt(scanner.next());
                if (option == 1) {
                    System.out.println("We have the following models available: ");
                    System.out.println("   ");
                    System.out.println("        " + listShip + "\n ");
                    System.out.println("You can also create your own");
                    System.out.println("Write the number of the option of your choice");
                    System.out.println("   ");

                    // return option;
                } else if (option == 2) {
                    mkrMenu();
                    create();
                    news = "and your creations";

                } else if (option == 0) {
                    System.out.println("See you ...");
                    break;
                } else {
                    System.out.println("Option not valid, please, type valid option.");
                }
            } catch (NumberFormatException numEx) {
                System.out.println("Please, type valid option.");

            }

        }

    }

    /**
     * Main menu to user.
     * @param news vriable to see new ships option.
     */
    private static void mMenu(String news) {
        System.out.println("                   MAIN MENU ");
        System.out.println("(1) To see available models " + news + ", press 1 and enter.");
        System.out.println("(2) To create your own model, press 2 and enter.");
        System.out.println("(0) To exit, press 0 and enter.");
        System.out.println("   ");
    }

    /**
     * Maker menu to user
     */
    private static void mkrMenu() {
        System.out.println("To create your own model,");
        System.out.println("type the number of the option of your choice.");
        System.out.println("   ");
        System.out.println("1- Shuttle");
        System.out.println("2- Robotic");
        System.out.println("3- Manned");
        System.out.println("4- OrbitResearch");
        System.out.println("5- Return to the back menu");
        System.out.println("   ");

    }

    /**
     * Ships creator method.
     */
    public static void create() {

        /**
         * Catch typed user ship choise.
         */
        int mkr = 0;
        mkr = Integer.parseInt(scanner.next());

        // Standard params.
        String name, fuel;
        int height, weight, speed;

        // Shuttle params.
        int load, boosters;
        // Robotic params.
        int engines;
        float thrust;
        // Manned params.
        int crew, stay;
        // Orbit Research params.
        String country;
        float orbitRadius;


        while (true) {
            mkrMenu();
            /**
             * The user's answer typed on the keypad is captured.
             * A try-catch is used to match in numerical type.
             */
            try {
                mkr = Integer.parseInt(scanner.next());
                if (mkr == 1 || mkr == 2 || mkr == 3 || mkr == 4 || mkr == 5) {
                    break;
                }else {
                    System.out.println("Option not valid, please type a valid option.");
                }
            } catch (NumberFormatException numEx) {
                System.out.println("Please type a valid option.");
            }
        }


        switch (mkr) {
            case 1:

                // Shuttle ship name.
                System.out.println("Please type spacecraft name and enter");
                name = scanner.next();
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
                Standard nObj4 = new Shuttle(name, fuel, height, weight, load, boosters);

                /**
                 * New object added to ship list.
                 */
                listShip.add(nObj4);

                /**
                 * Special behaviors.
                 */
                System.out.println("   ");
                ((Shuttle) nObj4).cBoosters();
                ((Shuttle) nObj4).takeoff();
                ((Shuttle) nObj4).accelerate();
                ((Shuttle) nObj4).accelerate();
                ((Shuttle) nObj4).accelerate();
                ((Shuttle) nObj4).accelerate();
                ((Shuttle) nObj4).accelerate();
                System.out.println("take off speed:" + ((Shuttle) nObj4).speed + "Km/h");
                ((Shuttle) nObj4).decelerate();
                System.out.println("Decelerate by turbulence " + "speed: " + ((Shuttle) nObj4).speed + "Km/h");
                System.out.println("   ");
                break;
            case 2:
                // Robotic ship name.
                System.out.println("Please type spacecraft name and enter");
                name = scanner.next();
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
                        System.out.println("Please type spacecraft amount of engines");
                        engines = Integer.parseInt(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                // ship thrust
                while (true) {
                    try {
                        System.out.println("Please type the spacecraft thrust in Kg");
                        thrust = Float.parseFloat(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                Robotic nObj5 = new Robotic(name, fuel, height, weight, engines, thrust);

                /**
                 * New object added to ship list.
                 */
                listShip.add(nObj5);
                /**
                 * Special behaviors.
                 */
                System.out.println("   ");
                ((Robotic) nObj5).deploy();
                ((Robotic) nObj5).ping();
                ((Robotic) nObj5).accelerate();
                ((Robotic) nObj5).accelerate();
                ((Robotic) nObj5).accelerate();
                ((Robotic) nObj5).accelerate();
                System.out.println("take off speed:" + ((Robotic) nObj5).speed + "Km/h");
                ((Robotic) nObj5).decelerate();
                System.out.println("Decelerate by turbulence " + "speed: " + ((Robotic) nObj5).speed + "Km/h");
                System.out.println("   ");
                break;
            case 3:
                // Manned ship name.
                System.out.println("Please type spacecraft name and enter");
                name = scanner.next();
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
                // ship crew
                while (true) {
                    try {
                        System.out.println("Please type spacecraft amount of people");
                        crew = Integer.parseInt(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                // ship stay
                while (true) {
                    try {
                        System.out.println("Please type the number of Earth days they will be in the spacecraft.");
                        stay = Integer.parseInt(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                Manned nObj6 = new Manned(name, fuel, height, weight, crew, stay);

                /**
                 * New object added to ship list.
                 */
                listShip.add(nObj6);

                /**
                 * Special behaviors.
                 */
                System.out.println("   ");
                ((Manned) nObj6).align();
                ((Manned) nObj6).engage();
                ((Manned) nObj6).accelerate();
                ((Manned) nObj6).accelerate();
                ((Manned) nObj6).accelerate();
                ((Manned) nObj6).accelerate();
                System.out.println("take off speed:" + ((Manned) nObj6).speed + "Km/h");
                ((Manned) nObj6).decelerate();
                System.out.println("Decelerate by turbulence " + "speed: " + ((Manned) nObj6).speed + "Km/h");
                System.out.println("   ");
                break;
            case 4:
                // OrbitResearch ship name.
                System.out.println("Please type spacecraft name and enter");
                name = scanner.next();
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
                // name country
                System.out.println("Please type spacecraft name country");
                country = scanner.next();
                // ship orbitRadius
                while (true) {
                    try {
                        System.out.println("Please type the spacecraft orbitRadius in Km");
                        orbitRadius = Float.parseFloat(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }
                OrbitResearch nObj7 = new OrbitResearch(name, fuel, height, weight, country, orbitRadius);

                /**
                 * New object added to ship list.
                 */
                listShip.add(nObj7);

                /**
                 * Special behaviors.
                 */
                System.out.println("   ");
                ((OrbitResearch) nObj7).align();
                ((OrbitResearch) nObj7).engage();
                ((OrbitResearch) nObj7).welcome();
                ((OrbitResearch) nObj7).accelerate();
                System.out.println("Average speed:" + ((OrbitResearch) nObj7).speed + "Km/h");
                ((OrbitResearch) nObj7).decelerate();
                System.out.println("Decelerate " + "speed: " + ((OrbitResearch) nObj7).speed + "Km/h");
                System.out.println("   ");
                break;
            case 5:
                System.out.println("  ☹  ");

                break;
        }

    }

}
