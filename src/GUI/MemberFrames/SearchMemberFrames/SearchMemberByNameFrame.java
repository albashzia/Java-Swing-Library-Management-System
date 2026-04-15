package GUI.MemberFrames.SearchMemberFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchMemberByNameFrame implements ActionListener {

    JFrame smnFrame = new JFrame();
    CreateLabel label = new CreateLabel("Search Member by Name",450);
    CreateExitButton exitButton = new CreateExitButton();
    JLabel nameLabel = new JLabel();
    CreateBackButton backButton = new CreateBackButton();

    SearchMemberByNameFrame(){
        smnFrame.setSize(800,600);
        smnFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        smnFrame.setLayout(null);
        smnFrame.setLocationRelativeTo(null);
        smnFrame.setTitle("Search Members by Name");

        nameLabel.setText("Enter Member Name : ");
        nameLabel.setBounds(100,170,200,100);
        nameLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));

        backButton.addActionListener(this);

        smnFrame.add(nameLabel);
        smnFrame.add(backButton);
        smnFrame.add(exitButton);
        smnFrame.add(label);
        smnFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            smnFrame.dispose();
            new SearchMemberFrame();
        }
    }
}
