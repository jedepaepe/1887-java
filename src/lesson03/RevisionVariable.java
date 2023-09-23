package lesson03;

public class RevisionVariable {
    public static void main(String[] args) {
        int a;      // déclaration de la variable de nom a et de type int
        a = 25;     // assignation de la valeur 25 à la variable a
        System.out.println(a);      // affichage de la valeur de la variable (25)
        a = -100;   // assignation de la valeur -100 à la variable a

        int b = 2 * a;  // déclaration de la variable b et assignation de la valeur 2 * a (soit -200)
        System.out.println(b);      // affichage de la valeur de la variable (-200)
    }
}
