package GUI.RoomFrames;

import javax.swing.*;

public class ShowRoomsFrame {
    JFrame srFrame = new JFrame();
    JButton backButton = new JButton();

    public ShowRoomsFrame(){
        srFrame.setSize(800,600);
        srFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        srFrame.setLayout(null);
        srFrame.setLocationRelativeTo(null);
        srFrame.setTitle("Show Available Rooms");

        srFrame.setVisible(true);
    }
}
