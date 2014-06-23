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

    public Hall(){
        
    }
    
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

    public String toString()
    {
        return "HALL NUMBER : " +hallnum +" SEATS : " +snum+" PRICE/SEAT : "+pricePerPerson;
    }

    public void setHallnum(int hallnum) {
        this.hallnum = hallnum;
    }

    public void setPricePerPerson(double pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }


    





    


}
