/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infocollector;

import java.io.Serializable;

/**
 *
 * @author Mattis
 */
public class Dish implements Serializable{
    private String dishName;
    private String dishDescription;
    private String dishPrice;
    
    public Dish(){
        
    }
    
    public Dish(String dishName, String dishDescription, String dishPrice){
        this.dishName = dishName;
        this.dishDescription = dishDescription;
        this.dishPrice = dishPrice;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public String getDishName() {
        return dishName;
    }

    public String getDishPrice() {
        return dishPrice;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setDishPrice(String dishPrice) {
        this.dishPrice = dishPrice;
    }
    
    
}
