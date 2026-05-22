package GUI.BookFrames;

import Code.ArrayListsManager;
import Code.Book;
import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DisplayBookFrame implements ActionListener {

    JFrame dbFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Display Books");

    ArrayListsManager manager = ArrayListsManager.instance;


    DisplayBookFrame(){

        dbFrame.setSize(800,600);
        dbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dbFrame.setLayout(null);
        dbFrame.setLocationRelativeTo(null);
        dbFrame.setTitle("Display Book");

        String[] columns = {"Books Id", "Books Name", "Author Name", "Quantity"};

        ArrayList<Book> books = manager.returnBooksArrayList();

        String[][] data = new String[books.size()][4];
        for (int i = 0; i < books.size();i++){
            data[i][0] = books.get(i).getId();
            data[i][1] = books.get(i).getBookTitle();
            data[i][2] = books.get(i).getBookAuthor();
            data[i][3] = Integer.toString((books.get(i).getQuantity()));
        }

        JTable table = new JTable(data,columns);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50,150,700,300);

        backButton.addActionListener(this);

        dbFrame.add(scrollPane);

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
