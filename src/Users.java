import javax.swing.*;
import java.security.PublicKey;
import java.util.ArrayList;

public class Users {

    private String name;
    private String surname;

    public static ArrayList<Users> list1 = new ArrayList<>();

    public Users(){
    }
    public Users(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setAll(String name, String surname){
        this.surname = surname;
        this.name = name;
    }
    public void getAll(Users users){
        String all = "";
        all = ". " + name + " " + surname;
    }


}
