package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrameButton;
import GUI.BookFrames.SearchBookFrames.SearchBookFrame;
import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateLabel;
import GUI.HomeFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BooksHomeFrame implements ActionListener {
    JFrame bhFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Books Management");

    CreateFrameButton button1 = new CreateFrameButton("Add Book",80,130);
    CreateFrameButton button2 = new CreateFrameButton("Remove Book",300,130);
    CreateFrameButton button3 = new CreateFrameButton("Search Book",520,130);
    CreateFrameButton button4 = new CreateFrameButton("Display Books",80,240);
    CreateFrameButton button5 = new CreateFrameButton("Issue Book",300,240);
    CreateFrameButton button6 = new CreateFrameButton("Return Book",520,240);
    CreateFrameButton button7 = new CreateFrameButton("All  Issued Books",300,350);

    public BooksHomeFrame(){
        bhFrame.setSize(800,600);
        bhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bhFrame.setLayout(null);
        bhFrame.setLocationRelativeTo(null);
        bhFrame.setTitle("Books Management");

        backButton.addActionListener(this);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);

        bhFrame.add(exitButton);
        bhFrame.add(button1);
        bhFrame.add(button2);
        bhFrame.add(button3);
        bhFrame.add(button4);
        bhFrame.add(button5);
        bhFrame.add(button6);
        bhFrame.add(button7);

        bhFrame.add(label1);
        bhFrame.add(backButton);
        bhFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            bhFrame.dispose();
            new HomeFrame();
        }
        if (e.getSource()==button1){
            bhFrame.dispose();
            new AddBookFrame();
        }
        if (e.getSource()==button2){
            bhFrame.dispose();
            new RemoveBookFrame();
        }
        if (e.getSource()==button3){
            bhFrame.dispose();
            new SearchBookFrame();
        }
        if (e.getSource()==button4){
            bhFrame.dispose();
            new DisplayBookFrame();
        }
        if (e.getSource()==button5){
            bhFrame.dispose();
            new IssueBookFrame();
        }
        if (e.getSource()==button6){
            bhFrame.dispose();
            new ReturnBookFrame();
        }
        if (e.getSource()==button7){
            bhFrame.dispose();
            new DisplayIssuedBooksFrame();
        }
    }
}
