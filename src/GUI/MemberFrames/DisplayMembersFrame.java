package GUI.MemberFrames;

import Code.ArrayListsManager;
import Code.Member;
import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DisplayMembersFrame implements ActionListener {
    JFrame dmFrame = new JFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label1 = new CreateLabel("Display Members");

    ArrayListsManager manager = ArrayListsManager.instance;

    DisplayMembersFrame(){

        dmFrame.setSize(800,600);
        dmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dmFrame.setLayout(null);
        dmFrame.setLocationRelativeTo(null);
        dmFrame.setTitle("Display Members");

        String[] columns = {"Ids", "Names", "Phone Numbers", "Emails"};

        ArrayList<Member> memberArrayList = manager.returnMembersArrayList();

        String[][] data = new String[memberArrayList.size()][4];

        for (int i = 0; i < memberArrayList.size(); i++){
            data[i][0] = memberArrayList.get(i).getId();
            data[i][1] = memberArrayList.get(i).getName();
            data[i][2] = memberArrayList.get(i).getPhoneNumber();
            data[i][3] = memberArrayList.get(i).getEmail();
        }

        JTable table = new JTable(data,columns);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(100,150,600,300);

        backButton.addActionListener(this);

        dmFrame.add(scrollPane);
        dmFrame.add(exitButton);
        dmFrame.add(label1);
        dmFrame.add(backButton);
        dmFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            dmFrame.dispose();
            new MembersHomeFrame();
        }
    }
}
