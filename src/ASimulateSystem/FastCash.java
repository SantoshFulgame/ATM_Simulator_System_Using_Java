
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JLabel text, l2;
    JButton b1, b2, b3, b4, b5, b6, back;
    JTextField t1;
    String pinnumber;

    FastCash(String pinnumber) {
        
        this.pinnumber = pinnumber;
               
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 960, 1080);
        add(image);

        text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(235, 400, 700, 35);
        image.add(text);

        b1 = new JButton("Rs 100");
        b1.setBounds(170, 499, 150, 35);
        b1.addActionListener(this);
        image.add(b1);
        
        b2 = new JButton("Rs 500");
        b2.setBounds(390, 499, 150, 35);
        b2.addActionListener(this);        
        image.add(b2);
        
        b3 = new JButton("Rs 1000");
        b3.setBounds(170, 543, 150, 35);
        b3.addActionListener(this);
        image.add(b3);
        
        b4 = new JButton("Rs 2000");
        b4.setBounds(390, 543, 150, 35);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("Rs 5000");
        b5.setBounds(170, 588, 150, 35);
        b5.addActionListener(this);
        image.add(b5);
        
        b6 = new JButton("Rs 10000");
        b6.setBounds(390, 588, 150, 35);
        b6.addActionListener(this);
        image.add(b6);
        
        back = new JButton("BACK");
        back.setBounds(390, 633, 150, 35);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String amount = ((JButton)ae.getSource()).getText().substring(3); //Rs 500
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            int balance = 0;
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            } String num = "17";
            if (ae.getSource() != back && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }

            if (ae.getSource() == back) {
                this.setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }else{
                Date date = new Date();
                c.s.executeUpdate("insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                    
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new FastCash("").setVisible(true);
    }
}

