package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateLabel;
import GUI.AdditionalClasses.CreateSubmitButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IssueBookFrame implements ActionListener {

    JFrame ibFrame = new JFrame();

    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateSubmitButton submitButton = new CreateSubmitButton(350,290,"Issue");
    CreateLabel label1 = new CreateLabel("Issue a Book");

    JLabel idLabel = new JLabel();
    JLabel memberIdLabel = new JLabel();

    JTextField idTextField = new JTextField();
    JTextField memberIdTextField = new JTextField();

    IssueBookFrame(){

        ibFrame.setSize(800,600);
        ibFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ibFrame.setLayout(null);
        ibFrame.setLocationRelativeTo(null);
        ibFrame.setTitle("Issue Book");

        idLabel.setText("Enter book id : ");
        idLabel.setBounds(10,80,200,100);
        idLabel.setFont(new Font("Comic Sans",Font.PLAIN,25));
        backButton.addActionListener(this);

        idTextField.setBounds(10,150,760,30);
        idTextField.setFont(new Font("Comic",Font.BOLD,20));
        idTextField.setForeground(Color.WHITE);
        idTextField.setBackground(Color.BLACK);
        idTextField.setCaretColor(Color.WHITE);

        memberIdLabel.setText("Enter member id : ");
        memberIdLabel.setBounds(130,220,250,40);
        memberIdLabel.setFont(new Font("Comic Sans",Font.PLAIN,25));

        memberIdTextField.setBounds(350,220,100,40);
        memberIdTextField.setFont(new Font("Comic",Font.BOLD,20));
        memberIdTextField.setForeground(Color.WHITE);
        memberIdTextField.setBackground(Color.BLACK);
        memberIdTextField.setCaretColor(Color.WHITE);


        ibFrame.add(label1);

        ibFrame.add(idLabel);
        ibFrame.add(idTextField);

        ibFrame.add(memberIdLabel);
        ibFrame.add(memberIdTextField);

        ibFrame.add(submitButton);
        ibFrame.add(exitButton);
        ibFrame.add(backButton);

        ibFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        ibFrame.dispose();
        new BooksHomeFrame();
    }
}
