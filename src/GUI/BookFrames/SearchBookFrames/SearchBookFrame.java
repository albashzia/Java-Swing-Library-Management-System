package GUI.BookFrames.SearchBookFrames;

import GUI.AdditionalClasses.CreateFrameButton;
import GUI.BookFrames.BooksHomeFrame;
import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookFrame implements ActionListener {

    JFrame sbFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    CreateFrameButton button1 = new CreateFrameButton("Use Book ID",100,200);
    CreateFrameButton button2 = new CreateFrameButton("Use Book Title",320,200);
    CreateFrameButton button3 = new CreateFrameButton("Use Author Name",540,200);
    CreateLabel label1 = new CreateLabel("Search a Book");

    public SearchBookFrame(){

        sbFrame.setSize(800,600);
        sbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbFrame.setLayout(null);
        sbFrame.setLocationRelativeTo(null);
        sbFrame.setTitle("Search Book");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        backButton.addActionListener(this);

        sbFrame.add(exitButton);
        sbFrame.add(button1);
        sbFrame.add(button2);
        sbFrame.add(button3);
        sbFrame.add(label1);
        sbFrame.add(backButton);
        sbFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            sbFrame.dispose();
            new BooksHomeFrame();
        }
        if (e.getSource()==button1){
            sbFrame.dispose();
            new SearchBookByIdFrame();
        }

        if (e.getSource()==button2){
            sbFrame.dispose();
            new SearchBookByTitleFrame();
        }

        if (e.getSource()==button3){
            sbFrame.dispose();
            new SearchBookByAuthorFrame();
        }
    }
}
