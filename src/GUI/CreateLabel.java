package GUI;

import javax.swing.*;
import java.awt.*;

public class CreateLabel extends JLabel
{
    public CreateLabel(String title)
    {
        this.setLocation(200,30);
        this.setSize(400,70);
        this.setBackground(Color.BLACK);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setText(title);
        this.setFont(new Font("Comic Sans",Font.ITALIC,35));
        this.setForeground(Color.WHITE);
        this.setOpaque(true);
    }

    public CreateLabel(String title, int width)
    {
        this.setLocation(200,30);
        this.setSize(width,70);
        this.setBackground(Color.BLACK);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setText(title);
        this.setFont(new Font("Comic Sans",Font.ITALIC,35));
        this.setForeground(Color.WHITE);
        this.setOpaque(true);
    }
}
