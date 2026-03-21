import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookFrame implements ActionListener {

    JFrame sbFrame = new JFrame();
    JButton backButton = new JButton();
    SearchBookFrame(){

        sbFrame.setSize(800,600);
        sbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbFrame.setLayout(null);
        sbFrame.setLocationRelativeTo(null);
        sbFrame.setTitle("Search Book");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        sbFrame.add(backButton);
        sbFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        sbFrame.dispose();
        new BooksHomeFrame();
    }
}
