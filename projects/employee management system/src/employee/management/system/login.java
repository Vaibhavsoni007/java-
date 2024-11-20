package employee.management.system;

import javax.swing.*;
import java.awt.*;


public class login extends JFrame{

    login() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);         // for making our personal layout we trun off default layout

        JLabel lblusername = new JLabel("Username");            // making username prompt
        lblusername.setBounds(40,20,100,30);
        add(lblusername);

        JTextField tfusername = new JTextField();                   // making writing area for username
        tfusername.setBounds(150,20,150,30);
        add(tfusername);

        JLabel lblpassword = new JLabel("Password");            // making Password prompt
        lblpassword.setBounds(40,70,100,30);
        add(lblpassword);

        JTextField tfpassword = new JTextField();                   // making writing area for password
        tfpassword.setBounds(150,70,150,30);
        add(tfpassword);

        JButton login = new JButton("LOGIN");                   // making login button
        login.setBounds(150, 140, 150, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));            // adding image to login page
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        setSize(600,300);
        setLocation(650,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new login();
    }
}
