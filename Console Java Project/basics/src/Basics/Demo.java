/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author giannis
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {



                 Control_Files cf = new Control_Files();

                 //diabazei apo to arxeio kai bazei ta dwmatia ston Rooms
                 ArrayList < Room > Rooms = cf.readRoomsFromFile("rooms.txt");

                 //diabazei apo to arxeio kai bazei tis aithouses sto Halls
                 ArrayList <Hall> Halls = cf.readHallsFromFiles("halls.txt");



                 // diabazei apo to arxeio tis kratiseis aithousws kai tis bazei ston HallsR
                 ArrayList < HallReservation > HallsR = cf.readHallReservationsFromFile("hallReservations.txt" ,Halls );
                 

                 //diabazei apo to arxeio tis kratiseis dwmatiwn kai tis bazei ston RoomsR
                 ArrayList < RoomReservation > RoomsR = cf.readRoomReservationFromFile("roomReservations.txt" , Rooms);
                  
                 




                 Scanner input = new Scanner ( System.in);
                 int choice =0;
                 do
                 {
                         System.out.println("INSERT CHOICE:\n" +
                         " 1: INSERT A NEW RESERVATION\n" +
                         " 2: DELETE A RESERVATION\n" +
                         " 3: INPUT NEW ROOM/HALL/SUITE\n" +
                         " 0: FOR EXIT ");
                         try
                         {
                         choice = input.nextInt();
                         }catch (Exception e)
                         {
                          System.out.println("ERROR INSERTT");
                         }

                         switch (choice)
                         {
                                 case 1:
                                 {
                                     NewReservation NR = new NewReservation ( Halls , Rooms ,RoomsR , HallsR );

                                     break;
                                 }
                                 case 2:
                                 {
                                     DeleteReservation DR = new DeleteReservation ( RoomsR , HallsR);
                                     break;
                                 }
                                 case 3:
                                 {
                                     NewRoom NR= new NewRoom(Rooms , Halls);
                                     break;
                                 }
                                 case 0:
                                 {
                                     System.out.println("*****EXIT*****");
                                     break;
                                 }
                                 default:
                                 {
                                     System.out.println("ERROR INSERT ");
                                     break;
                                 }
                         }


                 }while(choice != 0);

 






                 // grafei oles tis kratiseis ( tis kainouries kai autes pou pire apo to arxei0
                 cf.writeHallReservationsToFile("hallReservations.txt", HallsR);

                 // grafei oles tis kratiseis ( tis kainouries kai autes pou pire apo to arxeio
                 cf.writeRoomReservationsToFile("roomReservations.txt", RoomsR);

                 //grafei ta dwmatia kai ta halls
                 cf.writeHallsToFile("halls.txt", Halls);
                 cf.writeRoomsToFile("rooms.txt", Rooms);

         
               





                  

         
         
       

       


       


        
        // TODO code application logic here
    }

}
