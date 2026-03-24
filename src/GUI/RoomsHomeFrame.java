package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoomsHomeFrame implements ActionListener {
    
    JFrame srhFrame = new JFrame();
    JButton backButton = new JButton();
    JLabel label1 = new JLabel();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();

    RoomsHomeFrame(){
        srhFrame.setSize(800,600);
        srhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        srhFrame.setLayout(null);
        srhFrame.setLocationRelativeTo(null);
        srhFrame.setTitle("Study Room Management");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        label1.setLocation(150,30);
        label1.setSize(500,70);
        label1.setBackground(Color.BLACK);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setText("Study Room Management");
        label1.setFont(new Font("Comic Sans",Font.ITALIC,35));
        label1.setForeground(Color.WHITE);
        label1.setOpaque(true);

        button1.setBounds(120,130,200,50);
        button2.setBounds(120,190,200,50);
        button3.setBounds(120,250,200,50);
        button4.setBounds(120,310,200,50);

        button1.setText("Show Available Rooms");
        button2.setText("Reserve Study Room");
        button3.setText("Cancel Reservation");
        button4.setText("Check Reservation Status");

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);

        srhFrame.add(button1);
        srhFrame.add(button2);
        srhFrame.add(button3);
        srhFrame.add(button4);
        srhFrame.add(label1);
        srhFrame.add(backButton);
        srhFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            srhFrame.dispose();
            new HomeFrame();
        }
    }
}
