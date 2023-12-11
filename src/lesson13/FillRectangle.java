package lesson13;

import java.util.Scanner;

public class FillRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de rectangles: ");
        int numberOfRectangles = scanner.nextInt();
        Rectangle[] rectangles = new Rectangle[numberOfRectangles];
        for (int i = 0; i < rectangles.length; ++i) {
            System.out.print("Hauteur et largeur du rectangle " + (i + 1) + ": ");
            double width = scanner.nextDouble();
            double height = scanner.nextDouble();
            rectangles[i] = new Rectangle(height, width);
        }

        for (Rectangle r : rectangles) {
            System.out.println(r.getPerimeter());
        }

        for (int i = 0; i < rectangles.length; ++i) {
            Rectangle r = rectangles[i];
            System.out.println(r.getPerimeter());
        }
    }
}
