import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BooksHomeFrame implements ActionListener {
    JFrame bhFrame = new JFrame();
    JButton backButton = new JButton();

    BooksHomeFrame(){
        bhFrame.setSize(800,600);
        bhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bhFrame.setLayout(null);
        bhFrame.setLocationRelativeTo(null);
        bhFrame.setTitle("Books Management");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);

        bhFrame.add(backButton);
        bhFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
