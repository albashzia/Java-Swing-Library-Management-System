package GUI.BookFrames.SearchBookFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookByTitleFrame implements ActionListener {
    JFrame sbtFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label = new CreateLabel("Search Book By Title");
    JLabel titleLabel = new JLabel();
    JTextField titleTextField = new JTextField();

    public SearchBookByTitleFrame(){

        sbtFrame.setSize(800,600);
        sbtFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbtFrame.setLayout(null);
        sbtFrame.setLocationRelativeTo(null);
        sbtFrame.setTitle("Search Book By Title");

        titleLabel.setText("Enter author name : ");
        titleLabel.setBounds(130,200,200,40);
        titleLabel.setFont(new Font("Comic Sans",Font.PLAIN,25));
        
        backButton.addActionListener(this);

        sbtFrame.add(exitButton);
        sbtFrame.add(label);
        sbtFrame.add(backButton);
        sbtFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        sbtFrame.dispose();
        new SearchBookFrame();
    }
}
