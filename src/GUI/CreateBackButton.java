package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateBackButton extends JButton {
    public CreateBackButton() {
        this.setLocation(30, 30);
        this.setSize(80, 40);
        this.setText("Back");
        this.setFocusable(false);
    }
}
