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

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);

        rrFrame.add(backButton);
        rrFrame.setVisible(true);
    }
}
