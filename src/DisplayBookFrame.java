import javax.swing.*;

public class DisplayBookFrame {

    JFrame dbFrame = new JFrame();
    JButton backButton = new JButton();

    DisplayBookFrame(){

        dbFrame.setSize(800,600);
        dbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dbFrame.setLayout(null);
        dbFrame.setLocationRelativeTo(null);
        dbFrame.setTitle("Display Book");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);

        dbFrame.add(backButton);
        dbFrame.setVisible(true);
    }
}
