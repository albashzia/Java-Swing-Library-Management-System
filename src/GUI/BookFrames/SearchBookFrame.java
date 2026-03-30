package GUI.BookFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookFrame implements ActionListener {

    JFrame sbFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    CreateLabel label1 = new CreateLabel("Search a Book");

    SearchBookFrame(){

        sbFrame.setSize(800,600);
        sbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbFrame.setLayout(null);
        sbFrame.setLocationRelativeTo(null);
        sbFrame.setTitle("Search Book");

        backButton.addActionListener(this);

        sbFrame.add(label1);
        sbFrame.add(backButton);
        sbFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        sbFrame.dispose();
        new BooksHomeFrame();
    }
}
