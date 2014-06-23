/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

/**
 *
 * @author giannis
 */
public class StandardRoomBooking extends RoomBooking{


     private double  TotalCost;
     Room standardRoom;
     int peoplePerRoom;

    public StandardRoomBooking(Room sr , double TotalCost , int peoplePerRoom) {
        super(sr);
        this.TotalCost = TotalCost;
        this.peoplePerRoom = peoplePerRoom;
    }

    public double getBookingCost() {
        return TotalCost;
    }

    public boolean roomBookingIsOk ()
    {
        if ( this.standardRoom.getBednumber() >= this.peoplePerRoom )
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public String toString()
    {
        return null;
    }

}
