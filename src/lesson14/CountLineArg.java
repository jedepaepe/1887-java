package lesson14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountLineArg {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Veuillez donner le nom du fichier");
            return;
        }
        String fileName = args[0];
        try {
            Scanner scanner = new Scanner(new File(fileName));
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
