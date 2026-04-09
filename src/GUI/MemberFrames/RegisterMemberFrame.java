package GUI.MemberFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterMemberFrame implements ActionListener {
    JFrame rmFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Register a Member");

    JLabel idLabel = new JLabel();
    JLabel nameLabel = new JLabel();
    JLabel phoneLabel = new JLabel();
    JLabel emailLabel = new JLabel();

    JTextField idTextField = new JTextField();
    JTextField nameTextField = new JTextField();
    JTextField phoneTextField = new JTextField();
    JTextField emailTextField = new JTextField();

    RegisterMemberFrame(){

        rmFrame.setSize(800,600);
        rmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rmFrame.setLayout(null);
        rmFrame.setLocationRelativeTo(null);
        rmFrame.setTitle("Register a Member");

        idLabel.setText("Enter Member ID : ");
        nameLabel.setText("Enter Member Name : ");
        phoneLabel.setText("Enter Phone Number : ");
        emailLabel.setText("Enter Member Email : ");

        idLabel.setBounds(100,120,200,100);
        nameLabel.setBounds(100,170,200,100);
        phoneLabel.setBounds(100,220,250,100);
        emailLabel.setBounds(100,270,200,100);

        idLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));
        nameLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));
        phoneLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));
        emailLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));

        backButton.addActionListener(this);

        rmFrame.add(idLabel);
        rmFrame.add(nameLabel);
        rmFrame.add(phoneLabel);
        rmFrame.add(emailLabel);
        rmFrame.add(exitButton);
        rmFrame.add(label1);
        rmFrame.add(backButton);
        rmFrame.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        rmFrame.dispose();
        new MembersHomeFrame();
    }
}
