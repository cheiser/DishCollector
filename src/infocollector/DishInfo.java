/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infocollector;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mattis
 * this will hold the information about a specific type of dish
 */
public class DishInfo implements Serializable{
    private String dishType;
    private ArrayList<Dish> dishInfo;
    
    public DishInfo(){
        
    }
    
    public DishInfo(String dishType){
        this.dishType = dishType;
        this.dishInfo = new ArrayList<Dish>();
    }
    

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }

    public ArrayList<Dish> getDishInfo() {
        return dishInfo;
    }
    
    public void addDish(Dish dish){
        this.dishInfo.add(dish);
    }
    
    public Iterator<Dish> getIterator(){
        return dishInfo.iterator();
    }   
    
}
