package GUI.MemberFrames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveMemberFrame implements ActionListener {
    JFrame rmFrame = new JFrame();
    JButton backButton = new JButton();

    RemoveMemberFrame(){

        rmFrame.setSize(800,600);
        rmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rmFrame.setLayout(null);
        rmFrame.setLocationRelativeTo(null);
        rmFrame.setTitle("Remove Member");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        rmFrame.add(backButton);
        rmFrame.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        rmFrame.dispose();
        new MembersHomeFrame();
    }
}
