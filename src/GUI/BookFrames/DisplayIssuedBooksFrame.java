package GUI.BookFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayIssuedBooksFrame implements ActionListener {

    JFrame dibFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateLabel label1 = new CreateLabel("Display Issued Books");

    DisplayIssuedBooksFrame(){

        dibFrame.setSize(800,600);
        dibFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dibFrame.setLayout(null);
        dibFrame.setLocationRelativeTo(null);
        dibFrame.setTitle("Display Issued Books");

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
