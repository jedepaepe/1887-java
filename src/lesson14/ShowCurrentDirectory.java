package lesson14;

public class ShowCurrentDirectory {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.out.println(currentDir);
    }
}
