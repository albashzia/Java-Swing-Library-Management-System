package GUI.AdditionalClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateExitButton extends JButton implements ActionListener {
    public CreateExitButton(){
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setBounds(650,470,100,50);
        this.setText("Exit");
        this.setFocusable(false);
        this.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==this){
            System.exit(0);
        }
    }
}
