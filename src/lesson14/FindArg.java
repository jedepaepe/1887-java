package lesson14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindArg {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Il faut préciser le mot à rechercher et le fichier");
            System.out.println("Par exemple:");
            System.out.println("java FindArg file.txt hello");
            return;
        }
        String fileName = args[0];
        String target = args[1];
        try {
            Scanner scanner = new Scanner(new File(fileName));
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
