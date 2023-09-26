package lesson03;

import java.util.Scanner;

public class Ex5TemperatureConvertissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Température en Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println("Températeur en Farenheit: " + ((9. / 5.) * celsius + 32));
    }
}
