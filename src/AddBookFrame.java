import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookFrame implements ActionListener {
    
    JFrame abFrame = new JFrame();
    JButton backButton = new JButton();

    AddBookFrame(){

        abFrame.setSize(800,600);
        abFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        abFrame.setLayout(null);
        abFrame.setLocationRelativeTo(null);
        abFrame.setTitle("Add Book");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        abFrame.add(backButton);
        abFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        abFrame.dispose();
        new BooksHomeFrame();
    }
}
