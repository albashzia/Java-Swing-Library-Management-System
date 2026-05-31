package GUI.AdditionalClasses;

import javax.swing.*;

public class CreateDialogBox extends JDialog {

    public CreateDialogBox(String title, String text){
        this.setTitle(title);
        JTextField message = new JTextField(text);
        this.add(message);
    }
}
