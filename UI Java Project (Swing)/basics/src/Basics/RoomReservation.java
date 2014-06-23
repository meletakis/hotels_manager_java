/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author giannis
 */
public  class RoomReservation {

    protected String Name;
    protected String Id;
    protected GregorianCalendar date_in;
    protected GregorianCalendar date_out;
    ArrayList < RoomBooking > TempTable;
 

    public RoomReservation(String Name, String Id, GregorianCalendar date_in, GregorianCalendar date_out, ArrayList<RoomBooking> TempTable) {
        this.Name = Name;
        this.Id = Id;
        this.date_in = date_in;
        this.date_out = date_out;
        this.TempTable = TempTable;
    }

    RoomReservation(String customer, String id, GregorianCalendar start, GregorianCalendar end, RoomBooking[] roomBooking) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public double getTotalCost()
    {


        double TotalCost =0;
        int days = ControlGui.substractDays(date_out, date_in);
        for ( int i = 0; i <= TempTable.size() ; i ++)
        {

            TotalCost += TempTable.get(i).getBookingCost() * days;

        }
        return TotalCost;
    }


  

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public GregorianCalendar getDate_in() {
        return date_in;
    }

    public GregorianCalendar getDate_out() {
        return date_out;
    }

    



}
