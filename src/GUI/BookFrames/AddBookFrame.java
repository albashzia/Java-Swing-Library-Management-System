package GUI.BookFrames;

import Code.ArrayListsManager;
import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;
import GUI.CreateSubmitButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookFrame implements ActionListener {
    
    JFrame abFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateSubmitButton submitButton = new CreateSubmitButton(350,350,"Add Book");

    JLabel idLabel = new JLabel();
    JLabel titleLabel = new JLabel();
    JLabel authorLabel = new JLabel();
    JLabel quantityLabel = new JLabel();

    JTextField idTextField = new JTextField();
    JTextField titleTextField = new JTextField();
    JTextField authorTextField = new JTextField();
    JTextField quantityTextField = new JTextField();

    ArrayListsManager manager = new ArrayListsManager();

    CreateLabel label1 = new CreateLabel("Add a Book");

    AddBookFrame(){

        abFrame.setSize(800,600);
        abFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        abFrame.setLayout(null);
        abFrame.setLocationRelativeTo(null);
        abFrame.setTitle("Add Book");

        idLabel.setText("Enter Book ID : ");
        titleLabel.setText("Enter Book Title : ");
        authorLabel.setText("Enter Author Name : ");
        quantityLabel.setText("Enter Total Quantity : ");

        idLabel.setBounds(100,120,200,100);
        titleLabel.setBounds(100,170,200,100);
        authorLabel.setBounds(100,220,200,100);
        quantityLabel.setBounds(100,270,200,100);

        idLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));
        titleLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));
        authorLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));
        quantityLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));

        idTextField.setBounds(270,160,100,30);
        titleTextField.setBounds(300,210,300,30);
        authorTextField.setBounds(300,260,300,30);
        quantityTextField.setBounds(300,310,100,30);

        idTextField.setFont(new Font("Consolas",Font.BOLD,20));
        idTextField.setForeground(Color.WHITE);
        idTextField.setBackground(Color.BLACK);
        idTextField.setCaretColor(Color.WHITE);

        titleTextField.setFont(new Font("Consolas",Font.BOLD,20));
        titleTextField.setForeground(Color.WHITE);
        titleTextField.setBackground(Color.BLACK);
        titleTextField.setCaretColor(Color.WHITE);
        
        authorTextField.setFont(new Font("Consolas",Font.BOLD,20));
        authorTextField.setForeground(Color.WHITE);
        authorTextField.setBackground(Color.BLACK);
        authorTextField.setCaretColor(Color.WHITE);

        quantityTextField.setFont(new Font("Consolas",Font.BOLD,20));
        quantityTextField.setForeground(Color.WHITE);
        quantityTextField.setBackground(Color.BLACK);
        quantityTextField.setCaretColor(Color.WHITE);
        

        submitButton.addActionListener(this);
        backButton.addActionListener(this);

        abFrame.add(submitButton);
        abFrame.add(idTextField);
        abFrame.add(titleTextField);
        abFrame.add(authorTextField);
        abFrame.add(quantityTextField);

        abFrame.add(idLabel);
        abFrame.add(titleLabel);
        abFrame.add(authorLabel);
        abFrame.add(quantityLabel);

        abFrame.add(exitButton);

        abFrame.add(label1);

        abFrame.add(backButton);

        abFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            abFrame.dispose();
            new BooksHomeFrame();
        }

        if (e.getSource()==submitButton){
            int id = Integer.parseInt(idTextField.getText());
            String name = titleTextField.getText();
            String author = authorTextField.getText();
            int quantity = Integer.parseInt(quantityTextField.getText());
            manager.addBook(id,name,author,quantity);

            manager.displayAddedBooks();
        }
    }
}
