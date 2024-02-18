package lesson20.demointerface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter implements IWriter {
    private final String fileName;

    public FileWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(String message) {
        try (PrintWriter printWriter = new PrintWriter(fileName)) {
            printWriter.println(message);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
