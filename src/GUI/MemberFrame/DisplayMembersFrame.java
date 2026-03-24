package GUI.MemberFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayMembersFrame implements ActionListener {
    JFrame dmFrame = new JFrame();
    JButton backButton = new JButton();

    DisplayMembersFrame(){

        dmFrame.setSize(800,600);
        dmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dmFrame.setLayout(null);
        dmFrame.setLocationRelativeTo(null);
        dmFrame.setTitle("Display Members");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        dmFrame.add(backButton);
        dmFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        dmFrame.dispose();
        new MembersHomeFrame();
    }
}
