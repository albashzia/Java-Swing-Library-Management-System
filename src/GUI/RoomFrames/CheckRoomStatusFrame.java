package GUI.RoomFrames;

import javax.swing.*;

public class CheckRoomStatusFrame {
    JFrame crsFrame = new JFrame();
    public CheckRoomStatusFrame(){
        crsFrame.setSize(800,600);
        crsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crsFrame.setLayout(null);
        crsFrame.setLocationRelativeTo(null);
        crsFrame.setTitle("Show Available Rooms");

        crsFrame.setVisible(true);
    }
}
