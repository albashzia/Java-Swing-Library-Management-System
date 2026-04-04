package GUI;

import javax.swing.*;

public class TestFrame {
    JFrame frame = new JFrame();
    CreateExitButton button = new CreateExitButton();
    CreateSubmitButton sb1 = new CreateSubmitButton("Submit");
    CreateSubmitButton sb2 = new CreateSubmitButton(200,200,"Submit");
    CreateSubmitButton sb3 = new CreateSubmitButton(400,400,100,50,"Submit");
    TestFrame(){

        frame.setSize(800,600);
        frame.setTitle("Test Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        frame.add(sb1);
        frame.add(sb2);
        frame.add(sb3);
        frame.add(button);
        frame.setVisible(true);
    }
}
