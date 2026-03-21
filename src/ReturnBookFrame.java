import javax.swing.*;

public class ReturnBookFrame {

    JFrame rbFrame = new JFrame();
    JButton backButton = new JButton();

    ReturnBookFrame(){

        rbFrame.setSize(800,600);
        rbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rbFrame.setLayout(null);
        rbFrame.setLocationRelativeTo(null);
        rbFrame.setTitle("Return Book");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);

        rbFrame.add(backButton);
        rbFrame.setVisible(true);
    }
}
