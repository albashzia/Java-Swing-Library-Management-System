import javax.swing.*;

public class HomeFrame {

    JFrame homeFrame = new JFrame();
    JLabel label1 = new JLabel();

    HomeFrame(){

        homeFrame.setSize(800,600);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setLayout(null);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setTitle("Library Management System");
        homeFrame.setVisible(true);
    }
}
