import javax.swing.*;
import java.awt.*;

public class HomeFrame {

    JFrame homeFrame = new JFrame();
    JLabel label1 = new JLabel();

    HomeFrame(){

        homeFrame.setSize(800,600);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setLayout(null);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setTitle("Library Management System");

        label1.setLocation(100,30);
        label1.setSize(600,70);
        label1.setBackground(Color.BLACK);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setText("Library Management System");
        label1.setFont(new Font("Comic Sans",Font.ITALIC,35));
        label1.setForeground(Color.WHITE);
        label1.setOpaque(true);

        homeFrame.add(label1);
        homeFrame.setVisible(true);
    }
}
