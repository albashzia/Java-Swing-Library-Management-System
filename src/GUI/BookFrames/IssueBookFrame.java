package GUI.BookFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IssueBookFrame implements ActionListener {

    JFrame ibFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    JLabel idLabel = new JLabel();
    JLabel memberIdLabel = new JLabel();
    JTextField idTextField = new JTextField();
    JTextField memberIdTextField = new JTextField();
    CreateLabel label1 = new CreateLabel("Issue a Book");

    IssueBookFrame(){

        ibFrame.setSize(800,600);
        ibFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ibFrame.setLayout(null);
        ibFrame.setLocationRelativeTo(null);
        ibFrame.setTitle("Issue Book");

        idLabel.setText("Enter book id : ");
        idLabel.setBounds(130,170,200,40);
        idLabel.setFont(new Font("Comic Sans",Font.PLAIN,25));
        backButton.addActionListener(this);

        ibFrame.add(idLabel);
        ibFrame.add(exitButton);
        ibFrame.add(label1);
        ibFrame.add(backButton);
        ibFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        ibFrame.dispose();
        new BooksHomeFrame();
    }
}
