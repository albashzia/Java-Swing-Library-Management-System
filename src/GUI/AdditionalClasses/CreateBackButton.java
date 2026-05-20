package GUI.AdditionalClasses;

import javax.swing.*;

public class CreateBackButton extends JButton {
    public CreateBackButton() {
        this.setLocation(30, 30);
        this.setSize(80, 40);
        this.setText("Back");
        this.setFocusable(false);
    }
}
