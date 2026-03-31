package GUI.MemberFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;
import GUI.HomeFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MembersHomeFrame implements ActionListener {
    JFrame mhFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Membership Management");
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();

    public MembersHomeFrame(){
        mhFrame.setSize(800,600);
        mhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mhFrame.setLayout(null);
        mhFrame.setLocationRelativeTo(null);
        mhFrame.setTitle("Membership Management");

        backButton.addActionListener(this);

        button1.setBounds(120,130,200,50);
        button2.setBounds(120,190,200,50);
        button3.setBounds(120,250,200,50);
        button4.setBounds(120,310,200,50);
        button5.setBounds(120,370,200,50);

        button1.setText("Register member");
        button2.setText("Display all members");
        button3.setText("Search member");
        button4.setText("View Issued Books");
        button5.setText("Remove member");

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);
        button5.setFocusable(false);

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
