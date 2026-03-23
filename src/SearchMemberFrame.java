import javax.swing.*;

public class SearchMemberFrame {
    JFrame smFrame = new JFrame();
    JButton backButton = new JButton();

    SearchMemberFrame(){

        smFrame.setSize(800,600);
        smFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        smFrame.setLayout(null);
        smFrame.setLocationRelativeTo(null);
        smFrame.setTitle("Search Members");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);

        smFrame.add(backButton);
        smFrame.setVisible(true);
    }
}
