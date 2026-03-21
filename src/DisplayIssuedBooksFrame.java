import javax.swing.*;

public class DisplayIssuedBooksFrame {

    JFrame dibFrame = new JFrame();
    JButton backButton = new JButton();

    DisplayIssuedBooksFrame(){

        dibFrame.setSize(800,600);
        dibFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dibFrame.setLayout(null);
        dibFrame.setLocationRelativeTo(null);
        dibFrame.setTitle("Display Issued Books");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);

        dibFrame.add(backButton);
        dibFrame.setVisible(true);
    }
}
