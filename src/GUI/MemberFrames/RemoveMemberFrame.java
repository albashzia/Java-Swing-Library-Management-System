package GUI.MemberFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveMemberFrame implements ActionListener {
    JFrame rmFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Remove a Member");
    JLabel idLabel = new JLabel();
    JTextField idTextField = new JTextField();

    RemoveMemberFrame(){

        rmFrame.setSize(800,600);
        rmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rmFrame.setLayout(null);
        rmFrame.setLocationRelativeTo(null);
        rmFrame.setTitle("Remove Member");

        idLabel.setText("Enter Member ID : ");
        idLabel.setBounds(100,150,200,100);
        idLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));

        idTextField.setBounds(270,190,100,30);
        idTextField.setFont(new Font("Consolas",Font.BOLD,20));
        idTextField.setForeground(Color.WHITE);
        idTextField.setBackground(Color.BLACK);
        idTextField.setCaretColor(Color.WHITE);

        backButton.addActionListener(this);

        rmFrame.add(idTextField);
        rmFrame.add(idLabel);
        rmFrame.add(exitButton);
        rmFrame.add(label1);
        rmFrame.add(backButton);
        rmFrame.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            rmFrame.dispose();
            new MembersHomeFrame();
        }
    }
}
