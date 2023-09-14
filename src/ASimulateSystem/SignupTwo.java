package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes, sno,eyes,eno;
   JComboBox religion, category,education, occupation,income; 
   String formno;
    
    SignupTwo(String formno) {
        this.formno = formno;
        
        setLayout(null); 
        
        setTitle("New ACCOUNT APPLICATION FORM - PAGE 2");
        
       
        JLabel additionalDetails = new JLabel("Page 2 :Additional Details");
        additionalDetails.setFont(new Font ("Raleway", Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel caste = new JLabel("Religion:");
        caste.setFont(new Font ("Raleway", Font.BOLD,20));
        caste.setBounds(100,140,100,30);
        add(caste);
        
        String[] valReligion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel categoryname = new JLabel("Category:");
        categoryname.setFont(new Font ("Raleway", Font.BOLD,20));
        categoryname.setBounds(100,190,200,30);
        add(categoryname);
        
        String valcategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBackground(Color.WHITE);
        category.setBounds(300,190,400,30);
        add(category);
        
        JLabel incometype = new JLabel("Income:");
        incometype.setFont(new Font ("Raleway", Font.BOLD,20));
        incometype.setBounds(100,240,200,30);
        add(incometype);
        
        String incomecategory[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);

        
        JLabel educationtype = new JLabel("Educational");
        educationtype.setFont(new Font ("Raleway", Font.BOLD,20));
        educationtype.setBounds(100,290,200,30);
        add(educationtype);
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font ("Raleway", Font.BOLD,20));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String educationValues[] = {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        

        JLabel occupationtype = new JLabel("Occupation:");
        occupationtype.setFont(new Font("Raleway", Font.BOLD, 20));
        occupationtype.setBounds(100, 390, 200, 30);
        add(occupationtype);

        String occupationValues[] = {"Salaried", "Self-Employed", "Business", "Retired", "Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        
        JLabel panno = new JLabel("PAN NUMBER:");
        panno.setFont(new Font ("Raleway", Font.BOLD,20));
        panno.setBounds(100,440,200,30);
        add(panno);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel aadharNo = new JLabel("Aadhar Number:");
        aadharNo.setFont(new Font ("Raleway", Font.BOLD,20));
        aadharNo.setBounds(100,490,200,30);
        add(aadharNo);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        // Correct placement of Senior Citizen radio buttons
        JLabel citizen = new JLabel("Senior Citizen:");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(100, 540, 200, 30);
        add(citizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorCitizengroup = new ButtonGroup();
        seniorCitizengroup.add(syes);
        seniorCitizengroup.add(sno);


        JLabel existingAccounttype = new JLabel("Existing Account:");
        existingAccounttype.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccounttype.setBounds(100, 590, 200, 30);
        add(existingAccounttype);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(eyes);
        existingGroup.add(eno);

               
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
      String sreligion = (String)religion.getSelectedItem();
      String scategory = (String)category.getSelectedItem();
      String sincome = (String)income.getSelectedItem();
      String seducation = (String)education.getSelectedItem();
      String soccupation = (String)occupation.getSelectedItem();
      String seniorcitizen = null;
      if(syes.isSelected()){
          seniorcitizen = "Yes";
      }
      else if(sno.isSelected()){
           seniorcitizen = "No";
      }
      

      String exisitingaccount = null;
      if(eyes.isSelected()){
          exisitingaccount = "Yes";
      }
      else if(eno.isSelected()){
          exisitingaccount = "No";
      }
      
      String span = pan.getText();
      String saadhar = aadhar.getText();
      
      
      try{
          if(aadhar.equals("")){
              JOptionPane.showMessageDialog(null,"Father Nmae is Required");
          } else if(pan.equals("")){
              JOptionPane.showMessageDialog(null,"Date of Birth is Required");
          } 
          //call to database
          else {
            Conn c = new Conn();
            String query = "insert into signuptwo values ('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
            c.s.executeUpdate(query);
            
            //SignupThree Object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
          }
      }catch(Exception e){
          System.out.println(e); 
      }
    }
    
    public static void main(String[] args) {
        new SignupTwo("");
    }
}
