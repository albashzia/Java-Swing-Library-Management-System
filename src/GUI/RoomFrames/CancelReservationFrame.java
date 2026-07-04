package GUI.RoomFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateLabel;
import GUI.AdditionalClasses.CreateSubmitButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelReservationFrame implements ActionListener {
    JFrame crFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateLabel label1 = new CreateLabel("Cancel Reservation");
    CreateExitButton exitButton = new CreateExitButton();
    JTextField roomNumberTextField = new JTextField();
    JLabel roomNumberLabel = new JLabel();
    CreateSubmitButton submitButton = new CreateSubmitButton(350,280,"Cancel");

    public CancelReservationFrame(){
        crFrame.setSize(800,600);
        crFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crFrame.setLayout(null);
        crFrame.setLocationRelativeTo(null);
        crFrame.setTitle("Cancel Reservation");

        roomNumberLabel.setText("Enter room number to cancel reservation : ");
        roomNumberLabel.setBounds(10,150,500,100);
        roomNumberLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,25));

        roomNumberTextField.setBounds(10,220,760,30);
        roomNumberTextField.setFont(new Font("Comic",Font.BOLD,20));
        roomNumberTextField.setForeground(Color.WHITE);
        roomNumberTextField.setBackground(Color.BLACK);
        roomNumberTextField.setCaretColor(Color.WHITE);

        backButton.addActionListener(this);

        crFrame.add(submitButton);
        crFrame.add(exitButton);
        crFrame.add(label1);
        crFrame.add(backButton);
        crFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            crFrame.dispose();
            new RoomsHomeFrame();
        }
    }
}
