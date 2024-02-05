package lesson18.vehicule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoVehicule {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Concorde", "Dassault", 25.60);
        Boat boat1 = new Boat("France", "La France", 10.5);

        // ilustre l'héritage (extends)
        System.out.println(plane1.getBrand() + " " + plane1.getModel());
        System.out.println(boat1.getBrand() + " " + boat1.getModel());

        // spécialisation
        System.out.println("plane1 a une envergure de " + plane1.getWingSpane());
        System.out.println("boat1 a un tirant d'eau de " + boat1.getDraught());

        Vehicle[] vehicles = { plane1, boat1 };
        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}
