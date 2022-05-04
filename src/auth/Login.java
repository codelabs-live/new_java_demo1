package auth;

import model.Users;

import java.util.Objects;
import java.util.Scanner;

public class Login {
public String email, pass;
Scanner scanner = new Scanner(System.in);
public  void getData(){
    System.out.println("Enter your email");
    email = scanner.next();
    System.out.println("Enter your password");
    pass = scanner.next();
}

public  void checkAuth(){
    if (Objects.equals(email, Users.email)&& Objects.equals(pass,Users.pass)){
        System.out.println("Login Done");
    }else {
        System.out.println("Error");
    }
}
}
