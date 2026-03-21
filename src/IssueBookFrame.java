import javax.swing.*;

public class IssueBookFrame {

    JFrame ibFrame = new JFrame();
    JButton backButton = new JButton();

    IssueBookFrame(){

        ibFrame.setSize(800,600);
        ibFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ibFrame.setLayout(null);
        ibFrame.setLocationRelativeTo(null);
        ibFrame.setTitle("Issue Book");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);

        ibFrame.add(backButton);
        ibFrame.setVisible(true);
    }
}
