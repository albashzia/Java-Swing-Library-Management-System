package GUI.BookFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayBookFrame implements ActionListener {

    JFrame dbFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Display a Book");

    DisplayBookFrame(){

        dbFrame.setSize(800,600);
        dbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dbFrame.setLayout(null);
        dbFrame.setLocationRelativeTo(null);
        dbFrame.setTitle("Display Book");

        backButton.addActionListener(this);

        dbFrame.add(exitButton);
        dbFrame.add(label1);
        dbFrame.add(backButton);
        dbFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        dbFrame.dispose();
        new BooksHomeFrame();
    }
}
