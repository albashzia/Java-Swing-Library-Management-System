package GUI.BookFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;

import javax.swing.*;

public class SearchBookByTitleFrame {
    JFrame sbtFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateLabel label = new CreateLabel("Search Book By Title");
    public SearchBookByTitleFrame(){

        sbtFrame.setSize(800,600);
        sbtFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbtFrame.setLayout(null);
        sbtFrame.setLocationRelativeTo(null);
        sbtFrame.setTitle("Search Book By Title");

        sbtFrame.add(backButton);
        sbtFrame.setVisible(true);
    }
}
