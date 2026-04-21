package GUI.MemberFrames;

import Code.ArrayListsManager;
import GUI.CreateBackButton;
import GUI.CreateExitButton;
import GUI.CreateLabel;

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

        ArrayList<Integer> ids = manager.fetchMemberIdsData();
        ArrayList<String> names = manager.fetchMemberNamesData();
        ArrayList<String> numbers = manager.fetchMemberNumbersData();
        ArrayList<String> emails = manager.fetchMemberMailsData();

        String[][] data = new String[ids.size()][4];

        for (int i = 0; i < ids.size(); i++){
            data[i][0] = Integer.toString(ids.get(i));
            data[i][1] = names.get(i);
            data[i][2] = numbers.get(i);
            data[i][3] = emails.get(i);
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
