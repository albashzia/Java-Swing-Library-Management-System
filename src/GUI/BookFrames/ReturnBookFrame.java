package GUI.BookFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReturnBookFrame implements ActionListener {

    JFrame rbFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    JLabel idLabel = new JLabel();
    JLabel memberIdLabel = new JLabel();
    JTextField idTextField = new JTextField();
    JTextField memberIdTextField = new JTextField();
    CreateLabel label1 = new CreateLabel("Return a Book");

    ReturnBookFrame(){

        rbFrame.setSize(800,600);
        rbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rbFrame.setLayout(null);
        rbFrame.setLocationRelativeTo(null);
        rbFrame.setTitle("Return Book");

        idLabel.setText("Enter book id : ");
        idLabel.setBounds(130,170,200,40);
        idLabel.setFont(new Font("Comic Sans",Font.PLAIN,25));

        idTextField.setBounds(350,170,100,40);
        idTextField.setFont(new Font("Comic",Font.BOLD,20));
        idTextField.setForeground(Color.WHITE);
        idTextField.setBackground(Color.BLACK);
        idTextField.setCaretColor(Color.WHITE);

        backButton.addActionListener(this);

        rbFrame.add(exitButton);
        rbFrame.add(label1);
        rbFrame.add(backButton);
        rbFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        rbFrame.dispose();
        new BooksHomeFrame();
    }
}
