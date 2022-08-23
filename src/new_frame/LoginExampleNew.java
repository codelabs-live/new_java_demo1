package new_frame;

import javax.swing.*;
import java.awt.*;

public class LoginExampleNew {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        JPanel panel = new JPanel();
        JLabel emailL = new JLabel("Email");
        JLabel passL = new JLabel("Password");
        JTextField emailTF = new JTextField();
        JPasswordField passTF = new JPasswordField();
        JButton login = new JButton("Login");

        emailL.setBounds(10, 10, 200, 20);
        emailTF.setBounds(10, 30, 200, 30);


        panel.add(emailL);
        panel.add(emailTF);
        frame.add(panel);
        panel.setLayout(null);
        frame.setVisible(true);
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setLayout(null);

    }
}
