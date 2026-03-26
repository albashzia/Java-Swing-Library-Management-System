package GUI.RoomFrames;

import GUI.CreateLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowRoomsFrame implements ActionListener {
    JFrame srFrame = new JFrame();
    JButton backButton = new JButton();
    CreateLabel label1 = new CreateLabel("Show Available Rooms");
    public ShowRoomsFrame(){
        srFrame.setSize(800,600);
        srFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        srFrame.setLayout(null);
        srFrame.setLocationRelativeTo(null);
        srFrame.setTitle("Show Available Rooms");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        srFrame.add(label1);
        srFrame.add(backButton);
        srFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==backButton){
            srFrame.dispose();
            new RoomsHomeFrame();
        }
    }
}
