package frames;

import javax.swing.*;
import java.awt.*;

public class Login {
    public static void main(String[] args) {
        // object
        JFrame jFrame = new JFrame("Login");
        JPanel jPanel = new JPanel();
        JLabel emailLabel = new JLabel("Email");
        JLabel passwordLabel = new JLabel("Password");
        JTextField emailTF = new JTextField();
        JTextField passTF = new JTextField();
        JButton login = new JButton("Login");



        // bounds
        emailLabel.setBounds(10, 10, 200, 30);
        emailTF.setBounds(10, 40, 200, 30);
        jPanel.setBackground(Color.BLUE);
        emailLabel.setForeground(Color.white);


        // add to panel
        jPanel.add(emailLabel);
        jPanel.add(emailTF);
        jPanel.add(passwordLabel);
        jPanel.add(passTF);
        jPanel.add(login);
        jPanel.setLayout(null);

// frame
        jFrame.add(jPanel);
        jFrame.setSize(300, 400);
        jFrame.setVisible(true);
//        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
