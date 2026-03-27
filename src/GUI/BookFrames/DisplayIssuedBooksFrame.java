package GUI.BookFrames;

import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayIssuedBooksFrame implements ActionListener {

    JFrame dibFrame = new JFrame();
    JButton backButton = new JButton();
    CreateLabel label1 = new CreateLabel("Display Issued Books");

    DisplayIssuedBooksFrame(){

        dibFrame.setSize(800,600);
        dibFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dibFrame.setLayout(null);
        dibFrame.setLocationRelativeTo(null);
        dibFrame.setTitle("Display Issued Books");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        dibFrame.add(label1);
        dibFrame.add(backButton);
        dibFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        dibFrame.dispose();
        new BooksHomeFrame();
    }
}
