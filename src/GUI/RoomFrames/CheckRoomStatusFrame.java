package GUI.RoomFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckRoomStatusFrame implements ActionListener {
    JFrame crsFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateLabel label1 = new CreateLabel("Check Room Status");
    JLabel roomNumberLabel = new JLabel();
    JTextField roomNumberTextField = new JTextField();

    public CheckRoomStatusFrame(){
        crsFrame.setSize(800,600);
        crsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crsFrame.setLayout(null);
        crsFrame.setLocationRelativeTo(null);
        crsFrame.setTitle("Check Reservation Status");

        roomNumberLabel.setText("Enter room number to check status : ");
        roomNumberLabel.setBounds(80,150,350,100);
        roomNumberLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));

        roomNumberTextField.setBounds(415,190,100,30);
        roomNumberTextField.setFont(new Font("Consolas",Font.BOLD,20));
        roomNumberTextField.setForeground(Color.WHITE);
        roomNumberTextField.setBackground(Color.BLACK);
        roomNumberTextField.setCaretColor(Color.WHITE);

        backButton.addActionListener(this);

        crsFrame.add(roomNumberTextField);
        crsFrame.add(roomNumberLabel);
        crsFrame.add(label1);
        crsFrame.add(backButton);
        crsFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            crsFrame.dispose();
            new RoomsHomeFrame();
        }
    }
}
