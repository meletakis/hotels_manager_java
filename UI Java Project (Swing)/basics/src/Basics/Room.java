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
     public String reserved;
     public String type;


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

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    


    public abstract String toString();
    public abstract String toString_FILES();
    public abstract double getBasicCost();

    

    


    

}
