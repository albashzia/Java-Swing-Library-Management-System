package GUI.BookFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;

import javax.swing.*;

public class SearchBookByIdFrame {
    JFrame sbiFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateLabel label = new CreateLabel("Search Book by ID");
    
    public SearchBookByIdFrame(){

        sbiFrame.setSize(800,600);
        sbiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbiFrame.setLayout(null);
        sbiFrame.setLocationRelativeTo(null);
        sbiFrame.setTitle("Search Book By ID");


        sbiFrame.setVisible(true);
    }
}
