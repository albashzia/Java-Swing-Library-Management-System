import javax.swing.*;

public class SearchBookFrame {

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

        sbFrame.add(backButton);
        sbFrame.setVisible(true);
    }
}
