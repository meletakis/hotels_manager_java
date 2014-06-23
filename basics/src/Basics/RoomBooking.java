/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

/**
 *
 * @author giannis
 */
public abstract class RoomBooking {

    private Room r;
    public abstract double getBookingCost();
    public abstract boolean roomBookingIsOk();

    public RoomBooking(Room r) {
        this.r = r;
    }

    public Room getR() {
        return r;
    }

    public abstract String toString();

    
}
