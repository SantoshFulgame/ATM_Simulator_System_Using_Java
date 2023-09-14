package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField,fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male, female,married, other, unmarried;
   JDateChooser dateChooser;
   
    
    public SignupOne() {
        
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs(ran.nextLong()% 9000L +1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font ("Raleway", Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
       
        JLabel personDetails = new JLabel("Page 1 :Personal Details");
        personDetails.setFont(new Font ("Raleway", Font.BOLD,22));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font ("Raleway", Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font ("Raleway", Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font ("Raleway", Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font ("Raleway", Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
       
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

  
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font ("Raleway", Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel martial = new JLabel("Martial Status");
        martial.setFont(new Font ("Raleway", Font.BOLD,20));
        martial.setBounds(100,390,200,30);
        add(martial);
        
        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
       
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other = new JRadioButton("Female");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font ("Raleway", Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font ("Raleway", Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel country = new JLabel("State:");
        country.setFont(new Font ("Raleway", Font.BOLD,20));
        country.setBounds(100,540,200,30);
        add(country);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        
        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font ("Raleway", Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
        
        next = new JButton ("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
      String formno = ""+ random; //long value convert into string
      String name = nameTextField.getText();
      String fname = fnameTextField.getText();
      String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
      String gender = null;
      if(male.isSelected()){
          gender = "Male";
      }
      else if(female.isSelected()){
           gender = "Female";
      }
      
      
      String email = emailTextField.getText();
      String marital = null;
      if(married.isSelected()){
          marital = "Married";
      }
      else if(unmarried.isSelected()){
          marital = "Unmarried";
      }
      else if(other.isSelected()){
          marital = "Other";
      }
      
      String address = addressTextField.getText();
      String city = cityTextField.getText();
      String country = stateTextField.getText();
      String pin = pinTextField .getText();
      
      
      try{
          if(name.equals("")){
              JOptionPane.showMessageDialog(null,"Name is Required");
          } else if(fname.equals("")){
              JOptionPane.showMessageDialog(null,"Father Nmae is Required");
          } else if(dob.equals("")){
              JOptionPane.showMessageDialog(null,"Date of Birth is Required");
          } else if(gender.equals("")){
              JOptionPane.showMessageDialog(null,"Gender is Required");
          } else if(address.equals("")){
              JOptionPane.showMessageDialog(null,"Address is Required");
          } else if(email.equals("")){
              JOptionPane.showMessageDialog(null,"Email is Required");
          } else if(city.equals("")){
              JOptionPane.showMessageDialog(null,"City Name is Required");
          }else if(pin.equals("")){
              JOptionPane.showMessageDialog(null,"Pincode is Required");
          }else if(country.equals("")){
              JOptionPane.showMessageDialog(null,"State is Required");
          }
          //call to database
          else {
            Conn c = new Conn();
            String query = "insert into signup values ('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"', '"+country+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignupTwo(formno).setVisible(true);
          }
      }catch(Exception e){
          System.out.println(e); 
      }
    }
    
    public static void main(String[] args) {
        new SignupOne();
    }
}
