package lesson20.demointerface;

public class DemoDisplay {
    public static void main(String[] args) {
        ConsoleWriter console = new ConsoleWriter();
        FileWriter file = new FileWriter("file.txt");
        SwingWriter swing = new SwingWriter();
        IWriter[] writers = { console, file, swing };
        for (IWriter writer : writers) {
            writer.write("hello java");
        }
    }
}
