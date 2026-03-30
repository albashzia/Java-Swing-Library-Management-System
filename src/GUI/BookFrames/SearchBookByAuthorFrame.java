package GUI.BookFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;

import javax.swing.*;

public class SearchBookByAuthorFrame {
    JFrame sbaFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();

    public SearchBookByAuthorFrame(){

        sbaFrame.setSize(800,600);
        sbaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbaFrame.setLayout(null);
        sbaFrame.setLocationRelativeTo(null);
        sbaFrame.setTitle("Search Book By Author");

        sbaFrame.add(backButton);
        sbaFrame.setVisible(true);
    }
}
