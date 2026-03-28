package GUI;

import javax.swing.*;

public class CreateBackButton extends JButton {
    CreateBackButton() {
        this.setLocation(30, 30);
        this.setSize(80, 40);
        this.setText("Back");
        this.setFocusable(false);
    }
}
