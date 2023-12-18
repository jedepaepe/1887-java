package lesson14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountLine {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("file.txt"));
            int count = 0;
            while(scanner.hasNextLine()) {
                ++count;
                scanner.nextLine();
            }
            System.out.println(count + " lignes");
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier n'existe pas");
            e.printStackTrace();
        }
    }
}
