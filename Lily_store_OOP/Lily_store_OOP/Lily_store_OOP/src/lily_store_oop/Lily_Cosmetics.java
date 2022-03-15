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
public class Lily_Cosmetics {
  private String name;
  private String id;
  private String Type;
  private double price;
  private static int cQuantitiy;

    public Lily_Cosmetics(String name, String id, String Type, double price) {
        this.name = name;
        this.id = id;
        this.Type = Type;
        this.price = price;
         cQuantitiy++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return Type;
    }

    public double getPrice() {
        return price;
    }

    public static int getcQuantitiy() {
        return cQuantitiy;
    }

    @Override
    public String toString() {
        return   name + "," + id + "," + Type + ", " + price +"RS"+'\n';
    }  
}
