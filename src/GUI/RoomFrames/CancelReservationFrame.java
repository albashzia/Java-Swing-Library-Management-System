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

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);

        crFrame.add(backButton);
        crFrame.setVisible(true);
    }
}
