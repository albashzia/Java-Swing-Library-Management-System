package GUI;

import javax.swing.*;

public class TestFrame {
    JFrame frame = new JFrame();
    CreateExitButton button = new CreateExitButton();
    TestFrame(){

        frame.setSize(800,600);
        frame.setTitle("Test Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        frame.add(button);
        frame.setVisible(true);
    }
}
