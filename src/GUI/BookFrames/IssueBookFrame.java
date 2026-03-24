package GUI.BookFrames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IssueBookFrame implements ActionListener {

    JFrame ibFrame = new JFrame();
    JButton backButton = new JButton();
    JLabel label1 = new JLabel();

    IssueBookFrame(){

        ibFrame.setSize(800,600);
        ibFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ibFrame.setLayout(null);
        ibFrame.setLocationRelativeTo(null);
        ibFrame.setTitle("Issue Book");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        label1.setLocation(200,30);
        label1.setSize(400,70);
        label1.setBackground(Color.BLACK);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setText("Issue a Book");
        label1.setFont(new Font("Comic Sans",Font.ITALIC,35));
        label1.setForeground(Color.WHITE);
        label1.setOpaque(true);

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
