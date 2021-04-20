/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author Larry Jackson
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BillingDemo extends JFrame {
    
    JTextField patientNameFld,patientIdFld, doctorNameFld, visitFeeFld;
    JComboBox docBox;
    
    //define our form constructor
    public BillingDemo() {
        
        /* JFame BEING MADE */
        
        //create a frame
        JFrame frame = new JFrame();
        
        //set the dimensions of the frame
        frame.setSize(350, 350);
        frame.setTitle("Hospital charges");
        Container contentPane = frame.getContentPane();
        /* Set the layout of the frame to hold info*/
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
 
 /*****************************************************************************/
       
         /* PATIENT PANEL */
        
        //create a panel to get patient info
        JPanel patientPnl = new JPanel();
        /*Set the layout to get patient info */
        patientPnl.setLayout(new GridLayout(2,2));
        JLabel label1 = new JLabel("Enter Patient's name: ");
        patientPnl.add(label1); // add the label to the gird
        patientNameFld = new JTextField(30);
        JLabel label2 = new JLabel("Enter Patient's ID name: ");
        patientPnl.add(patientNameFld); //add the field to the grid
        patientPnl.add(label2); // add the label to the gird
        patientIdFld = new JTextField(30);
        patientPnl.add(patientIdFld); //add the field to the grid
        contentPane.add(patientPnl);
        
 /*****************************************************************************/
      
        /* DOCTOR PANEL */
        
        //create a panel to get doctor info
        JPanel doctorPnl = new JPanel();
        /*Set the layout to get patient info */
        doctorPnl.setLayout(new GridLayout(3,3));
        JLabel label3 = new JLabel("Enter Doctor's name: ");
        doctorPnl.add(label3); // add the label to the gird
        doctorNameFld = new JTextField(30);
        JLabel label4 = new JLabel("Choose Doctor speciality: ");
        doctorPnl.add(doctorNameFld); //add the field to the grid
        doctorPnl.add(label4); // add the label to the gird
        //declare a string array to hold doctype. later use it to fill the combobox
        String[] doctype = {"Pediatrician",  "Obstetrician", "General Practitioner",
                             "Primary Care", "Gynecologist"};
        docBox = new JComboBox(doctype);
        //Set the dimension of the combox
        doctorPnl.add(docBox); //add the combobox to the grid
        JLabel label5 = new JLabel("Enter your visit Fees: ");
        doctorPnl.add(label5); // add the label to the gird
        visitFeeFld = new JTextField(30);
        doctorPnl.add(visitFeeFld); //add the field to the grid
        contentPane.add(doctorPnl);
        
/*****************************************************************************/

        /* OUTPUT PANEL */
        
        //create a panel to display the result

        
        
        
        
        frame.setVisible(true);//make the frame visible
        //set the default close operations
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    /* THE MAIN */
    public static void main (String [] args) {
        BillingDemo gui = new BillingDemo(); //instantiate the GUI
    }
}
