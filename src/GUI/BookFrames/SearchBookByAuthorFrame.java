package GUI.BookFrames;

import GUI.CreateBackButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookByAuthorFrame implements ActionListener {
    JFrame sbaFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateLabel label = new CreateLabel("Search Book By Author");

    public SearchBookByAuthorFrame(){

        sbaFrame.setSize(800,600);
        sbaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbaFrame.setLayout(null);
        sbaFrame.setLocationRelativeTo(null);
        sbaFrame.setTitle("Search Book By Author");

        sbaFrame.add(backButton);
        sbaFrame.add(label);
        sbaFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
