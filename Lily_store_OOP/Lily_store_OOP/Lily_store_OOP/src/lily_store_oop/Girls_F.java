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
public class Girls_F extends Lily_Fashion {
  private String age;
  private double price;

  public Girls_F(String name,String Type, String id, double price,String age) {
    super(name, id, Type);
    this.age = age;
    this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
    @Override
public String toString() {
  return  this.getName() + this.getType()+ "," + this.getId() + "," +age +","+ price +"RS\n";
}}
