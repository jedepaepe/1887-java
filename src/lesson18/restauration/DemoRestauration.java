package lesson18.restauration;

import java.util.ArrayList;

public class DemoRestauration {
    public static void main(String[] args) {
        CarteElement c1 = new CarteElement("ramen", 18, new ArrayList<>(), "ramen.png");
        System.out.println(c1.getNom() + " " + c1.getPrix() + "€");

        CarteElement c2 = new CarteElement();
        System.out.println(c2.getNom());

        Entree entree1 = new Entree();
        entree1.setNom("carpaccio");
    }
}
