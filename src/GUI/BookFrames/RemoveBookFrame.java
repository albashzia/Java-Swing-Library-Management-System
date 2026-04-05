package GUI.BookFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;
import GUI.CreateSubmitButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveBookFrame implements ActionListener {

    JFrame rbFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    JLabel idLabel = new JLabel();
    CreateSubmitButton submitButton = new CreateSubmitButton(320,300,160,50,"Remove Book");
    JTextField idTextField = new JTextField();
    CreateLabel label1 = new CreateLabel("Remove a Book");

    RemoveBookFrame(){

        rbFrame.setSize(800,600);
        rbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rbFrame.setLayout(null);
        rbFrame.setLocationRelativeTo(null);
        rbFrame.setTitle("Remove Book");

        idLabel.setText("Enter book id : ");
        idLabel.setBounds(130,200,200,40);
        idLabel.setFont(new Font("Comic Sans",Font.PLAIN,25));

        idTextField.setBounds(350,200,100,40);
        idTextField.setFont(new Font("Comic",Font.BOLD,20));
        idTextField.setForeground(Color.WHITE);
        idTextField.setBackground(Color.BLACK);
        idTextField.setCaretColor(Color.WHITE);

        backButton.addActionListener(this);

        rbFrame.add(submitButton);
        rbFrame.add(idLabel);
        rbFrame.add(idTextField);
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
