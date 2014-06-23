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
public class SuiteReservation extends RoomReservation{

    private  String Name;
    private String Id;
    GregorianCalendar  date_in ;
    GregorianCalendar  date_out;

    public SuiteReservation(String Name, String Id, GregorianCalendar date_in, GregorianCalendar  date_out, ArrayList<RoomBooking> TempTable) {
        super( Name , Id , date_in , date_out , TempTable );
     
    }

   public double getTotalCost()
    {
      

        double TotalCost =0;
        int days = Control.substractDays(date_out, date_in);
        for ( int i = 0; i <= TempTable.size() ; i ++)
        {

            TotalCost += TempTable.get(i).getBookingCost() * days;

        }
        return TotalCost;
    }



  



}
