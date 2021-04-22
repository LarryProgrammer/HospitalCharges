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

        
        /* ADD A BUTTON */
        SubmitBtn = new JButton("Submit");
        SubmitBtn.addActionListener(this);

        //create a panel to display the result
        JPanel resultPnl = new JPanel();
        //set the layout of the result panel
        resultPnl.setLayout(new GridLayout(2, 1));
        resultPnl.add(SubmitBtn);



        /* ADD A TEXT AREA TO DISPLAY */
        displayArea = new JTextArea(20, 30);
        //add the scrollbar in the text area
        JScrollPane scrollBar = new JScrollPane(displayArea);
        scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollBar.setHorizontalScrollBarPolicy((JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));
        resultPnl.add(scrollBar);/* Add the scrollpane with textarea to the panel */
        contentPane.add(resultPnl);/* Add the panel to the container */

        frame.setVisible(true);//make the frame visible
        //set the default close operations
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /* Override the actionPreformed method in the ActionListener interface */
    @Override
    public void actionPerformed(ActionEvent e) {
        /* get the actionCommand */
        String actionCommand = e.getActionCommand();

        if(actionCommand.equals("Submit")) {
            displayArea.append(getInfo() + "\n"); /* call a method for each billing object */
        }
    }

    /* define getInfo() method */
    private String getInfo() {
        String output = " ";

        /* Get patient and doctor info submitted by the user */
        String pName, dName, pID, docSpeciality, officeFee;
        double fee;

        try {
            pName =patientNameFld.getText();
            pID = patientIdFld.getText();
            dName = doctorNameFld.getText();
            docSpeciality = (String) docBox.getSelectedItem();
            officeFee = visitFeeFld.getText();

            /* An exception is raised whe user inputs invalid data */
            if(pName.equals(" ") || pID.equals(" ") || dName.equals(" ")
                    || docSpeciality.equals(" ") || officeFee.equals(" ")) {
                throw new Exception("Do not leave the field empty");
            /* Read the numeric data entered for the visit fees */
            fee = Double.parseDouble(officeFee);
            if (fee < 0)
                throw new Exception("Enter a positive value!!");
            //create a patient object
            Patient p = new Patient(pName,pID);
            //create a doctor object
            Doctor d = new Doctor(dName,docSpeciality,fee);
            //create a billing object
            Billing b = new Billing(d,p);

            //get teh details of the billing object created
            output = b.getOutput();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return output; /*Return the billing details */
    }

    /* THE MAIN */
    public static void main(String[] args) {
        BillingDemo gui = new BillingDemo(); //instantiate the GUI
    }
}
