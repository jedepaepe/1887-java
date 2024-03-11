package lesson21.exinterface;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("C pour un cercle");
            System.out.println("S pour carré");
            System.out.println("Q pour quitter l'application");
            choice = scanner.next();
            switch (choice) {
                case "C":
                    System.out.print("rayon: ");
                    double radius = scanner.nextDouble();
                    playWith(new Circle(radius));
                    break;
                case "S":
                    System.out.print("côté: ");
                    double side = scanner.nextDouble();
                    playWith(new Square(side));
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Votre choix " + choice + " n'est pas valide");
            }
            System.out.println();
        } while (! choice.equals("Q"));
        System.out.println("A bientôt");
    }

    private static void playWith(IShape shape) {
        System.out.println("périmètre: " + shape.getPerimeter());
        System.out.println("aire: " + shape.getArea());
        shape.draw();
    }
}
