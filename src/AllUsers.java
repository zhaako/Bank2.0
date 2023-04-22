import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class AllUsers extends Container {
    JLabel allUsersLogin;
    JTextField userF;
    JButton back;
    public JTextField getTextField(){
        return userF;
    }
    public AllUsers(){
        setSize(500,500);
        setLayout(null);
        setBackground(new Color(249,244,173));

        allUsersLogin = new JLabel("Logins");
        allUsersLogin.setBounds(30,120,300,30);
        add(allUsersLogin);

        userF = new JTextField();
        userF.setBounds(30,150,300,150);
        add(userF);

        back = new JButton("BACK");
        back.setBounds(30,320,100,30);
        add(back);


        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.allset.showMenu();
            }
        });
    }
}
