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
public class EmployeesAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Employe [] employes = new Employe[5];
           
           employes[0] = new CommisionEmploye("nando", "costa", "0000f4df5", 0.51, 2);
           employes[1] = new HourlyEmployee("Dagoberto", "Moura", "1s56dad");
           employes[2] = new BasePlusCommisionEmployee("Edmundo", "Siqueira", "dasd4561", 0.1, 100, 101);
           employes[3] = new SalariedEmploye("Joao", "losferato", "fun0001",400.00);
           employes[4] = new Employe("Pedro", "Buarque","0690func") {
               @Override
               public double earnings() {
                   return 1000;
               }
           };
           
           
           
           
           
           for (int i = 0; i < employes.length; i++) {
               System.out.println(employes[i].toString());
        }
           
    }
    
}
