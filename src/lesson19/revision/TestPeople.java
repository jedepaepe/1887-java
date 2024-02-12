package lesson19.revision;

public class TestPeople {
    public static void main(String[] args) {
        Person pe = new Person("Guy", "Duchêne");
        pe.getName();
        Contact co = new Contact("Isabelle", "Dubois", "isa.dubois@epfc.eu", "0123");
        Employee em = new Employee("Norman", "Duchamps", "norman.duchamps@epfc.eu", "1234", 1_000_000.98);
        Client cl = new Client("Sophie", "Duhoux", "sophie.duhoux@epfc.eu", "2345", 6383.12);
        String str = pe.toString();
        System.out.println(str);
        str = co.toString();
        System.out.println(str);
        str = em.toString();
        System.out.println(str);
        str = cl.toString();
        System.out.println(str);
    }
}
