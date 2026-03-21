package BorderLayouts;

import javax.swing.*;
import java.awt.*;

public class LayoutsDemo {
    static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("BorderLayout Demo");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        JLabel tilelable = new JLabel("Application Title",  JLabel.CENTER);
        frame.add(tilelable, BorderLayout.NORTH);

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(3, 1, 5, 5));

        JButton buttonOne = new JButton("Button One");
        JButton buttonTwo = new JButton("Button Two");
        JButton buttonThree = new JButton("Button Three");

        panel.add(buttonOne);
        panel.add(buttonTwo);
        panel.add(buttonThree);

        frame.add(panel, BorderLayout.WEST);

        JTextArea textArea = new JTextArea();

        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane, BorderLayout.CENTER);

        JButton submitbutton = new JButton("Submit");
        frame.add(submitbutton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
