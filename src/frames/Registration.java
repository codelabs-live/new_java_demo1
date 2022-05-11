package frames;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Registration {
    JFrame frame = new JFrame("Reg");
    JPanel panel = new JPanel();
    JLabel loginLabel = new JLabel("Login");
    JLabel emailL = new JLabel("Email");
    JLabel passL = new JLabel("Password");
    JButton loginB = new JButton("Login");
    JTextField emailTF = new JTextField();
    JTextField passTF = new JTextField();
    Registration(){

        loginLabel.setBounds(0,10,400,30);
        emailL.setBounds(10,40,300,30);
        emailTF.setBounds(10,70,300,30);
        passL.setBounds(10,100,300,30);
        passTF.setBounds(10,130, 300, 30);
        loginB.setBounds(10,170, 300, 30);

        loginB.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailTF.getText().trim();
                String pass = passTF.getText().trim();
                System.out.println(email);
                System.out.println(pass);
            }
        });
        panel.add(loginLabel);
        panel.add(emailL);
        panel.add(emailTF);
        panel.add(passL);
        panel.add(passTF);
        panel.add(loginB);

        panel.setLayout(null);

        frame.add(panel);


        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
