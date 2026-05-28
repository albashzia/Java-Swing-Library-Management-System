package GUI.AdditionalClasses;

import javax.swing.*;
import java.awt.*;

public class CreateBackButton extends JButton {
    public CreateBackButton() {
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setLocation(50, 470);
        this.setSize(100, 50);
        this.setText("Back");
        this.setFocusable(false);
    }
}
