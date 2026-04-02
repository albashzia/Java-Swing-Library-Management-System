package GUI.BookFrames.SearchBookFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
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

        backButton.addActionListener(this);

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
