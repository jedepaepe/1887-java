package lesson14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Il faut préciser le mot à rechercher");
            return;
        }
        String target = args[0];
        try {
            Scanner scanner = new Scanner(new File("file.txt"));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(target)) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier n'existe pas");
            e.printStackTrace();
        }
    }
}
