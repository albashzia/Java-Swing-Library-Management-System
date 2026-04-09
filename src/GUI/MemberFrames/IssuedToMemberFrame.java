package GUI.MemberFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;
import GUI.RoomFrames.CancelReservationFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IssuedToMemberFrame implements ActionListener {
    JFrame itmFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Books Issued to Member");
    IssuedToMemberFrame(){

        itmFrame.setSize(800,600);
        itmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        itmFrame.setLayout(null);
        itmFrame.setLocationRelativeTo(null);
        itmFrame.setTitle("Book Issued to Member");

        backButton.addActionListener(this);

        itmFrame.add(exitButton);
        itmFrame.add(label1);
        itmFrame.add(backButton);
        itmFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        itmFrame.dispose();
        new MembersHomeFrame();
    }
}
