import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loggPass extends Container {
    JLabel log,pass;
    JTextField logF,passF;
    JButton back;

    public loggPass(){
        setBackground(new Color(249,244,173));
        setSize(500,500);
        setLayout(null);

        log = new JLabel("Logins");
        log.setBounds(30,50,300,30);
        add(log);

        logF = new JTextField();
        logF.setBounds(100,50,300,30);
        add(logF);

        pass = new JLabel("Passwords");
        pass.setBounds(30,100,300,30);
        add(pass);

        passF = new JTextField();
        passF.setBounds(100,100,300,30);
        add(passF);

        back = new JButton("BACK");
        back.setBounds(30,150,300,30);
        add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.allset.showAdminMenu();
            }
        });

    }

}
