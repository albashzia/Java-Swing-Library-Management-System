package GUI.RoomFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrameButton;
import GUI.AdditionalClasses.CreateLabel;
import GUI.HomeFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoomsHomeFrame implements ActionListener {
    
    JFrame srhFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Study Room Management");
    CreateFrameButton button1 = new CreateFrameButton("Show Rooms",190,130);
    CreateFrameButton button2 = new CreateFrameButton("Reserve Study Room",410,130);
    CreateFrameButton button3 = new CreateFrameButton("Cancel Reservation",190,240);
    CreateFrameButton button4 = new CreateFrameButton("Check Status",410,240);

    public RoomsHomeFrame(){
        srhFrame.setSize(800,600);
        srhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        srhFrame.setLayout(null);
        srhFrame.setLocationRelativeTo(null);
        srhFrame.setTitle("Study Room Management");

        backButton.addActionListener(this);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        srhFrame.add(exitButton);
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
