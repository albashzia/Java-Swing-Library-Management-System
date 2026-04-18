package GUI.RoomFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReserveRoomFrame implements ActionListener {
    JFrame rrFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateLabel label1 = new CreateLabel("Reserve a Room");
    JLabel memberIdLabel = new JLabel();
    JTextField memberIdTextField = new JTextField();
    JLabel roomNumberLabel = new JLabel();
    JTextField roomNumberTextField = new JTextField();

    public ReserveRoomFrame(){
        rrFrame.setSize(800,600);
        rrFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rrFrame.setLayout(null);
        rrFrame.setLocationRelativeTo(null);
        rrFrame.setTitle("Reserve Study Room");

        memberIdLabel.setText("Enter Member Id: ");
        roomNumberLabel.setText("Enter room number: ");

        memberIdLabel.setBounds(100,120,200,100);
        roomNumberLabel.setBounds(100,170,200,100);

        memberIdLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));
        roomNumberLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));

        memberIdTextField.setBounds(270,160,100,30);
        roomNumberTextField.setBounds(300,210,300,30);

        memberIdTextField.setFont(new Font("Consolas",Font.BOLD,20));
        memberIdTextField.setForeground(Color.WHITE);
        memberIdTextField.setBackground(Color.BLACK);
        memberIdTextField.setCaretColor(Color.WHITE);

        roomNumberTextField.setFont(new Font("Consolas",Font.BOLD,20));
        roomNumberTextField.setForeground(Color.WHITE);
        roomNumberTextField.setBackground(Color.BLACK);
        roomNumberTextField.setCaretColor(Color.WHITE);

        backButton.addActionListener(this);

        rrFrame.add(label1);
        rrFrame.add(backButton);
        rrFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            rrFrame.dispose();
            new RoomsHomeFrame();
        }
    }
}
