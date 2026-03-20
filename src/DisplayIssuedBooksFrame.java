import javax.swing.*;

public class DisplayIssuedBooksFrame {

    JFrame dibFrame = new JFrame();

    DisplayIssuedBooksFrame(){

        dibFrame.setSize(800,600);
        dibFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dibFrame.setLayout(null);
        dibFrame.setLocationRelativeTo(null);
        dibFrame.setTitle("Display Issued Books");

        dibFrame.setVisible(true);
    }
}
