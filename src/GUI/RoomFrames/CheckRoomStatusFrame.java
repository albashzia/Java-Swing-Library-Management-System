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

        crsFrame.setVisible(true);
    }
}
