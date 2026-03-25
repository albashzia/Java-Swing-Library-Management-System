package GUI.RoomFrames;

import javax.swing.*;

public class CheckRoomStatusFrame {
    JFrame crsFrame = new JFrame();
    JButton backButton = new JButton();

    public CheckRoomStatusFrame(){
        crsFrame.setSize(800,600);
        crsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crsFrame.setLayout(null);
        crsFrame.setLocationRelativeTo(null);
        crsFrame.setTitle("Check Reservation Status");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);

        crsFrame.add(backButton);
        crsFrame.setVisible(true);
    }
}
