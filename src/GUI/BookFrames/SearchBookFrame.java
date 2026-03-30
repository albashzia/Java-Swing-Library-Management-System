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

        button1.setBounds(120,160,220,50);
        button2.setBounds(120,240,220,50);
        button3.setBounds(120,320,220,50);

        button1.setText("Search using Book ID");
        button2.setText("Search using Book Title");
        button3.setText("Search using Author Name");

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);

        button1.addActionListener(this);

        backButton.addActionListener(this);

        sbFrame.add(button1);
        sbFrame.add(button2);
        sbFrame.add(button3);
        sbFrame.add(label1);
        sbFrame.add(backButton);
        sbFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            sbFrame.dispose();
            new BooksHomeFrame();
        }
        if (e.getSource()==button1){
            sbFrame.dispose();
            new SearchBookByIdFrame();
        }
    }
}
