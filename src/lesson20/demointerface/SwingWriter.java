package lesson20.demointerface;

import javax.swing.*;
import java.awt.*;

public class SwingWriter implements IWriter {
    @Override
    public void write(String message) {
        final JFrame frame = new JFrame("swing writer");
        frame.add(new JLabel(message, SwingConstants.CENTER), BorderLayout.CENTER);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
