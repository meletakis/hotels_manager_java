/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

/**
 *
 * @author giannis
 */
public class SuiteBooking extends RoomBooking{

   private boolean internet;
   private boolean jacuzi;
   private boolean extra_tv;
   private boolean pool;
  // Suite suite ;
   int peoplePerRoom;

    public SuiteBooking(boolean internet, boolean jacuzi, boolean extra_tv, boolean pool, Room suite, int peoplePerRoom) {
        super( suite );
        this.internet = internet;
        this.jacuzi = jacuzi;
        this.extra_tv = extra_tv;
        this.pool = pool;
        this.peoplePerRoom = peoplePerRoom;
    }



 

    public double getBookingCost() {
        double Cost = this.r.getBasicCost();
        ControlGui c = new ControlGui();

        if ( this.extra_tv){
            Cost += c.extra_tv;
        }

        if ( this.jacuzi){
            Cost += c.jacuzi;
        }

        if ( this.internet){
            Cost += c.internet;
        }

        if ( this.pool){
            Cost += c.pool;
        }


        return  Cost;
    }

    public boolean roomBookingIsOk()
    {
        if ( this.r.getBednumber() >= this.peoplePerRoom )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String toString()
    {
        
        String temp = ";";
        if (pool)
        {
            temp = temp + "y;";
        }
        else
        {
            temp = temp + "n;";
        }
        if (jacuzi)
        {
            temp = temp + "y;";
        }
        else
        {
            temp = temp + "n;";
        }
        if (extra_tv)
        {
            temp = temp + "y;";
        }
        else
        {
            temp = temp + "n;";
        }
        if (internet)
        {
            temp = temp + "y";
        }
        else
        {
            temp = temp + "n";
        }

        return temp;
    }




    
}
