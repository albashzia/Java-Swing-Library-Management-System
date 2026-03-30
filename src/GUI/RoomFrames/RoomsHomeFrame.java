package GUI.RoomFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;
import GUI.HomeFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoomsHomeFrame implements ActionListener {
    
    JFrame srhFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateLabel label1 = new CreateLabel("Study Room Management");
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();

    public RoomsHomeFrame(){
        srhFrame.setSize(800,600);
        srhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        srhFrame.setLayout(null);
        srhFrame.setLocationRelativeTo(null);
        srhFrame.setTitle("Study Room Management");

        backButton.addActionListener(this);

        button1.setBounds(120,130,200,50);
        button2.setBounds(120,190,200,50);
        button3.setBounds(120,250,200,50);
        button4.setBounds(120,310,200,50);

        button1.setText("Show Available Rooms");
        button2.setText("Reserve Study Room");
        button3.setText("Cancel Reservation");
        button4.setText("Check Reservation Status");

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        srhFrame.add(button1);
        srhFrame.add(button2);
        srhFrame.add(button3);
        srhFrame.add(button4);
        srhFrame.add(label1);
        srhFrame.add(backButton);
        srhFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            srhFrame.dispose();
            new HomeFrame();
        }
        if (e.getSource()==button1){
            srhFrame.dispose();
            new ShowRoomsFrame();
        }
        if (e.getSource()==button2){
            srhFrame.dispose();
            new ReserveRoomFrame();
        }
        if (e.getSource()==button3){
            srhFrame.dispose();
            new CancelReservationFrame();
        }
        if (e.getSource()==button4){
            srhFrame.dispose();
            new CheckRoomStatusFrame();
        }
    }
}
