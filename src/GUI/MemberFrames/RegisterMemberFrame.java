package GUI.MemberFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterMemberFrame implements ActionListener {
    JFrame rmFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateLabel label1 = new CreateLabel("Register a Member");

    RegisterMemberFrame(){

        rmFrame.setSize(800,600);
        rmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rmFrame.setLayout(null);
        rmFrame.setLocationRelativeTo(null);
        rmFrame.setTitle("Register a Member");

        backButton.addActionListener(this);

        rmFrame.add(label1);
        rmFrame.add(backButton);
        rmFrame.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        rmFrame.dispose();
        new MembersHomeFrame();
    }
}
