/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

/**
 *
 * @author giannis
 */
public class StandardRoom extends Room{

    private double priceperPerson;
    protected String reserved;
    protected String type;
    
    public StandardRoom(){
        super(1,1,"n","room");
    }

    public StandardRoom(int roomnumber, int bednumber  ,double priceperPerson , String reserved , String type ){
        super(roomnumber, bednumber , reserved , type );
        this.priceperPerson = priceperPerson;
    }

    public double getBasicCost() {
        return priceperPerson;
    }



    public String toString()
    {
        return "ROOM NUMBER : " + roomnumber +"  BEDS : "+ bednumber +"  COST :  "+ priceperPerson;
    }

    public String toString_FILES()
    {
        if (bednumber == 2)
            return "d;" + roomnumber + ";" + bednumber + ";" + priceperPerson ;
        else if(bednumber == 3)
            return "t;" + roomnumber + ";" + bednumber + ";" + priceperPerson ;
        else
            return "x;" + roomnumber + ";" + bednumber + ";" + priceperPerson ;
    }

    public String getReserved() {
        return reserved;
    }

    public String getType() {
        return type;
    }

    public void setPriceperPerson(double priceperPerson) {
        this.priceperPerson = priceperPerson;
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
