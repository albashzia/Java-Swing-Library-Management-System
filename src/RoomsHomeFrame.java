import javax.swing.*;

public class RoomsHomeFrame {
    
    JFrame srhFrame = new JFrame();
    JButton backButton = new JButton();

    RoomsHomeFrame(){
        srhFrame.setSize(800,600);
        srhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        srhFrame.setLayout(null);
        srhFrame.setLocationRelativeTo(null);
        srhFrame.setTitle("Study Room Management");

        srhFrame.setVisible(true);
    }
}
