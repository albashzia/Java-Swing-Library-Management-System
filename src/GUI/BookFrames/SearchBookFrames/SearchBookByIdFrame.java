package GUI.BookFrames.SearchBookFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;
import GUI.CreateSubmitButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookByIdFrame implements ActionListener {
    JFrame sbiFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    JLabel idLabel = new JLabel();
    JTextField idTextField = new JTextField();
    CreateLabel label = new CreateLabel("Search Book by ID");
    CreateSubmitButton sb = new CreateSubmitButton(350,280,"Search");

    public SearchBookByIdFrame(){

        sbiFrame.setSize(800,600);
        sbiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbiFrame.setLayout(null);
        sbiFrame.setLocationRelativeTo(null);
        sbiFrame.setTitle("Search Book By ID");

        idLabel.setText("Enter book id : ");
        idLabel.setBounds(130,200,200,40);
        idLabel.setFont(new Font("Comic Sans",Font.PLAIN,25));

        idTextField.setBounds(350,200,100,40);
        idTextField.setFont(new Font("Comic",Font.BOLD,20));
        idTextField.setForeground(Color.WHITE);
        idTextField.setBackground(Color.BLACK);
        idTextField.setCaretColor(Color.WHITE);

        backButton.addActionListener(this);

        sbiFrame.add(sb);
        sbiFrame.add(idLabel);
        sbiFrame.add(idTextField);
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
