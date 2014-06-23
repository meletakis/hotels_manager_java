/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

/**
 *
 * @author giannis
 */
public class Hall {

    private int hallnum;
    private int snum;
    private double pricePerPerson;
    public String reserved;
    
    public Hall(int hallnum, int snum,double pricePerPerson , String reserved )
    {
        this.hallnum = hallnum;
        this.snum = snum;
        this.pricePerPerson = pricePerPerson;
        this.reserved = reserved;


    }


    public double getPricePerPerson() {
        return pricePerPerson;
    }

    public int getHallnum() {
        return hallnum;
    }

    public int getSnum() {
        return snum;
    }







    


}
