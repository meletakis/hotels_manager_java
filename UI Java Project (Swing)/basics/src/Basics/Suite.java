/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

/**
 *
 * @author giannis
 */
public class Suite extends Room{


 private double basicCost;
 protected String reserved;
 protected String type;

    public Suite(){
        super(1,1,"n","suite");
    }

    public Suite(int roomnumber  , int bednumber , double basicCost , String reserved , String type ){
        super(roomnumber ,  bednumber , reserved , type );
        this.basicCost = basicCost;
    }

    public double getBasicCost() {
        return basicCost;
    }

    public String toString()
    {
        return "SUITE NUMBER : " + roomnumber +" BEDS: "+ bednumber +" COST :  "+ basicCost;
    }

    public String toString_FILES()
    {
         return "s;"  + roomnumber + ";" + bednumber + ";" + basicCost ;
    }

    public String getType() {
        return type;
    }

    public String getReserved() {
        return reserved;
    }

    public void setBasicCost(double basicCost) {
        this.basicCost = basicCost;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBednumber(int bednumber) {
        this.bednumber = bednumber;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }





    
    



}
