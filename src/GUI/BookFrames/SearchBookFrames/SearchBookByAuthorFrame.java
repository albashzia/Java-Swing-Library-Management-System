package GUI.BookFrames.SearchBookFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookByAuthorFrame implements ActionListener {
    JFrame sbaFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    JLabel authorLabel = new JLabel();
    JTextField authorTextField = new JTextField();
    CreateLabel label = new CreateLabel("Search Book By Author");

    public SearchBookByAuthorFrame(){

        sbaFrame.setSize(800,600);
        sbaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbaFrame.setLayout(null);
        sbaFrame.setLocationRelativeTo(null);
        sbaFrame.setTitle("Search Book By Author");

        authorLabel.setText("Enter author name : ");
        authorLabel.setBounds(130,200,250,40);
        authorLabel.setFont(new Font("Comic Sans",Font.PLAIN,25));

        authorTextField.setBounds(350,200,300,40);
        authorTextField.setFont(new Font("Comic",Font.BOLD,20));
        authorTextField.setForeground(Color.WHITE);
        authorTextField.setBackground(Color.BLACK);
        authorTextField.setCaretColor(Color.WHITE);

        backButton.addActionListener(this);

        sbaFrame.add(authorTextField);
        sbaFrame.add(authorLabel);
        sbaFrame.add(exitButton);
        sbaFrame.add(backButton);
        sbaFrame.add(label);
        sbaFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            sbaFrame.dispose();
            new SearchBookFrame();
        }
    }
}
