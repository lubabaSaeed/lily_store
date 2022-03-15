/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lily_store_oop;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Lily_Store {
   private String Name;
  private  int iD;
  private ArrayList <Employee> employee;
  private ArrayList <Designers> designers;
  private ArrayList <Lily_Cosmetics> Cosmetics;
  private ArrayList <Lily_Fashion> Fashion;
 
    public Lily_Store(String Name, int iD, ArrayList<Employee> employee, ArrayList<Designers> designers, ArrayList<Lily_Cosmetics> Cosmetics, ArrayList<Lily_Fashion> Fashion) {
        this.Name = Name;
        this.iD = iD;
        this.employee = employee;
        this.designers = designers;
        this.Cosmetics = Cosmetics;
        this.Fashion = Fashion;
       
    }
public static void printLilyInfo(){
 System.out.println("****Welcome to LILY STORE****");
 System.out.println("We wish you a pleasant journey inside our world");
 System.out.println("LILY  has two parts ;\n*department of cosmetics and department of fashion .\n*department of fashion has to  consists of two section, one for women and one for fabulous girls.\n* We have a special department for LILY staff that includes :\n~the Designers section (where designers receive a distinction bonus)\n~LILY employees section ^_^");
    System.out.println("~~~~~~~~~~~~~~~~~~~");
}
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }

    public ArrayList<Designers> getDesigners() {
        return designers;
    }

    public void setDesigners(ArrayList<Designers> designers) {
        this.designers = designers;
    }

    public ArrayList<Lily_Cosmetics> getCosmetics() {
        return Cosmetics;
    }

    public void setCosmetics(ArrayList<Lily_Cosmetics> Cosmetics) {
        this.Cosmetics = Cosmetics;
    }

    public ArrayList<Lily_Fashion> getFashion() {
        return Fashion;
    }

    public void setFashion(ArrayList<Lily_Fashion> Fashion) {
        this.Fashion = Fashion;
    }

    @Override
    public String toString() {
        return Name + ", iD=" + iD + "\n\n************LILY STAFF***********\n"+" \n Employee :\n" + employee + "\n Designers :\n" + designers +"\n\n**********LILY COSMETICS**********\n"+ "\n"+ Cosmetics +"\n\n**********LILY Fashion************\n"+ Fashion;
    }}


  
  
