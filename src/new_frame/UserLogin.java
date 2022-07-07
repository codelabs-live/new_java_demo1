package new_frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin {
    public static void main(String[] args) {
        JFrame frame  = new JFrame("Login");
        JLabel userL= new JLabel("Username");
        JTextField usernameTF= new JTextField();
        JLabel passL = new JLabel("Password");
        JPasswordField passwordF =new JPasswordField();
        JButton loginB =  new JButton("Login");

     userL.setBounds(20,30,200,20);
     usernameTF.setBounds(20,50,200,30);
     passL.setBounds(20,90,200,20);
     passwordF.setBounds(20,110,200,30);
     loginB.setBounds(20,160,200,30);



     loginB.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             System.out.println("Done");
         }
     });



        frame.add(userL);
        frame.add(usernameTF);
        frame.add(passL);
        frame.add(passwordF);
        frame.add(loginB);



        frame.setLayout(null);
        frame.setSize(400,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
