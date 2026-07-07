package GUI.BookFrames.SearchBookFrames;

import Code.Book;
import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateLabel;
import GUI.AdditionalClasses.CreateSubmitButton;
import Service.BooksService;

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
    CreateSubmitButton submitButton = new CreateSubmitButton(350,200,"Search");
    BooksService service = new BooksService();

    public SearchBookByIdFrame(){

        sbiFrame.setSize(800,600);
        sbiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbiFrame.setLayout(null);
        sbiFrame.setLocationRelativeTo(null);
        sbiFrame.setTitle("Search Book By ID");

        idLabel.setText("Enter book id : ");
        idLabel.setBounds(10,80,200,100);
        idLabel.setFont(new Font("Comic Sans",Font.PLAIN,25));

        idTextField.setBounds(10,150,760,30);
        idTextField.setFont(new Font("Comic",Font.BOLD,20));
        idTextField.setForeground(Color.WHITE);
        idTextField.setBackground(Color.BLACK);
        idTextField.setCaretColor(Color.WHITE);

        backButton.addActionListener(this);
        submitButton.addActionListener(this);

        sbiFrame.add(submitButton);
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

        if(e.getSource()==submitButton){
            String id = idTextField.getText();
            Book searchedBook = service.searchBookById(id);
            if (searchedBook!=null){
                String bookId = searchedBook.getId();
                String bookTitle = searchedBook.getBookTitle();
                String bookAuthor = searchedBook.getBookAuthor();
                int bookQuantity = searchedBook.getQuantity();
                JLabel bookDisplayLabel = new JLabel();
                bookDisplayLabel.setBounds(20,250,400,300);
                bookDisplayLabel.setFont(new Font("Cosmic",Font.PLAIN,20));
                bookDisplayLabel.setText(
                        "<html>" +
                                "ID: " + bookId + "<br>" +
                                "Title: " + bookTitle + "<br>" +
                                "Author: " + bookAuthor + "<br>" +
                                "Quantity: " + bookQuantity +
                                "</html>"
                );
                sbiFrame.add(bookDisplayLabel);
                sbiFrame.revalidate();
                sbiFrame.repaint();
            }
        }
    }
}
