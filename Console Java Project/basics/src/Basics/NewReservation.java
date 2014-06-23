/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author giannis
 */
public class NewReservation {
    int choice;

    public NewReservation( ArrayList < Hall > Halls , ArrayList < Room > Rooms  , ArrayList < RoomReservation > RoomsR , ArrayList < HallReservation > HallsR) {



        System.out.println("********NEW RESERVATION*******");
                System.out.println("INSERT CHOICE: \n" +
                        "1: FOR SUITE RESERVATION \n" +
                        "2: FOR ROOM  RESERVATION \n" +
                        "3: FOR HALL  RESERVATION \n" );
                Scanner Input = new Scanner( System.in);
                try
                {
                        choice = Input.nextInt();
                }catch (NumberFormatException e)
                {
                        System.out.println("ERROR INPUT");
                }

                switch (choice)
                {

                    case 1:
                    {
                        NewSuiteReservation( Rooms , RoomsR);
                        break;
                    }
                    case 2:
                    {
                        NewRoomReservation(Rooms , RoomsR);
                        break;
                    }
                    case 3:
                    {
                        NewHallReservation(Halls , HallsR);
                        break;
                    }
                    default:
                    {
                        System.out.println("ERROR INPUT ");
                        break;
                    }

                }
    }


    public static void NewSuiteReservation ( ArrayList < Room > Rooms , ArrayList < RoomReservation > RoomsR)
    {
         SuiteReservation Sr = Control.readSuiteReservation(Rooms);
         
         if( Sr.getName()== null)
         {
             System.out.println("****ERROR IN SUITE RESRVATION****");
         }
         else
         {
            System.out.println("****SUCCESFULL SUITE RESRVATION****");
            RoomsR.add(Sr);
         }

    }

    public static void NewRoomReservation( ArrayList <Room > Rooms , ArrayList < RoomReservation > RoomsR )
    {
        StandardRoomReservation SRR = Control.readRoomReservation(Rooms);
        
        if( SRR.getName()== null)
         {
             System.out.println("****ERROR IN SUITE RESRVATION****");
         }
         else
         {
               System.out.println("****SUCCESFULL SUITE RESRVATION****");
               RoomsR.add(SRR);
         }
    }

    public static void NewHallReservation ( ArrayList < Hall > Halls , ArrayList < HallReservation > HallsR)
    {

        HallReservation HR = Control.readHallReservation(Halls);
        if ( HR.getTotalCost() != 0)
        {
            HallsR.add(HR);
            System.out.println("\nTHE TOTAL COST OF RESERVATION IS : " + HR.getTotalCost() );
        }
        System.out.println("****SUCCESFULL HALL RESRVATION****");
        
    }


}
