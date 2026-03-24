package GUI.BookFrames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayIssuedBooksFrame implements ActionListener {

    JFrame dibFrame = new JFrame();
    JButton backButton = new JButton();
    JLabel label1 = new JLabel();

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

        label1.setLocation(200,30);
        label1.setSize(400,70);
        label1.setBackground(Color.BLACK);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setText("Display Issued Books");
        label1.setFont(new Font("Comic Sans",Font.ITALIC,35));
        label1.setForeground(Color.WHITE);
        label1.setOpaque(true);

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
