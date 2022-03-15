/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lily_store_oop;
import java.util.*;
import java.util.Collections;

/**
 *
 * @author pc
 */
public class Lily_store_OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   ArrayList<Lily_Cosmetics> Cosmetics = new ArrayList<>(3);
   Cosmetics.add(new Lily_Cosmetics("Lipstick","001","Matte",134.25));
   Cosmetics.add(new Lily_Cosmetics("Lipstick","002","Gloss",125));
   Cosmetics.add(new Lily_Cosmetics("foundation","003","Liquid",201.5));
   ArrayList<Lily_Fashion> fashion = new ArrayList<>();
   fashion.add(new Girls_F ("Girls","011","dress",234,"2 year"));
   fashion.add(new Girls_F ("Girls","022","jumpsuit",200.75,"6-9 month"));
   fashion.add(new Womens_F("Womens","033","dress",201.5,14));
   ArrayList<Designers> designers = new ArrayList<>();
   designers.add(new Designers("Ahmad","1222","ahmad@gmil.com",8000.9));
   designers.add(new Designers("Aisha","1233","Aisha@gmil.com",9000));
   ArrayList<Employee> employee = new ArrayList<>();
   employee.add(new Employee("Ali","1244","Ali@gmil.com",4000.9));
   employee.add(new Employee("Ibrahim","1255","Ibrahim@gmil.com",5000));
   Lily_Store lily=  new Lily_Store("LILY STORE",438018566,employee,designers,Cosmetics,fashion);
   Lily_Store.printLilyInfo();
   System.out.println(lily);
        
        




    }
    
}
