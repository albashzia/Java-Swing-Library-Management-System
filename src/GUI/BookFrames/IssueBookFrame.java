package GUI.BookFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IssueBookFrame implements ActionListener {

    JFrame ibFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Issue a Book");

    IssueBookFrame(){

        ibFrame.setSize(800,600);
        ibFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ibFrame.setLayout(null);
        ibFrame.setLocationRelativeTo(null);
        ibFrame.setTitle("Issue Book");

        backButton.addActionListener(this);

        ibFrame.add(backButton);
        ibFrame.add(label1);
        ibFrame.add(backButton);
        ibFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        ibFrame.dispose();
        new BooksHomeFrame();
    }
}
