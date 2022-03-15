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
public abstract class Staff {
    private String name;
    private String id;
    private String email;
    private double Salary;

    public Staff(String name, String id, String email, double Salary) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.Salary = Salary;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return  name + "," + id + "," + email + "," + Salary +"RS"+'\n';
    }


}

