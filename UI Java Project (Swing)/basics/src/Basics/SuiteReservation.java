/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author giannis
 */
public class SuiteReservation extends RoomReservation{

    

    public SuiteReservation(String Name, String Id, GregorianCalendar date_in, GregorianCalendar  date_out, ArrayList<RoomBooking> TempTable) {
        super( Name , Id , date_in , date_out , TempTable );
     
    }

   public double getTotalCost()
    {
      

        double TotalCost =0;
        int days = ControlGui.substractDays(date_out, date_in);
        for ( int i = 0; i < TempTable.size() ; i ++)
        {

            TotalCost += TempTable.get(i).getBookingCost() * days;

        }
        return TotalCost;
    }



   public String toString()
     {
         return "NAME : "+Name + " ID : " + Id+ " DATE IN : "+date_in.get(Calendar.DAY_OF_MONTH) +"/" +date_in.get(Calendar.MONTH) +"/"
                 +date_in.get(Calendar.YEAR) ;
     }

  



}
