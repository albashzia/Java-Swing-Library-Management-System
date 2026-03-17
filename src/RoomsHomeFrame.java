import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoomsHomeFrame implements ActionListener {
    
    JFrame srhFrame = new JFrame();
    JButton backButton = new JButton();

    RoomsHomeFrame(){
        srhFrame.setSize(800,600);
        srhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        srhFrame.setLayout(null);
        srhFrame.setLocationRelativeTo(null);
        srhFrame.setTitle("Study Room Management");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        srhFrame.add(backButton);
        srhFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            srhFrame.dispose();
            new HomeFrame();
        }
    }
}
