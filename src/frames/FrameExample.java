package frames;


//import javax.swing.*;
//
//public class FrameExample extends JFrame {
//    FrameExample(){
//
//
//       setSize(300,400);
//       setLayout(null);
//       setVisible(true);
//       setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//
//    public static void main(String[] args) {
//        new FrameExample();
//
//    }
//
//}


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrameExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        JPanel panel = new JPanel();
//        JOptionPane jOptionPane = new JOptionPane("");

        JLabel emailL = new JLabel("Email");
        JLabel passwordL = new JLabel("Password");
        JTextField emailTF = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton login = new JButton("Login");

        emailL.setBounds(10, 10, 200, 30);
        emailTF.setBounds(10, 40, 200, 30);
        passwordL.setBounds(10, 70, 200, 30);
        passwordField.setBounds(10, 100, 200, 30);
        login.setBounds(10, 140, 200, 30);
//        jOptionPane.setBounds(20,200,200,30);

        login.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailTF.getText().trim();
                String pass = passwordField.getText().trim();
                if (email.isEmpty()) {
//                   jOptionPane.setMessage("Enter your Email");
//                    emailTF.setText("Enter your email");
                    JOptionPane.showMessageDialog(panel,"Enter your Email","Alert",JOptionPane.WARNING_MESSAGE);
                } else if (pass.isEmpty()) {
//                    passwordField.setText("Enter your password");
//                   jOptionPane.setMessage("Enter your password");
                    JOptionPane.showMessageDialog(panel,"Enter your Password","Alert",JOptionPane.WARNING_MESSAGE);
                } else {
                    System.out.println(email);
                    System.out.println(pass);
                }
            }
        });


        panel.add(emailL);
        panel.add(emailTF);
        panel.add(passwordL);
        panel.add(passwordField);
        panel.add(login);
//        panel.add(jOptionPane);

        panel.setLayout(null);

        frame.add(panel);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

    }
}
