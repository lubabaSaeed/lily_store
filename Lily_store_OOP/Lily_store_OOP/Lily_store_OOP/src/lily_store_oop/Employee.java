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
public class Employee extends Staff {

   public Employee(String name, String id, String email, double Salary) {
        super(name, id, email, Salary);
    }

    @Override
    public String toString() {
        return  super.toString();
    }
 
}
