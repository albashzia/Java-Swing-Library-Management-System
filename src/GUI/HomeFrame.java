package GUI;

import GUI.BookFrames.BooksHomeFrame;
import GUI.MemberFrames.MembersHomeFrame;
import GUI.RoomFrames.RoomsHomeFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeFrame implements ActionListener {

    JFrame homeFrame = new JFrame();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();

    CreateLabel label = new CreateLabel("Library Management System",600);
    JButton testButton = new JButton();

    JButton exitButton = new JButton();

    public HomeFrame(){

        homeFrame.setSize(800,600);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setLayout(null);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setTitle("Library Management System");

        button1.setSize(240,50);
        button2.setSize(240,50);
        button3.setSize(240,50);

        button1.setLocation(100,160);
        button2.setLocation(100,240);
        button3.setLocation(100,320);

        button1.setText("Books Management");
        button2.setText("Membership Management");
        button3.setText("Study Room Management");
        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        exitButton.setSize(240,50);
        exitButton.setLocation(100,400);
        exitButton.setText("Exit");
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);

        testButton.setSize(240,50);
        testButton.setLocation(100,480);
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
