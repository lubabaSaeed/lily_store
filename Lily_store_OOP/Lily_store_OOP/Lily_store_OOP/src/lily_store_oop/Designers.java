/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lily_store_oop;

/**
 *
 * @author pc
 */
public class Designers extends Staff implements Bonusable  {
     private double bonus;
     private double SalaryWithBonus;

    public Designers(String name, String id, String email, double Salary) {
        super(name, id, email, Salary);
    }
   
    @Override
    public double getSalary() {
        return super.getSalary()+bonus; //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public double calculateBonus() {
        bonus=this.getSalary()*RATE;
         return bonus;
    }

    @Override
    public String toString() {
        return  super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
