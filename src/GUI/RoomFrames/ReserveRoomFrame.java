package GUI.RoomFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;

import javax.swing.*;
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
