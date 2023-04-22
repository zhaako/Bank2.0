import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Admin extends Container {
    JTextField nameF2;
    JPasswordField password;
    JLabel name2,pass;
    JButton back,logIn;
    public Admin(){
        setSize(500,500);
        setLayout(null);
        setBackground(new Color(249,244,173));

        name2 = new JLabel("Admins Login");
        name2.setBounds(30,100,300,30);
        add(name2);

        nameF2 = new JTextField();
        nameF2.setBounds(150,100,300,30);
        add(nameF2);


        pass = new JLabel("Password");
        pass.setBounds(30,150,300,30);
        add(pass);

        password = new JPasswordField();
        password.setBounds(150,150,300,30);
        add(password);

        logIn = new JButton("Log in");
        logIn.setBounds(30,250,200,30);
        add(logIn);

        back = new JButton("Back");
        back.setBounds(250,250,120,30);
        add(back);

        logIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name;
                name = nameF2.getText();
                int pass = Integer.parseInt(password.getText());
                if(Objects.equals(name,"Zhako2004") && Objects.equals(pass, 5656)){
                    Main.allset.showAdminAcc();
                    nameF2.setText("");
                    password.setText("");
                }
                else if(nameF2.equals("")){
                    JOptionPane.showMessageDialog(null,"Write something", "404 Error",JOptionPane.PLAIN_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"incorrect data \n try again", "404 Error",JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.allset.showMenu();
            }
        });
    }
}
