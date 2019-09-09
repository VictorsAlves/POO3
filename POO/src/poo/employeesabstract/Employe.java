/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesabstract;

/**
 *
 * @author victor.salves5
 */
public abstract class Employe {
    private final String firtName;
    private final String lastName;
    private final  String socialSecurityNumber;
    
    //construtor
    public Employe(String firstName, String LastName, String SocialSecurityNumber){
    
   this.firtName = firstName;
   this.lastName = LastName;
   this.socialSecurityNumber = SocialSecurityNumber;
    }
    
    public String getFirstName(){return firtName;}
    
    public String getLastName(){return lastName;}
    
    public String getSocialSecurityNumber(){
    return socialSecurityNumber;
    }
    
    @Override
    public String toString(){
    return String.format("%s %s%nsocial security number: %s", getFirstName(),getLastName(),getSocialSecurityNumber());
    }
   
    public abstract double earnings();
}
