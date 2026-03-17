import javax.swing.*;

public class MembersHomeFrame {
    JFrame mhFrame = new JFrame();
    JButton backButton = new JButton();

    MembersHomeFrame(){
        mhFrame.setSize(800,600);
        mhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mhFrame.setLayout(null);
        mhFrame.setLocationRelativeTo(null);
        mhFrame.setTitle("Membership Management");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);

        mhFrame.add(backButton);
        mhFrame.setVisible(true);
    }
}
