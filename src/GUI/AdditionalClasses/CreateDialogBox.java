package GUI.AdditionalClasses;

import javax.swing.*;

public class CreateDialogBox extends JDialog {

    public CreateDialogBox(String title, String text){
        this.setTitle(title);
        JLabel message = new JLabel(text);
        this.add(message);
        this.setVisible(true);
    }
}
