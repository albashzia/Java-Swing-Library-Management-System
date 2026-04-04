package GUI;

import javax.swing.*;

public class CreateSubmitButton extends JButton {
    CreateSubmitButton(String text){
        this.setBounds(350,330,100,50);
        this.setText(text);
        this.setFocusable(false);
    }

    CreateSubmitButton(int x, int y, String text){
        this.setBounds(x,y,100,50);
        this.setText(text);
        this.setFocusable(false);
    }

    CreateSubmitButton(int len, int wid, int x, int y, String text){

    }

}
