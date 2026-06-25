package GUI.RoomFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateLabel;
import GUI.AdditionalClasses.CreateSubmitButton;

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
    CreateExitButton exitButton = new CreateExitButton();
    CreateSubmitButton submitButton = new CreateSubmitButton(350,290,"Reserve");

    public ReserveRoomFrame(){
        rrFrame.setSize(800,600);
        rrFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rrFrame.setLayout(null);
        rrFrame.setLocationRelativeTo(null);
        rrFrame.setTitle("Reserve Study Room");

        memberIdLabel.setText("Enter Member Id: ");
        memberIdLabel.setBounds(10,80,400,100);
        memberIdLabel.setFont(new Font("Comic Sans",Font.PLAIN,25));


        roomNumberLabel.setText("Enter room number: ");
        roomNumberLabel.setBounds(10,150,300,100);
        roomNumberLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,25));

        memberIdTextField.setBounds(10,150,760,30);
        memberIdTextField.setFont(new Font("Comic",Font.BOLD,20));
        memberIdTextField.setForeground(Color.WHITE);
        memberIdTextField.setBackground(Color.BLACK);
        memberIdTextField.setCaretColor(Color.WHITE);
        
        roomNumberTextField.setBounds(10,220,760,30);
        roomNumberTextField.setFont(new Font("Comic",Font.BOLD,20));
        roomNumberTextField.setForeground(Color.WHITE);
        roomNumberTextField.setBackground(Color.BLACK);
        roomNumberTextField.setCaretColor(Color.WHITE);


        backButton.addActionListener(this);

        rrFrame.add(submitButton);
        rrFrame.add(exitButton);
        rrFrame.add(memberIdLabel);
        rrFrame.add(memberIdTextField);
        rrFrame.add(roomNumberLabel);
        rrFrame.add(roomNumberTextField);
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
