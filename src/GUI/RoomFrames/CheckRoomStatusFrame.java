package GUI.RoomFrames;

import GUI.CreateLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckRoomStatusFrame implements ActionListener {
    JFrame crsFrame = new JFrame();
    JButton backButton = new JButton();
    CreateLabel label1 = new CreateLabel("Check Room Status");
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
        backButton.addActionListener(this);

        crsFrame.add(label1);
        crsFrame.add(backButton);
        crsFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            crsFrame.dispose();
            new RoomsHomeFrame();
        }
    }
}
