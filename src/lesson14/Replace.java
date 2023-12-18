package lesson14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Il faut préciser le mot à replacer et le mot de remplacement");
            return;
        }
        String target = args[0];
        String replacement = args[1];
        try {
            Scanner scanner = new Scanner(new File("file.txt"));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine().replace(target, replacement);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier n'existe pas");
            e.printStackTrace();
        }
    }
}
