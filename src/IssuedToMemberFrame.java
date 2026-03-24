import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IssuedToMemberFrame implements ActionListener {
    JFrame itmFrame = new JFrame();
    JButton backButton = new JButton();

    IssuedToMemberFrame(){

        itmFrame.setSize(800,600);
        itmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        itmFrame.setLayout(null);
        itmFrame.setLocationRelativeTo(null);
        itmFrame.setTitle("Book Issued to Member");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        itmFrame.add(backButton);
        itmFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        itmFrame.dispose();
        new MembersHomeFrame();
    }
}
