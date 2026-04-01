package GUI.BookFrames.SearchBookFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookByIdFrame implements ActionListener {
    JFrame sbiFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    JLabel idLabel = new JLabel();
    JTextField idTextField = new JTextField();
    CreateLabel label = new CreateLabel("Search Book by ID");
    
    public SearchBookByIdFrame(){

        sbiFrame.setSize(800,600);
        sbiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbiFrame.setLayout(null);
        sbiFrame.setLocationRelativeTo(null);
        sbiFrame.setTitle("Search Book By ID");

        backButton.addActionListener(this);

        sbiFrame.add(exitButton);
        sbiFrame.add(backButton);
        sbiFrame.add(label);
        sbiFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==backButton){
            sbiFrame.dispose();
            new SearchBookFrame();
        }
    }
}
