import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookFrame implements ActionListener {

    JFrame sbFrame = new JFrame();
    JButton backButton = new JButton();
    JLabel label1 = new JLabel();

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

        label1.setLocation(200,30);
        label1.setSize(400,70);
        label1.setBackground(Color.BLACK);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setText("Add a Book");
        label1.setFont(new Font("Comic Sans",Font.ITALIC,35));
        label1.setForeground(Color.WHITE);
        label1.setOpaque(true);

        sbFrame.add(label1);
        sbFrame.add(backButton);
        sbFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        sbFrame.dispose();
        new BooksHomeFrame();
    }
}
