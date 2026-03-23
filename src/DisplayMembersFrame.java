import javax.swing.*;

public class DisplayMembersFrame {
    JFrame dmFrame = new JFrame();
    JButton backButton = new JButton();

    DisplayMembersFrame(){

        dmFrame.setSize(800,600);
        dmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dmFrame.setLayout(null);
        dmFrame.setLocationRelativeTo(null);
        dmFrame.setTitle("Display Members");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);

        dmFrame.add(backButton);
        dmFrame.setVisible(true);
    }
}
