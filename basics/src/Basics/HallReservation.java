/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author giannis
 */
public class HallReservation {

   private String companyName;
   private String company_id;
   private GregorianCalendar date_in;
   private ArrayList < HallBooking > Table;

    public HallReservation(String companyName, String company_id, GregorianCalendar date_in, ArrayList<HallBooking> Table) {
        this.companyName = companyName;
        this.company_id = company_id;
        this.date_in = date_in;
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






}
