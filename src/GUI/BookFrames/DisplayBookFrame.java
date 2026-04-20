package GUI.BookFrames;

import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayBookFrame implements ActionListener {

    JFrame dbFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Display a Book");

    JLabel header1 = new JLabel("Book ID");
    JLabel header2 = new JLabel("Book Name");
    JLabel header3 = new JLabel("Author Name");
    JLabel header4 = new JLabel("Quantity");

    JTable table = new JTable();
    JScrollPane scrollPane = new JScrollPane();

    DisplayBookFrame(){

        dbFrame.setSize(800,600);
        dbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dbFrame.setLayout(null);
        dbFrame.setLocationRelativeTo(null);
        dbFrame.setTitle("Display Book");

        header1.setBounds(50,120,100,100);
        header2.setBounds(150,120,200,100);
        header3.setBounds(350,120,200,100);
        header4.setBounds(550,120,1500,100);

        header1.setFont(new Font("Romans",Font.BOLD,20));
        header2.setFont(new Font("Romans",Font.BOLD,20));
        header3.setFont(new Font("Romans",Font.BOLD,20));
        header4.setFont(new Font("Romans",Font.BOLD,20));

        backButton.addActionListener(this);

        dbFrame.add(header1);
        dbFrame.add(header2);
        dbFrame.add(header3);
        dbFrame.add(header4);

        dbFrame.add(exitButton);
        dbFrame.add(label1);
        dbFrame.add(backButton);
        dbFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        dbFrame.dispose();
        new BooksHomeFrame();
    }
}
