/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author giannis
 */
public class DeleteReservation {
    String name;
    private boolean temp = false;

    public DeleteReservation( ArrayList < RoomReservation > RoomsR , ArrayList < HallReservation > HallsR) {

        Scanner Input = new Scanner ( System.in);
        System.out.println("*****DELETE RESERVATION****");
        System.out.println("INSERT CLIENTS NAME");
        name = Input.nextLine();

        System.out.println("INSERT DATE(YYYY MM DD)");
         GregorianCalendar date = new GregorianCalendar( Input.nextInt(), Input.nextInt(), Input.nextInt() );

         temp = CheckRoomReservations( name , date , RoomsR);
         if (!temp)
         {
            temp = CheckHallReservations( name , date , HallsR);
         }

         if (!temp)
         {
             System.out.println("THERE IS NO RESERVATION FOR CLIENT " +name  + " IN :" + date.get(Calendar.DAY_OF_MONTH)
                     +"/" + date.get(Calendar.MONTH) +"/" + date.get(Calendar.YEAR));
         }


    }


    public static boolean CheckRoomReservations ( String name  , GregorianCalendar date , ArrayList < RoomReservation > Roomsr )
    {
        boolean temp = false;
        for ( int i = 0; i < Roomsr.size(); i++)
        {
            if ( Roomsr.get(i).getName().equals(name) )
            {
                if ( Control.substractDays(Roomsr.get(i).getDate_in(), date) == 0 )
                {
                    
                    for ( int j = 0; j < Roomsr.get(i).TempTable.size() ; j++)
                    {
                        Roomsr.get(i).TempTable.get(j).getR().reserved = "n";

                    }

                    Roomsr.remove(Roomsr.get(i));
                    System.out.println("THE RESERVATION HAS BEEN REMOVED");
                    temp = true;
                }

            }
        }

        return temp;

    }


    public static boolean CheckHallReservations ( String name  , GregorianCalendar date , ArrayList < HallReservation > Hallsr )
    {
        boolean temp = false;
        for ( int i = 0; i < Hallsr.size(); i++)
        {
            if ( Hallsr.get(i).getCompanyName().equals(name) )
            {
               
                if ( Control.substractDays(Hallsr.get(i).getDate_in(), date) == 0)
                {

                    for ( int j = 0; j < Hallsr.get(i).getTable().size() ; j++)
                    {
                        Hallsr.get(i).getTable().get(j).h.reserved = "n";
                    }

                    Hallsr.remove(Hallsr.get(i));
                    System.out.println("THE RESERVATION HAS BEEN REMOVED");
                    temp = true;

                }

            }
        }

        return temp;

    }



}
