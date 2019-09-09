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
public class HourlyEmployee extends Employe {
    private double wage;
    private double hours;
    
    
    public HourlyEmployee(String firstName, String LastName, String SocialSecurityNumber) {
        super(firstName, LastName, SocialSecurityNumber);
        
        if (wage <0.0){
        throw new IllegalArgumentException(" Salario por hora deve ser >= 0 ");
        }
        if ((hours < 0.0) || (hours > 168.0)){
         throw new IllegalArgumentException(" Horas trabalhadas precisam ser maior que 0 e menor que 168");
        
        }
        this.wage = wage;
        this.hours = hours;
    }
   
    
    public void setWage(double wage){    
    if (wage < 0.0){
     throw new IllegalArgumentException(" Salario por hora deve ser >= 0 ");
    }
     this.wage = wage;
        }
    
    
    public double getWage(){return wage;}
    
    public void setHours(double hours){
    if ((hours <0.0) || (hours > 168.0)){
    throw new IllegalArgumentException("as horas trabalhadas precisam ser maior ou igual a zero e menor que 168 horas");
    }
    
    }
    
    public double  getHours(){
    return this.hours;}

    @Override
    public double earnings() {
        if(getHours()<=40){
        return getWage() * getHours();
        
        }
        else {
        return 40 * getWage() + (getHours() - 40)* getWage()* 1.5;
        }
    }
    
    @Override
    public String toString(){
        return String.format("horas do empregado: %s%n%s: $%,.2f; %s: %,.2f", 
                super.toString(),"Salario por Hora",getWage(),"horas trabalhadas",getHours());
    
    }
    }
