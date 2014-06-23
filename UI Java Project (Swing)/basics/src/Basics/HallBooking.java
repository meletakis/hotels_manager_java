/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

/**
 *
 * @author giannis
 */
public class HallBooking {

    Hall h;
    private int peoplePerHall;
    private boolean soft_drinks;
    private boolean light_meal;
    private boolean full_meal;

    public HallBooking(Hall h, int peoplePerHall, boolean soft_drinks, boolean light_meal, boolean full_meal) {
        this.h = h;
        this.peoplePerHall = peoplePerHall;
        this.soft_drinks = soft_drinks;
        this.light_meal = light_meal;
        this.full_meal = full_meal;
    }


   

    public double getTotalCost() {
        double Cost = this.h.getPricePerPerson();
        ControlGui c = new ControlGui();

        if ( this.soft_drinks ){
            Cost += c.soft_drinks;
        }

        if ( this.full_meal  ){
            Cost += c.full_meal;
        }

        if ( this.light_meal ){
            Cost += c.light_meal;
        }


        return  Cost*peoplePerHall;
    }

    public boolean isFull_meal() {
        return full_meal;
    }

    public boolean isLight_meal() {
        return light_meal;
    }

    public boolean isSoft_drinks() {
        return soft_drinks;
    }

    public int getPeoplePerHall() {
        return peoplePerHall;
    }

    

    


}
