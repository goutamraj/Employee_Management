package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {

    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1120,630);
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(340,155,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        img.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(355,270,150,40);
        add.setOpaque(true);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBorderPainted(false); // optional – removes border
        add.setFocusPainted(false);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);
            }
        });
        img.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(565,270,150,40);
        view.setOpaque(true);
        view.setBackground(Color.BLACK);
        view.setForeground(Color.WHITE);
        view.setBorderPainted(false); // optional – removes border
        view.setFocusPainted(false);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_Employee();
                setVisible(false);
            }
        });
        img.add(view);

        JButton remove = new JButton("Remove Employee");
        remove.setBounds(440,370,150,40);
        remove.setOpaque(true);
        remove.setBackground(Color.BLACK);
        remove.setForeground(Color.WHITE);
        remove.setBorderPainted(false); // optional – removes border
        remove.setFocusPainted(false);
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
            }
        });
        img.add(remove);

        setSize(1120,630);
        setLocation(250,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main_class();
    }
}
