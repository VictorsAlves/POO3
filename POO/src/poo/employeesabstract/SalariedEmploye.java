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
public class SalariedEmploye  extends Employe{
private double weeklySalary;

    public SalariedEmploye(String firstName, String LastName, String SocialSecurityNumber,double weeklySalary) {
        super(firstName, LastName, SocialSecurityNumber);
        
        if (weeklySalary < 0.0)
        {
        throw new IllegalArgumentException("Salário da semana precisa >= 0");
        
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0){
        throw new IllegalArgumentException("Salario da semana precisa ser maior que 0");}
        this.weeklySalary = weeklySalary;
    }
    @Override
    public double earnings() {
    return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("Salario do Empregado: %s%n%s: $%,.2f",
                super.toString(),"Salario da Semana", getWeeklySalary());
    }
    
    
}
