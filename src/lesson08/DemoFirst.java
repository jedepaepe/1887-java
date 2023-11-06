package lesson08;

import java.util.Scanner;

public class DemoFirst {
    public static void main(String[] args) {
        // random et min sont des méthodes statiques
        //  elles sont "attachées" à la classe
        double value = Math.random();
        int a = Math.min(10, 20);

        // println est une méthode non statique
        // elle est "attachée" à l'instance de la classe (out)
        System.out.println("hi");

        // nextLine est une méthode non statique
        // elle est "attachée" à l'instance d ela classe, keyboard et text
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        Scanner text = new Scanner("Bonjour à tous");
        line = text.nextLine();
    }
}
