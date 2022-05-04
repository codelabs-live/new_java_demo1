package auth;

import model.Users;

import java.util.Scanner;

public class Register {
    Users users;
    public String email, pass;
    Scanner scanner = new Scanner(System.in);

  public void getData(){
        System.out.println("Enter your email");
        email = scanner.next();
        System.out.println("Enter your password");
        pass = scanner.next();
        users = new Users(email, pass);
        System.out.println("Registration Done!!!");
    }

}
