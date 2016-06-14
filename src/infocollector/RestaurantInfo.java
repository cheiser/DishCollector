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
 * this will hold information about a specific restaurant such as name, location and specific dish info
 */
public class RestaurantInfo implements Serializable{
    private String restaurantName;
    private String location;
    private ArrayList<DishInfo> dishInfos;
    
    public RestaurantInfo(){
        this.dishInfos = new ArrayList<DishInfo>();
    }
    
    public RestaurantInfo(String restaurantName, String location){
        this();
        this.restaurantName = restaurantName;
        this.location = location;
    }

    public ArrayList<DishInfo> getDishInfos() {
        return dishInfos;
    }
    
    public Iterator<DishInfo> getIteratorDishes(){
        return dishInfos.iterator();
    }

    public String getLocation() {
        return location;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setDishInfos(ArrayList<DishInfo> dishInfos) {
        this.dishInfos = dishInfos;
    }
    
    public void addDishInfo(DishInfo temp){
        dishInfos.add(temp);
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    
    
}
