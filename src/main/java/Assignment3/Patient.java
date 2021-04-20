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

public class Patient extends Person{
    //define the attribute of a patient
    private String idNumber;
    
    //define the constructors
    public Patient() {
        super();
        this.idNumber = "";
    }
    public Patient (String n, String i) {
        super(n); 
        this.idNumber = i;
    }
    
    //getter adn setter methods
    public void setID(String i) {
        this.idNumber = i;
    }
    public String getID(){
        return this.idNumber;
    }
    
    public void setPatient(String n, String i) {
        super.setName(n);
        this.idNumber = i;
    }
     
    public String getOutput(){
        return "Patient: " + super.getName() +
               "ID Number: " + this.idNumber;
    }
    
    //define equal method to check if two doc objects are the same
    public boolean equal(Patient p) {
        return this.getName().equalsIgnoreCase(p.getName()) && this.getID().equalsIgnoreCase(p.getID());
    
    }
}
