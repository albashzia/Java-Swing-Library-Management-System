package GUI.RoomFrames;

import javax.swing.*;

public class CancelReservationFrame {
    JFrame crFrame = new JFrame();
    JButton backButton = new JButton();

    public CancelReservationFrame(){
        crFrame.setSize(800,600);
        crFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crFrame.setLayout(null);
        crFrame.setLocationRelativeTo(null);
        crFrame.setTitle("Cancel Reservation");

        crFrame.setVisible(true);
    }
}
