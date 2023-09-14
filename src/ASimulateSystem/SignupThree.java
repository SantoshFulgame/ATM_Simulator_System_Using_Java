
package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
   

public class SignupThree extends JFrame implements ActionListener{
    
    JLabel l1,type,card,number,carddetail,atm,pin,pinnumber,pindetail,services,l11,l12;
    JRadioButton r1,r2,r3,r4;
    JButton submit,cancel;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;
    
    SignupThree(String formno){
        this.formno = formno;
        
        setLayout(null);
                
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);
        
        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280,40,400,40);
        add(l1); 
        
        type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 18));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,30);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,300,30);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,30);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,30);
        add(r4);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r3);
        groupgender.add(r4);
         
        
        card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 18));
        card.setBounds(100,300,200,30);
        add(card);
        
        number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 18));
        number.setBounds(330,300,250,30);
        add(number);
        
        carddetail = new JLabel("(Your 16-digit Card number)");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100,330,200,20);
        add(carddetail);
        
        
        atm = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        atm.setFont(new Font("Raleway", Font.BOLD, 12));
        atm.setBounds(330,330,500,20);
        add(atm);
        
        pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        pinnumber = new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway", Font.BOLD, 18));
        pinnumber.setBounds(330,370,200,30);
        add(pinnumber);
    
        pindetail = new JLabel("(4-digit password)");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100,400,200,20);
        add(pindetail);
        
        services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 18));
        services.setBounds(100,450,200,30);
        add(services);
        
        l11 = new JLabel("Form No:");
        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        l11.setBounds(700,10,70,30);
        add(l11);
        
        l12 = new JLabel(formno);
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(770,10,40,30);
        add(l12);
       
        //CheckBox
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350,550,200,30);
        add(c4);
              
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100,680,600,20);
        add(c7);
        
        //Buttons - submit and cancel
        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);

        //change the frame color to white
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String accounttype = null;
        if(r1.isSelected()){ 
            accounttype = "Saving Account";
        }
        else if(r2.isSelected()){ 
            accounttype = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){ 
            accounttype = "Current Account";
        }else if(r4.isSelected()){ 
            accounttype = "Recurring Deposit Account";
        }
        
        //random generate the pin number and card number
        Random ran = new Random();
        //card number
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pinno = "" + Math.abs(first3);
        
        String facility = "";
        if(c1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(c2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(c4.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{
            if(ae.getSource()==submit){
                
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn conn = new Conn();
                    String q1 = "insert into signupthree values('"+formno+"','"+accounttype+"','"+cardno+"','"+pinno+"','"+facility+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pinno+"')";
                    conn.s.executeUpdate(q1);
                    conn.s.executeUpdate(q2);
                    //show the user card number and pin number
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pinno);
                    
                    
                    new Deposit(pinno).setVisible(true);
                    setVisible(false);
                }
            
            }else if(ae.getSource()==cancel){
                System.exit(0);
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
    public static void main(String[] args){
        new SignupThree("").setVisible(true); 
    }
    
}

