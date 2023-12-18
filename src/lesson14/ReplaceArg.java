package lesson14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReplaceArg {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Il faut préciser le fichier, le mot à replacer et le mot de remplacement");
            System.out.println("Par exemple:");
            System.out.println("java ReplaceArg file.txt hello coucou");
            return;
        }
        String fileName = args[0];
        String target = args[1];
        String replacement = args[2];
        try {
            Scanner scanner = new Scanner(new File(fileName));
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
