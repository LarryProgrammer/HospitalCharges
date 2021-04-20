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
public class Person {
    //define the field
    private String name;
    
    //define the constructors
    public Person () {
        name ="";
    }
    public Person(String n) {
        this.name = n;
    }
    
    //setter and getter methods
    public void setName (String n) {
        this.name=n;
    }
    public String getName() {
        return this.name;
    }
}
