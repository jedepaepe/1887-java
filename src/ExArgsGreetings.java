public class ExArgsGreetings {
    public static void main(String[] args) {
        if (args.length >= 1) {
            System.out.println("Hello " + args[0]);
        }
        else {
            System.err.println("Veuillez donner un nom en argument");
        }
    }
}
