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

    public StandardRoom(int roomnumber, int bednumber  ,double priceperPerson , String reserved , String type ){
        super(roomnumber, bednumber , reserved , type );
        this.priceperPerson = priceperPerson;
    }

    public double getBasicCost() {
        return priceperPerson;
    }

    public String toString()
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

    

}
