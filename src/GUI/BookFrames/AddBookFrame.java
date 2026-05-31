package GUI.BookFrames;

import Code.ArrayListsManager;
import Code.Book;
import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookFrame implements ActionListener {
    
    JFrame abFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateSubmitButton submitButton = new CreateSubmitButton(350,400,"Add Book");

    JLabel idLabel = new JLabel();
    JLabel titleLabel = new JLabel();
    JLabel authorLabel = new JLabel();
    JLabel quantityLabel = new JLabel();

    JTextField idTextField = new JTextField();
    JTextField titleTextField = new JTextField();
    JTextField authorTextField = new JTextField();
    JTextField quantityTextField = new JTextField();

    ArrayListsManager manager = ArrayListsManager.instance;

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

        idLabel.setBounds(10,80,200,100);
        titleLabel.setBounds(10,150,200,100);
        authorLabel.setBounds(10,220,200,100);
        quantityLabel.setBounds(10,290,200,100);

        idLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));
        titleLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));
        authorLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));
        quantityLabel.setFont(new Font("Cosmic Sans",Font.PLAIN,20));

        idTextField.setBounds(10,150,760,30);
        titleTextField.setBounds(10,220,760,30);
        authorTextField.setBounds(10,290,760,30);
        quantityTextField.setBounds(10,360,760,30);

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
            String id = idTextField.getText();
            String name = titleTextField.getText();
            String author = authorTextField.getText();
            int quantity = Integer.parseInt(quantityTextField.getText());
            Book book = new Book(id,name,author,quantity);
            manager.addBook(book);
            CreateDialogBox dialogBox = new CreateDialogBox("Success", "Book Added Successfully");
        }
    }
}
