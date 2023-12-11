package lesson13;

public class NoArgsError {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        }
        else {
            System.out.println("veuiller fournir un argument");
        }
    }
}
