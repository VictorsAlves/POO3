/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesabstract;


public class CommisionEmploye extends Employe {
    private double grossSales;
    private double commisionRate;
    
    public CommisionEmploye(String firstName, String LastName, String SocialSecurityNumber, double commisionRate, double grossSales) {
        super(firstName, LastName, SocialSecurityNumber);
    
    if(commisionRate <= 0.0 || commisionRate >= 1.0){
      throw new IllegalArgumentException(" Comisao deve ser > 0 e < 1 ");
    }
    
    if (grossSales< 0.0){
      throw new IllegalArgumentException(" Venda Bruta >= 0 ");
    }
    
    this.grossSales = grossSales;
    this.commisionRate = commisionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales< 0){
          throw new IllegalArgumentException(" Venda bruta deve ser >= 0 ");
        }
        this.grossSales = grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        if(commisionRate <= 0.0 || commisionRate >=1.0){
          throw new IllegalArgumentException(" Commisao precisa ser <0 e menor que 1");
        }
        
        
        
        this.commisionRate = commisionRate;
    }
    

    @Override
    public double earnings() {
        return getCommisionRate() * getGrossSales();
    }
        @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f","commission employee" ,
                super.toString(),"Venda Bruta",getGrossSales(),"Valor de Comissao",getCommisionRate());
    
    }
}
