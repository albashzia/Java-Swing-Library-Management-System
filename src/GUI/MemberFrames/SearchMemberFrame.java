package GUI.MemberFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchMemberFrame implements ActionListener {
    JFrame smFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateLabel label1 = new CreateLabel("Search Member");
    SearchMemberFrame(){

        smFrame.setSize(800,600);
        smFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        smFrame.setLayout(null);
        smFrame.setLocationRelativeTo(null);
        smFrame.setTitle("Search Members");

        backButton.addActionListener(this);

        smFrame.add(label1);
        smFrame.add(backButton);
        smFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        smFrame.dispose();
        new MembersHomeFrame();
    }
}
