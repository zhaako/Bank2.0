import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class addClient extends Container {

    JButton add,back;
    JTextField nameF,surnameF;
    JLabel name,surname;

    public static ArrayList<String> list_users = new ArrayList<String>();
    public static ArrayList<Users> list2 = new ArrayList<>();
    public addClient(final JTextField textField){
        setSize(500,500);
        setLayout(null);
        setBackground(new Color(249,244,173));
        name = new JLabel("Name");
        name.setBounds(30,100,300,30);
        nameF = new JTextField("");
        nameF.setBounds(100,100,300,30);
        add(name);
        add(nameF);

        surname = new JLabel("Surname");
        surname.setBounds(30,150,300,30);
        surnameF = new JTextField("");
        surnameF.setBounds(100,150,300,30);
        add(surname);
        add(surnameF);

        add = new JButton("ADD");
        add.setBounds(30,200,60,30);
        add(add);

        back = new JButton("BACK");
        back.setBounds(100,200,120,30);
        add(back);

        final int[] a = {1};
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Users users = new Users();
                AllUsers allUsers = new AllUsers();
                users.setName(nameF.getText());
                users.setSurname(surnameF.getText());
                if(nameF.equals("") && surnameF.equals("")){
                    JOptionPane.showMessageDialog(null,"Write something", "404 Error",JOptionPane.PLAIN_MESSAGE);
                }
                else{


//                    for(String user:list_users){
//                        System.out.print(user + " ");
//                    }
                    //System.out.println(list_users);
                    //textField.setText(users.getAll();
                    list_users.add(String.valueOf(a[0]));
                    list_users.add(nameF.getText());
                    list_users.add(surnameF.getText());
                    textField.setText(String.valueOf(list_users));
                    //textField.setText(users.getAll());
//                    nameF.setText("");
//                    surnameF.setText("");
                    a[0]++;
                    nameF.setText(" ");
                    surnameF.setText("");
                }
//                if(!nameF.equals("") && !surnameF.equals("")){
//                    list_users.add(nameF.getText());
//                    list_users.add(surnameF.getText());
//                    System.out.println(list_users);
//                    textField.setText(String.valueOf(list_users));
//                    nameF.setText("");
//                    surnameF.setText("");
//                }
//                else if(nameF.equals("") && surnameF.equals("")){
//                    JOptionPane.showMessageDialog(null,"Write something", "404 Error",JOptionPane.PLAIN_MESSAGE);
//                }
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Main.allset.showMenu();
            }
        });

    }

}
