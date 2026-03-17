import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MembersHomeFrame implements ActionListener {
    JFrame mhFrame = new JFrame();
    JButton backButton = new JButton();

    MembersHomeFrame(){
        mhFrame.setSize(800,600);
        mhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mhFrame.setLayout(null);
        mhFrame.setLocationRelativeTo(null);
        mhFrame.setTitle("Membership Management");

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(this);
        
        mhFrame.add(backButton);
        mhFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            mhFrame.dispose();
            new HomeFrame();
        }
    }
}
