package GUI.MemberFrames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchMemberFrame implements ActionListener {
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
        backButton.addActionListener(this);

        smFrame.add(backButton);
        smFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        smFrame.dispose();
        new MembersHomeFrame();
    }
}
