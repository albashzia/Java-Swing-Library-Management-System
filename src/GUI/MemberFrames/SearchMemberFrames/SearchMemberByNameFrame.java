package GUI.MemberFrames.SearchMemberFrames;

import GUI.CreateLabel;

import javax.swing.*;

public class SearchMemberByNameFrame {

    JFrame smnFrame = new JFrame();
    CreateLabel label = new CreateLabel("Search Member by Name");

    SearchMemberByNameFrame(){
        smnFrame.setSize(800,600);
        smnFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        smnFrame.setLayout(null);
        smnFrame.setLocationRelativeTo(null);
        smnFrame.setTitle("Search Members by Name");

        smnFrame.add(label);
        smnFrame.setVisible(true);
    }
}
