import javax.swing.*;
import java.awt.*;

public class Allset extends JFrame {
    protected mainMenu mainMenu2;
    protected addClient addClient2;
    protected Admin admin;
    protected AllUsers allUsers;
    protected loggPass loggPass;
    protected Log_in logIn;
    public Allset(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Application");
        setBackground(new Color(249,244,173));
        setLayout(null);
        setSize(500,500);
        setLocation(500,200);

        mainMenu2 = new mainMenu();
        mainMenu2.setVisible(true);
        add(mainMenu2);

        admin = new Admin();
        admin.setVisible(false);
        add(admin);

        logIn = new Log_in();
        logIn.setVisible(false);
        add(logIn);

        allUsers = new AllUsers();
        allUsers.setVisible(false);
        add(allUsers);

        addClient2 = new addClient(allUsers.getTextField());
        addClient2.setVisible(false);
        add(addClient2);

        loggPass = new loggPass();
        loggPass.setVisible(false);
        add(loggPass);


    }
    public void showAddClient(){
        mainMenu2.setVisible(false);
        addClient2.setVisible(true);
        admin.setVisible(false);
        allUsers.setVisible(false);
        loggPass.setVisible(false);
        logIn.setVisible(false);
    }

    public void showMenu(){
        mainMenu2.setVisible(true);
        addClient2.setVisible(false);
        admin.setVisible(false);
        allUsers.setVisible(false);
        loggPass.setVisible(false);
        logIn.setVisible(false);
    }
    public void showAdminMenu(){
        mainMenu2.setVisible(false);
        addClient2.setVisible(false);
        admin.setVisible(true);
        allUsers.setVisible(false);
        loggPass.setVisible(false);
        logIn.setVisible(false);
    }
    public void showAllUsers(){
        mainMenu2.setVisible(false);
        addClient2.setVisible(false);
        admin.setVisible(false);
        allUsers.setVisible(true);
        loggPass.setVisible(false);
        logIn.setVisible(false);
    }

    public void showAdminAcc(){
        mainMenu2.setVisible(false);
        addClient2.setVisible(false);
        admin.setVisible(false);
        allUsers.setVisible(false);
        loggPass.setVisible(true);
        logIn.setVisible(false);
    }
    public void showLogIn(){
        mainMenu2.setVisible(false);
        addClient2.setVisible(false);
        admin.setVisible(false);
        allUsers.setVisible(false);
        loggPass.setVisible(false);
        logIn.setVisible(true);
    }
}
