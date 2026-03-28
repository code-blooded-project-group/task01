package BorderLayouts;

import javax.swing.*;
import java.awt.*;

public class LayoutsDemo {

    public LayoutsDemo(){
        this.CreateJFrame();
    }

    public JFrame CreateJFrame(){
        JFrame frame = new JFrame();
        frame.setTitle("BorderLayout Demo");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(CreatePanel(), BorderLayout.WEST);
        frame.add(CreateScrollPane(), BorderLayout.CENTER);
        frame.add(CreateSubmitButton(), BorderLayout.SOUTH);
        frame.add(CreateLabel(), BorderLayout.NORTH);
        frame.setVisible(true);
        return frame;
    }

    public JLabel CreateLabel(){
        JLabel tilelable = new JLabel("Application Title",  JLabel.CENTER);
        return tilelable;
    }

    public JPanel CreatePanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(CreateButtonOne());
        panel.add(CreateButtonTwo());
        panel.add(CreateButtonThree());
        return panel;
    }

    public JButton CreateButtonOne(){
        JButton buttonOne = new JButton("Button One");
        return buttonOne;
    }

    public JButton CreateButtonTwo(){
        JButton buttonTwo = new JButton("Button Two");
        return buttonTwo;
    }

    public JButton CreateButtonThree(){
        JButton buttonThree = new JButton("Button Three");
        return buttonThree;
    }

    public JTextArea  CreateTextArea(){
        JTextArea textArea = new JTextArea();
        return textArea;
    }

    public JScrollPane CreateScrollPane(){
        JScrollPane scrollPane = new JScrollPane(CreateTextArea());
        return scrollPane;
    }

    public JButton CreateSubmitButton(){
        JButton button = new JButton("Submit");
        return button;
    }
}
