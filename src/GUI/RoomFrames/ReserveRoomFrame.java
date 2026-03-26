package GUI.RoomFrames;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReserveRoomFrame implements ActionListener {
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
        backButton.addActionListener(this);

        rrFrame.add(backButton);
        rrFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            rrFrame.dispose();
            new RoomsHomeFrame();
        }
    }
}
