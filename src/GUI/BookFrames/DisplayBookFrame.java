package GUI.BookFrames;

import Code.ArrayListsManager;
import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DisplayBookFrame implements ActionListener {

    JFrame dbFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Display a Book");

    ArrayListsManager manager = ArrayListsManager.instance;


    DisplayBookFrame(){

        dbFrame.setSize(800,600);
        dbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dbFrame.setLayout(null);
        dbFrame.setLocationRelativeTo(null);
        dbFrame.setTitle("Display Book");

        String[] columns = {"Books Id", "Books Name", "Author Name", "Quantity"};

        ArrayList<Integer> ids = manager.fetchIdsData();
        ArrayList<String> titles = manager.fetchTitlesData();
        ArrayList<String> authors = manager.fetchAuthorsData();
        ArrayList<Integer> quantities = manager.fetchQuantityData();

        String[][] data = new String[ids.size()][4];
        for (int i = 0; i < ids.size();i++){
            data[i][0] = Integer.toString((ids.get(i)));
            data[i][1] = titles.get(i);
            data[i][2] = authors.get(i);
            data[i][3] = Integer.toString((quantities.get(i)));
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
