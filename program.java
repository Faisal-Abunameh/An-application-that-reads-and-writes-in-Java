import java.awt.;
import java.awt.event.;
import javax.swing.*;

public class GUI implements ActionListener{

private JFrame f1;
private JLabel l1, l2, l3;
private JButton bSave, bCancel, bPrint;
private JPanel p1;
private JTextField tf1, tf2, tf3; 
private JMenuBar mb1;
private JMenu m1, m2;
private JMenuItem i1, i2, i3;

private String initial1 = "None", initial2 = "None", initial3 = "Jordan", savedFirstName, savedName, savedCountry;

        public GUI(){
            method1();
    
        }
    
    
public void method1(){
    // Framing
    f1 = new JFrame("Lab Assignment 10");
    f1.setSize(300,250);
    
    
    // Creation for other components
    // For the labels
    l1 = new JLabel("First Name: ");
    l2 = new JLabel("Name: ");
    l3 = new JLabel("Country: ");

    // For the buttons
    bSave = new JButton("Save");
    bCancel = new JButton("Cancel");
    bPrint = new JButton("Print");
    
    // For the panel
    p1 = new JPanel();
    
    // For the JTextField
    tf1 = new JTextField("", 20);
    tf2 = new JTextField("", 20);
    tf3 = new JTextField("", 20);
    
    // For the MenuBar
    mb1 = new JMenuBar();
    
    // For the JMenu
    m1 = new JMenu("Data");
    m2 = new JMenu("About");

    // For the JMenuItem
    i1 = new JMenuItem("Set Initial Data");
    i2 = new JMenuItem("Delete Data");
    i3 = new JMenuItem("Credits");
    
    // Registration 
    bSave.addActionListener(this);
    bCancel.addActionListener(this);
    bPrint.addActionListener(this);
    i1.addActionListener(this);
    i2.addActionListener(this);
    i3.addActionListener(this);
    
    // Adding components
    p1.add(l1);
    p1.add(tf1);
    p1.add(l2);
    p1.add(tf2);
    p1.add(l3);
    p1.add(tf3);
    p1.add(bSave);
    p1.add(bCancel);
    p1.add(bPrint);
    p1.add(m1);
    p1.add(m2);
    
    m1.add(i1);
    m1.add(i2);
    m2.add(i3);
    
    mb1.add(m1);
    mb1.add(m2);
    
    f1.getContentPane().add(p1);
    // f1.getContentPane().add(mb1);
    
    
    // Visibility
    f1.setVisible(true);
    f1.setJMenuBar(mb1);
}

public void actionPerformed(ActionEvent d){

        if(d.getSource() == bSave){
            savedFirstName = tf1.getText();
            savedName = tf2.getText();
            savedCountry = tf3.getText();
                            
        }

        if(d.getSource() == bCancel){
            tf1.setText(savedFirstName);
            tf2.setText(savedName);
            tf3.setText(savedCountry);
            
        }
        
        if(d.getSource() == bPrint){
            savedFirstName = tf1.getText();
            savedName = tf2.getText();
            savedCountry = tf3.getText();
            
            System.out.println("First Name: " + savedFirstName);
            System.out.println("Name: " + savedName);
            System.out.println("Country: " + savedCountry);

        }
        
        if(d.getSource() == i1){
            initial1 = tf1.getText();
            initial2 = tf2.getText();
            initial3 = tf3.getText();
            
            
            savedFirstName = initial1;
            savedName = initial2;
            savedCountry = initial3;
            
            System.out.println("First Name: " + savedFirstName);
            System.out.println("Name: " + savedName);
            System.out.println("Country: " + savedCountry);
            
        }
        
        if(d.getSource() == i2){
            savedFirstName = null;
            savedName = null;
            savedCountry = null;   
        }
        
        if(d.getSource() == i3){
            JOptionPane.showMessageDialog(f1, "This is the assignment of lab 10.\nThis is a sample program that has been programmed by Faisal Abunameh.");            
        }            
}
}