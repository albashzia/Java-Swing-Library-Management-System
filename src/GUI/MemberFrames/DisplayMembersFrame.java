package GUI.MemberFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayMembersFrame implements ActionListener {
    JFrame dmFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    //JButton backButton = new JButton();
    CreateLabel label1 = new CreateLabel("Display Members");
    DisplayMembersFrame(){

        dmFrame.setSize(800,600);
        dmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dmFrame.setLayout(null);
        dmFrame.setLocationRelativeTo(null);
        dmFrame.setTitle("Display Members");

        backButton.addActionListener(this);

        dmFrame.add(label1);
        dmFrame.add(backButton);
        dmFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        dmFrame.dispose();
        new MembersHomeFrame();
    }
}
