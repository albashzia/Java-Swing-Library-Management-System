import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeFrame implements ActionListener {

    JFrame homeFrame = new JFrame();
    JLabel label1 = new JLabel();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();

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

        button1.setSize(240,50);
        button2.setSize(240,50);
        button3.setSize(240,50);

        button1.setLocation(100,160);
        button2.setLocation(100,240);
        button3.setLocation(100,320);

        button1.setText("Books Management");
        button2.setText("Membership Management");
        button3.setText("Study Room Management");
        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);

        button1.addActionListener(this);
        button2.addActionListener(this);

        homeFrame.add(button1);
        homeFrame.add(button2);
        homeFrame.add(button3);

        homeFrame.add(label1);

        homeFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){
            homeFrame.dispose();
            new BooksHomeFrame();
        }
        if(e.getSource()==button2){
            homeFrame.dispose();
            new MembersHomeFrame();
        }
        if (e.getSource()==button3){
            homeFrame.dispose();
            new RoomsHomeFrame();
        }
    }
}
