package GUI.BookFrames;

import javax.swing.*;

public class SearchBookByTitleFrame {
    JFrame sbtFrame = new JFrame();

    public SearchBookByTitleFrame(){

        sbtFrame.setSize(800,600);
        sbtFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbtFrame.setLayout(null);
        sbtFrame.setLocationRelativeTo(null);
        sbtFrame.setTitle("Search Book By Title");

        sbtFrame.setVisible(true);
    }
}
