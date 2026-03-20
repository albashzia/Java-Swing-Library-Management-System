import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BooksHomeFrame implements ActionListener {
    JFrame bhFrame = new JFrame();
    JButton backButton = new JButton();
    JLabel label1 = new JLabel();

    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();

    BooksHomeFrame(){
        bhFrame.setSize(800,600);
        bhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bhFrame.setLayout(null);
        bhFrame.setLocationRelativeTo(null);
        bhFrame.setTitle("Books Management");

        label1.setLocation(200,30);
        label1.setSize(400,70);
        label1.setBackground(Color.BLACK);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setText("Books Management");
        label1.setFont(new Font("Comic Sans",Font.ITALIC,35));
        label1.setForeground(Color.WHITE);
        label1.setOpaque(true);

        backButton.setLocation(30,30);
        backButton.setSize(80,40);
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        button1.setBounds(120,130,200,50);
        button2.setBounds(120,190,200,50);
        button3.setBounds(120,250,200,50);
        button4.setBounds(120,310,200,50);
        button5.setBounds(120,370,200,50);
        button6.setBounds(120,430,200,50);
        button7.setBounds(120,490,200,50);

        button1.setText("Add Book");
        button2.setText("Remove Book");
        button3.setText("Search Book");
        button4.setText("Display Books");
        button5.setText("Issue Book");
        button6.setText("Return Book");
        button7.setText("Display Issued Books");

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);
        button5.setFocusable(false);
        button6.setFocusable(false);
        button7.setFocusable(false);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);

        bhFrame.add(button1);
        bhFrame.add(button2);
        bhFrame.add(button3);
        bhFrame.add(button4);
        bhFrame.add(button5);
        bhFrame.add(button6);
        bhFrame.add(button7);

        bhFrame.add(label1);
        bhFrame.add(backButton);
        bhFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            bhFrame.dispose();
            new HomeFrame();
        }
        if (e.getSource()==button1){
            bhFrame.dispose();
            new AddBookFrame();
        }
        if (e.getSource()==button2){
            bhFrame.dispose();
            new RemoveBookFrame();
        }
        if (e.getSource()==button3){
            bhFrame.dispose();
            new SearchBookFrame();
        }
        if (e.getSource()==button4){
            bhFrame.dispose();
            new DisplayBookFrame();
        }
        if (e.getSource()==button5){
            bhFrame.dispose();
            new IssueBookFrame();
        }
        if (e.getSource()==button6){
            bhFrame.dispose();
            new ReturnBookFrame();
        }
        if (e.getSource()==button7){
            bhFrame.dispose();
            new DisplayIssuedBooksFrame();
        }
    }
}
