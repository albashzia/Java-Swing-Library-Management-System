package GUI;

import javax.swing.*;

public class CreateSubmitButton extends JButton {
    public CreateSubmitButton(String text){
        this.setBounds(350,330,100,50);
        this.setText(text);
        this.setFocusable(false);
    }

    public CreateSubmitButton(int x, int y, String text){
        this.setBounds(x,y,100,50);
        this.setText(text);
        this.setFocusable(false);
    }

    public CreateSubmitButton(int x, int y, int width, int height,  String text){
        this.setBounds(x,y,width,height);
        this.setText(text);
        this.setFocusable(false);
    }

}
