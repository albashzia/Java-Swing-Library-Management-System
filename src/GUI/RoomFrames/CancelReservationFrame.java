package GUI.RoomFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelReservationFrame implements ActionListener {
    JFrame crFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateLabel label1 = new CreateLabel("Cancel Reservation");

    public CancelReservationFrame(){
        crFrame.setSize(800,600);
        crFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crFrame.setLayout(null);
        crFrame.setLocationRelativeTo(null);
        crFrame.setTitle("Cancel Reservation");

        backButton.addActionListener(this);

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
