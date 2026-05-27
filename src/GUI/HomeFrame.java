package GUI;

import GUI.AdditionalClasses.CreateFrameButton;
import GUI.AdditionalClasses.CreateLabel;
import GUI.BookFrames.BooksHomeFrame;
import GUI.MemberFrames.MembersHomeFrame;
import GUI.RoomFrames.RoomsHomeFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeFrame implements ActionListener {

    JFrame homeFrame = new JFrame();
    CreateFrameButton button1 = new CreateFrameButton("Books Management",80,160);
    CreateFrameButton button2 = new CreateFrameButton("Member Management",300,160);
    CreateFrameButton button3 = new CreateFrameButton("Room Management",520,160);

    CreateLabel label = new CreateLabel("Library Management System");
    JButton testButton = new JButton();

    JButton exitButton = new JButton();

    public HomeFrame(){

        homeFrame.setSize(800,600);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setLayout(null);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setTitle("Library Management System");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        exitButton.setSize(240,50);
        exitButton.setLocation(280,400);
        exitButton.setText("Exit");
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);

        testButton.setSize(240,50);
        testButton.setLocation(280,320);
        testButton.setText("Test Frame");
        testButton.setFocusable(false);
        testButton.addActionListener(this);
        homeFrame.add(testButton);

        homeFrame.add(button1);
        homeFrame.add(button2);
        homeFrame.add(button3);

        homeFrame.add(exitButton);

        homeFrame.add(label);

        homeFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){
            homeFrame.dispose();
            new BooksHomeFrame();
        }
        if(e.getSource()==button2){
            homeFrame.dispose();
            new MembersHomeFrame();
        }
        if (e.getSource()==button3){
            homeFrame.dispose();
            new RoomsHomeFrame();
        }
        if (e.getSource()==exitButton){
            homeFrame.dispose();
        }

        if (e.getSource()==testButton){
            homeFrame.dispose();
            new TestFrame();
        }
    }
}
