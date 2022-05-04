package model;

public class Users {
 public static String email,pass;
    public Users(String email, String pass){
        Users.email = email;
        Users.pass = pass;
    }

    public void setPass(String pass) {
        Users.pass = pass;
    }

    public void setEmail(String email) {
        Users.email = email;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }
}
