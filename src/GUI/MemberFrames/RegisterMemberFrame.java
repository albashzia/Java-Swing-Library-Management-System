package GUI.MemberFrames;

import Code.ArrayListsManager;
import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;
import GUI.CreateSubmitButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterMemberFrame implements ActionListener {
    JFrame rmFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Register a Member");
    CreateSubmitButton submitButton = new CreateSubmitButton(350,360,100,50,"Register");

    ArrayListsManager manager = ArrayListsManager.instance;

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

        idTextField.setBounds(270,160,100,30);
        nameTextField.setBounds(300,210,300,30);
        phoneTextField.setBounds(300,260,300,30);
        emailTextField.setBounds(300,310,300,30);

        idTextField.setFont(new Font("Consolas",Font.BOLD,20));
        idTextField.setForeground(Color.WHITE);
        idTextField.setBackground(Color.BLACK);
        idTextField.setCaretColor(Color.WHITE);

        nameTextField.setFont(new Font("Consolas",Font.BOLD,20));
        nameTextField.setForeground(Color.WHITE);
        nameTextField.setBackground(Color.BLACK);
        nameTextField.setCaretColor(Color.WHITE);

        phoneTextField.setFont(new Font("Consolas",Font.BOLD,20));
        phoneTextField.setForeground(Color.WHITE);
        phoneTextField.setBackground(Color.BLACK);
        phoneTextField.setCaretColor(Color.WHITE);

        emailTextField.setFont(new Font("Consolas",Font.BOLD,20));
        emailTextField.setForeground(Color.WHITE);
        emailTextField.setBackground(Color.BLACK);
        emailTextField.setCaretColor(Color.WHITE);
        
        backButton.addActionListener(this);

        rmFrame.add(submitButton);
        rmFrame.add(idTextField);
        rmFrame.add(nameTextField);
        rmFrame.add(phoneTextField);
        rmFrame.add(emailTextField);
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
        if(e.getSource()==backButton){
            rmFrame.dispose();
            new MembersHomeFrame();
        }

        if (e.getSource() == submitButton){
            int id = Integer.parseInt(idTextField.getText());
            String name = nameTextField.getText();
            String number = phoneTextField.getText();
            String email = emailTextField.getText();

            manager.addMember(id,name, number, email);
        }
    }
}
