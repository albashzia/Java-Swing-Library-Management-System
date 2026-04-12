package GUI.MemberFrames.SearchMemberFrames;

import GUI.CreateLabel;

import javax.swing.*;

public class SearchMemberByIDFrame {

    JFrame smiFrame = new JFrame();
    CreateLabel label = new CreateLabel("Search Member by ID");

    SearchMemberByIDFrame(){
        smiFrame.setSize(800,600);
        smiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        smiFrame.setLayout(null);
        smiFrame.setLocationRelativeTo(null);
        smiFrame.setTitle("Search Members by ID");

        smiFrame.add(label);
        smiFrame.setVisible(true);
    }
}
