package GUI.MemberFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrameButton;
import GUI.AdditionalClasses.CreateLabel;
import GUI.HomeFrame;
import GUI.MemberFrames.SearchMemberFrames.SearchMemberFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MembersHomeFrame implements ActionListener {
    JFrame mhFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Membership Management");
    CreateFrameButton button1 = new CreateFrameButton("Register member",80,130);
    CreateFrameButton button2 = new CreateFrameButton("Display all members",300,130);
    CreateFrameButton button3 = new CreateFrameButton("Search member",520,130);
    CreateFrameButton button4 = new CreateFrameButton("View Issued Books",190,240);
    CreateFrameButton button5 = new CreateFrameButton("Remove member",410,240);

    public MembersHomeFrame(){
        mhFrame.setSize(800,600);
        mhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mhFrame.setLayout(null);
        mhFrame.setLocationRelativeTo(null);
        mhFrame.setTitle("Membership Management");

        backButton.addActionListener(this);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);

        mhFrame.add(exitButton);
        mhFrame.add(button1);
        mhFrame.add(button2);
        mhFrame.add(button3);
        mhFrame.add(button4);
        mhFrame.add(button5);
        mhFrame.add(label1);
        mhFrame.add(backButton);
        mhFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            mhFrame.dispose();
            new HomeFrame();
        }
        if(e.getSource()==button1){
            mhFrame.dispose();
            new RegisterMemberFrame();
        }
        if (e.getSource()==button2){
            mhFrame.dispose();
            new DisplayMembersFrame();
        }
        if (e.getSource()==button3){
            mhFrame.dispose();
            new SearchMemberFrame();
        }
        if (e.getSource()==button4){
            mhFrame.dispose();
            new IssuedToMemberFrame();
        }
        if (e.getSource()==button5){
            mhFrame.dispose();
            new RemoveMemberFrame();
        }
    }
}
