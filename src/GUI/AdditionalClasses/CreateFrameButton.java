package GUI.AdditionalClasses;

import javax.swing.*;
import java.awt.*;

public class CreateFrameButton extends JButton {

    CreateFrameButton(String text,int x, int y){
        this.setText(text);
        this.setSize(200,80);
        this.setLocation(x,y);
        this.setFocusable(false);
        this.setFont(new Font("Canvas",Font.BOLD,20));
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
    }
}
