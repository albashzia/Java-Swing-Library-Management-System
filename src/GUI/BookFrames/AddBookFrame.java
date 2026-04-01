package GUI.BookFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookFrame implements ActionListener {
    
    JFrame abFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    JLabel idLabel = new JLabel();
    JLabel titleLabel = new JLabel();
    JLabel authorLabel = new JLabel();
    JLabel quantityLabel = new JLabel();

    JTextField idTextField = new JTextField();
    JTextField titleTextField = new JTextField();
    JTextField authorField = new JTextField();
    JTextField quantityTextField = new JTextField();

    CreateLabel label1 = new CreateLabel("Add a Book");

    AddBookFrame(){

        abFrame.setSize(800,600);
        abFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        abFrame.setLayout(null);
        abFrame.setLocationRelativeTo(null);
        abFrame.setTitle("Add Book");

        idLabel.setText("Enter Book ID : ");
        titleLabel.setText("Enter Book Title : ");
        authorLabel.setText("Enter Author Name : ");
        quantityLabel.setText("Enter Total Quantity : ");

        idLabel.setBounds(100,120,150,100);
        titleLabel.setBounds(100,170,150,100);
        authorLabel.setBounds(100,220,150,100);
        quantityLabel.setBounds(100,270,150,100);

        backButton.addActionListener(this);

        abFrame.add(idLabel);
        abFrame.add(titleLabel);
        abFrame.add(authorLabel);
        abFrame.add(quantityLabel);
        abFrame.add(exitButton);
        abFrame.add(label1);
        abFrame.add(backButton);
        abFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        abFrame.dispose();
        new BooksHomeFrame();
    }
}
