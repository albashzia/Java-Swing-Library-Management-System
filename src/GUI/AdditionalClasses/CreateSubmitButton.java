package GUI.AdditionalClasses;

import javax.swing.*;
import java.awt.*;

public class CreateSubmitButton extends JButton {
    public CreateSubmitButton(String text){
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setBounds(350,330,100,50);
        this.setText(text);
        this.setFocusable(false);
    }

    public CreateSubmitButton(int x, int y, String text){
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setBounds(x,y,100,50);
        this.setText(text);
        this.setFocusable(false);
    }

    public CreateSubmitButton(int x, int y, int width, int height,  String text){
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setBounds(x,y,width,height);
        this.setText(text);
        this.setFocusable(false);
    }

}
