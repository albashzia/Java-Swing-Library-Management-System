import javax.swing.*;

public class BooksHomeFrame {
    JFrame bhFrame = new JFrame();
    JButton backButton = new JButton();

    BooksHomeFrame(){
        bhFrame.setSize(800,600);
        bhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bhFrame.setLayout(null);
        bhFrame.setLocationRelativeTo(null);
        bhFrame.setTitle("Books Management");

        bhFrame.setVisible(true);
    }
}
