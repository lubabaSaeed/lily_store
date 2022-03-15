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
public class Womens_F extends Lily_Fashion{
    private int size;
    private double price;
    public Womens_F(String name, String id, String Type, double price,int size) {
    super(name, id, Type);
    this.size = size;
    this.price = price;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    } 

    @Override
    public String toString() {
  return  this.getName() +" " + this.getId()+","+this.getType()+ "," +size +","+ price +"RS\n";
    }}
