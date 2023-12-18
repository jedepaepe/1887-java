package lesson14;

import java.util.Scanner;

public class ValidateSapNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Introduisez un SAP nr: ");
            String sapNr = scanner.next();
            boolean isValid = validSapNr3(sapNr);
            System.out.println(isValid);
        }
    }

    // string qui contient 6 digits exactement
    // 123456 true
    // 001231 true
    // 100000 true
    // 12345 false
    // a123456 false
    // 1234567 false
    private static boolean validSapNr(String sapNr) {
        if (sapNr.length() != 6) {
            return false;
        }
        for (int i = 0; i < sapNr.length(); ++i) {
            char c = sapNr.charAt(i);
            if (! Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean validSapNr2(String sapNr) {
        if (sapNr.length() != 6) {
            return false;
        }
        for (int i = 0; i < sapNr.length(); ++i) {
            char c = sapNr.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    private static boolean validSapNr3(String sapNr) {
        return sapNr.matches("^[0-9]{6}$");
    }
}
