package GUI.MemberFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IssuedToMemberFrame implements ActionListener {
    JFrame itmFrame = new JFrame();
    JLabel idLabel = new JLabel();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Books Issued to Member");
    IssuedToMemberFrame(){

        idLabel.setText("Enter Member ID : ");
        idLabel.setBounds(10,80,200,100);
        idLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));

        itmFrame.setSize(800,600);
        itmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        itmFrame.setLayout(null);
        itmFrame.setLocationRelativeTo(null);
        itmFrame.setTitle("Book Issued to Member");

        backButton.addActionListener(this);

        itmFrame.add(idLabel);
        itmFrame.add(exitButton);
        itmFrame.add(label1);
        itmFrame.add(backButton);
        itmFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            itmFrame.dispose();
            new MembersHomeFrame();
        }
    }
}
