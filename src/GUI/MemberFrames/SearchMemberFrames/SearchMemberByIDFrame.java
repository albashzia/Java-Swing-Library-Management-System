package GUI.MemberFrames.SearchMemberFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchMemberByIDFrame implements ActionListener {

    JFrame smiFrame = new JFrame();
    CreateLabel label = new CreateLabel("Search Member by ID");
    CreateExitButton exitButton = new CreateExitButton();
    CreateBackButton backButton = new CreateBackButton();
    JLabel idLabel = new JLabel();

    SearchMemberByIDFrame(){
        smiFrame.setSize(800,600);
        smiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        smiFrame.setLayout(null);
        smiFrame.setLocationRelativeTo(null);
        smiFrame.setTitle("Search Members by ID");

        backButton.addActionListener(this);

        smiFrame.add(backButton);
        smiFrame.add(exitButton);
        smiFrame.add(label);
        smiFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==backButton){
            smiFrame.dispose();
            new SearchMemberFrame();
        }
    }
}
