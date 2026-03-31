package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateExitButton extends JButton implements ActionListener {
    public CreateExitButton(){
        this.setBounds(100,100,10,10);
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
