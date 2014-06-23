/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import Basics.*;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author giannis
 */
public class Global {

    public ArrayList <Hall> halls = new ArrayList <Hall>();
    public  ArrayList <Room> rooms = new ArrayList <Room>();
    public ArrayList <HallReservation> hallReservationsT = new ArrayList <HallReservation>();
    public ArrayList <RoomReservation> roomReservation = new ArrayList <RoomReservation>();

    public void FileIn() throws IOException
    {
          Control_Files CF = new Control_Files();
          // diavazei apo ta arxei ta stoixeia kai ta eisagei stous pinakes tou antikeimenou Gloabal!

         halls = CF.readHallsFromFiles("halls.txt");
         rooms = CF.readRoomsFromFile("rooms.txt");
         hallReservationsT = CF.readHallReservationsFromFile("hallReservations.txt", halls);
         roomReservation = CF.readRoomReservationFromFile("roomReservations.txt", rooms);
    }


    public void FileOut() throws IOException{

        Control_Files CF = new Control_Files();
        //grafei ta stoixeia sta arxeia!!!

        CF.writeRoomsToFile("rooms.txt", rooms);
        CF.writeHallsToFile("halls.txt", halls);
        CF.writeRoomReservationsToFile("roomReservations.txt", roomReservation);
        CF.writeHallReservationsToFile("hallReservations.txt", hallReservationsT);



    }




}
