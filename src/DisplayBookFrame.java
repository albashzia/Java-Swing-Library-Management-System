import javax.swing.*;

public class DisplayBookFrame {

    JFrame dbFrame = new JFrame();

    DisplayBookFrame(){

        dbFrame.setSize(800,600);
        dbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dbFrame.setLayout(null);
        dbFrame.setLocationRelativeTo(null);
        dbFrame.setTitle("Display Book");

        dbFrame.setVisible(true);
    }
}
