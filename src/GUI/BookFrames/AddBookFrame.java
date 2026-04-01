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

        backButton.addActionListener(this);

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
