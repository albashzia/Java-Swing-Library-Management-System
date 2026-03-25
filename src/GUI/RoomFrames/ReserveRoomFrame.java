package GUI.RoomFrames;

import javax.swing.*;

public class ReserveRoomFrame {
    JFrame rrFrame = new JFrame();
    JButton backButton = new JButton();

    public ReserveRoomFrame(){
        rrFrame.setSize(800,600);
        rrFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rrFrame.setLayout(null);
        rrFrame.setLocationRelativeTo(null);
        rrFrame.setTitle("Reserve Study Room");

        rrFrame.setVisible(true);
    }
}
