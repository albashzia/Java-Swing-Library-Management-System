package GUI.MemberFrames.SearchMemberFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrameButton;
import GUI.AdditionalClasses.CreateLabel;
import GUI.MemberFrames.MembersHomeFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchMemberFrame implements ActionListener {
    JFrame smFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Search Member");

    CreateFrameButton button1 = new CreateFrameButton("Use ID",180,200);
    CreateFrameButton button2 = new CreateFrameButton("Use Name",420,200);

    public SearchMemberFrame(){

        smFrame.setSize(800,600);
        smFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        smFrame.setLayout(null);
        smFrame.setLocationRelativeTo(null);
        smFrame.setTitle("Search Members");

        button1.addActionListener(this);
        button2.addActionListener(this);

        backButton.addActionListener(this);

        smFrame.add(button1);
        smFrame.add(button2);
        smFrame.add(exitButton);
        smFrame.add(label1);
        smFrame.add(backButton);
        smFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            smFrame.dispose();
            new MembersHomeFrame();
        }
        if (e.getSource()==button1){
            smFrame.dispose();
            new SearchMemberByIDFrame();
        }
        if (e.getSource()==button2){
            smFrame.dispose();
            new SearchMemberByNameFrame();
        }
    }
}
