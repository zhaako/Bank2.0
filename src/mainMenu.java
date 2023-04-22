import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu extends Container {
    JButton newClient, log_in,admin,allUsers,exitBtn;

    public mainMenu(){

        setSize(500,500);
        setLayout(null);
        setBackground(new Color(249,244,173));

        newClient = new JButton("Sign up");
        newClient.setBounds(50,50,250,30);
        add(newClient);

        log_in = new JButton("Log in");
        log_in.setBounds(50,100,250,30);
        add(log_in);

        admin = new JButton("Admin");
        admin.setBounds(50,150,250,30);
        add(admin);

        allUsers = new JButton("AllUsers");
        allUsers.setBounds(50,200,250,30);
        add(allUsers);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(50,250,250,30);
        add(exitBtn);


        newClient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.allset.showAddClient();
            }
        });

        log_in.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.allset.showLogIn();
            }
        });

        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.allset.showAdminMenu();
            }
        });

        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        allUsers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.allset.showAllUsers();
            }
        });

    }
}
