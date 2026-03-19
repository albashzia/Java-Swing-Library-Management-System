import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MembersHomeFrame implements ActionListener {
    JFrame mhFrame = new JFrame();
    JButton backButton = new JButton();
    JLabel label1 = new JLabel();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();

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

        label1.setLocation(150,30);
        label1.setSize(500,70);
        label1.setBackground(Color.BLACK);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setText("Membership Management");
        label1.setFont(new Font("Comic Sans",Font.ITALIC,35));
        label1.setForeground(Color.WHITE);
        label1.setOpaque(true);

        mhFrame.add(label1);
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
