package GUI.MemberFrames.SearchMemberFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateLabel;
import GUI.AdditionalClasses.CreateSubmitButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchMemberByNameFrame implements ActionListener {

    JFrame smnFrame = new JFrame();
    CreateLabel label = new CreateLabel("Search Member by Name");
    CreateExitButton exitButton = new CreateExitButton();
    CreateSubmitButton submitButton = new CreateSubmitButton(350,270,"Search");
    JLabel nameLabel = new JLabel();
    JTextField nameTextField = new JTextField();
    CreateBackButton backButton = new CreateBackButton();

    SearchMemberByNameFrame(){
        smnFrame.setSize(800,600);
        smnFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        smnFrame.setLayout(null);
        smnFrame.setLocationRelativeTo(null);
        smnFrame.setTitle("Search Members by Name");

        nameLabel.setText("Enter Member Name : ");
        nameLabel.setBounds(10,150,200,100);
        nameLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));

        nameTextField.setBounds(10,220,760,30);
        nameTextField.setFont(new Font("Consolas",Font.BOLD,20));
        nameTextField.setForeground(Color.WHITE);
        nameTextField.setBackground(Color.BLACK);
        nameTextField.setCaretColor(Color.WHITE);

        backButton.addActionListener(this);

        smnFrame.add(submitButton);
        smnFrame.add(nameTextField);
        smnFrame.add(nameLabel);
        smnFrame.add(backButton);
        smnFrame.add(exitButton);
        smnFrame.add(label);
        smnFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            smnFrame.dispose();
            new SearchMemberFrame();
        }
    }
}
