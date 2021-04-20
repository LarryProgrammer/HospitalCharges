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
public class Billing {
    //define the attributes of billing object
    private String aPatient;
    private String aDoctor;
    private double TotalFee;
    
    //define constructor
    public Billing(Doctor d, Patient p){
        this.aPatient = p.getName();
        this.aDoctor = d.getName();
        this.TotalFee = d.getFees();
    }
    
    //define method to get output
    public String getOutput(){
        return "Doctor: " + this.aDoctor +
                "\nPatient: "+ this.aPatient +
                "\nBilling Fee: "+ this.TotalFee;
    }
    
}
