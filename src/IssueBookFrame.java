import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IssueBookFrame implements ActionListener {

    JFrame ibFrame = new JFrame();
    JButton backButton = new JButton();

    IssueBookFrame(){

        ibFrame.setSize(800,600);
        ibFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ibFrame.setLayout(null);
        ibFrame.setLocationRelativeTo(null);
        ibFrame.setTitle("Issue Book");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        ibFrame.add(backButton);
        ibFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        ibFrame.dispose();
        new BooksHomeFrame();
    }
}
