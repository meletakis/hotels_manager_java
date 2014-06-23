/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author giannis
 */
public class HallReservation {

   private String companyName;
   private String company_id;
   private GregorianCalendar date_in;
   private GregorianCalendar date_out;
   private ArrayList < HallBooking > Table;

    public HallReservation(String companyName, String company_id, GregorianCalendar date_in, ArrayList<HallBooking> Table) {
        this.companyName = companyName;
        this.company_id = company_id;
        this.date_in = date_in;
        this.date_out = date_out;
        this.Table = Table;
    }
    

    public ArrayList<HallBooking> getTable() {
        return Table;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompany_id() {
        return company_id;
    }

    public GregorianCalendar getDate_in() {
        return date_in;
    }

    public double getTotalCost()
    {
        double TotalCost =0;
        for ( int i = 0; i < Table.size() ; i ++)
        {

            TotalCost += Table.get(i).getTotalCost();

        }
        return TotalCost;
    }


    public String toString()
     {
         return "NAME : "+companyName + " ID : " + company_id+ " DATE IN : "+date_in.get(Calendar.DAY_OF_MONTH) +"/" +date_in.get(Calendar.MONTH) +"/"
                 +date_in.get(Calendar.YEAR) ;
     }

    public void setTable(ArrayList<HallBooking> Table) {
        this.Table = Table;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public void setDate_in(GregorianCalendar date_in) {
        this.date_in = date_in;
    }

    public void setDate_out(GregorianCalendar date_out) {
        this.date_out = date_out;
    }


    






}
