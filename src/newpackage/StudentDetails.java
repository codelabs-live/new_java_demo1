package newpackage;

import java.util.Scanner;

public class StudentDetails {
    Scanner scanner = new Scanner(System.in);
    String name , email , address;
    public void getStudentData(){
        System.out.println("Enter your name ");
        name = scanner.next();
        System.out.println("Enter your email");
        email = scanner.next();
        System.out.println("Enter your address");
        address = scanner.next();
    }
    public void displayStudentData(){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Address: "+address);
    }

}
