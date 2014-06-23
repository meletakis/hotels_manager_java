/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

/**
 *
 * @author giannis
 */
public abstract class Room {

     protected int roomnumber;
     protected int bednumber;
     protected String reserved;
     protected String type;


    public Room(int roomnumber ,  int bednumber , String reserved , String type) {
        this.roomnumber = roomnumber;
        this.bednumber = bednumber;
        this.reserved = reserved;
        this.type = type;


    }

    public int getBednumber() {
        return bednumber;
    }

    public int getRoomnumber() {
        return roomnumber;
    }



    public abstract String toString();
    public abstract double getBasicCost();

    

    


    

}
