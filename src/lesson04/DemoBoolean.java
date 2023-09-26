package lesson04;

public class DemoBoolean {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        boolean b1AndB2 = b1 && b2;
        System.out.println("and operation: " + b1 + " && " + b2 + " = " + b1AndB2);

        boolean b1OrB2 = b1 || b2;
        System.out.println("or operation: " + b1 + " || " + b2 + " = " + b1OrB2);

        boolean notB1 = ! b1;
        System.out.println("not operation: ! " + b1 + " = " + notB1);

        boolean notB2 = ! b2;
        System.out.println("not operation: ! " + b2 + " = " + notB2);
    }
}
