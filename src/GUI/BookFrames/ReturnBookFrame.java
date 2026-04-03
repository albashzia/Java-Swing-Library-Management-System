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

        memberIdLabel.setText("Enter member id : ");
        memberIdLabel.setBounds(130,220,250,40);
        memberIdLabel.setFont(new Font("Comic Sans",Font.PLAIN,25));

        memberIdTextField.setBounds(350,220,100,40);
        memberIdTextField.setFont(new Font("Comic",Font.BOLD,20));
        memberIdTextField.setForeground(Color.WHITE);
        memberIdTextField.setBackground(Color.BLACK);
        memberIdTextField.setCaretColor(Color.WHITE);

        backButton.addActionListener(this);

        rbFrame.add(idLabel);
        rbFrame.add(idTextField);
        rbFrame.add(memberIdLabel);
        rbFrame.add(memberIdTextField);
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
