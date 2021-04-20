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

public class Doctor extends Person {
    //Define the specialized attributes of doctor object
    private String speciality;
    private double visitFee;
    
    //define constructor
    public Doctor() {
        super();
        this.speciality = "";
        this.visitFee =0;
    }
    public Doctor (String n, String s, double f) {
        super(n);
        this.speciality = s;
        this.visitFee =f;
    }
    
    //define setters and getters
    public void SetSpeciality(String s) {
        this.speciality = s;
    }
    public void setVisitFee(double f) {
        this.visitFee =f;
    }
    public String getSpeciality(){
        return this.speciality;
    }
    public double getFees() {
        return this.visitFee;
    }
    
  
    //define methods to rest data and compare two objects
    public void getDoctor(String n, String s, double f) {
        super.setName(n);
        this.speciality =s;
        this.visitFee =f;
    }
    
    public String getOutput(){
        return "Doctor: " + super.getName() +
               "Speciality: " + this.getSpeciality() +
               "Visit Fee: " + this.getFees();
    }
    
    //define equal method to check if two doc objects are the same
    public boolean equal(Doctor d) {
        return this.getName().equalsIgnoreCase(d.getName()) && this.getSpeciality().equalsIgnoreCase(d.getSpeciality());
    }
}
