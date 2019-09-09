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
public class BasePlusCommisionEmployee extends CommisionEmploye {

    private double baseSalary;

    public BasePlusCommisionEmployee(String firstName, String LastName, String SocialSecurityNumber, double commisionRate, double grossSales, double baseSalary) {
        super(firstName, LastName, SocialSecurityNumber, commisionRate, grossSales);

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Salario Base precisa >= 0.0");
        }

        this.baseSalary = baseSalary;

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(" Commisao precisa ser >= 0.0 ");
        }

        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base Salary", getBaseSalary());
    }

}
