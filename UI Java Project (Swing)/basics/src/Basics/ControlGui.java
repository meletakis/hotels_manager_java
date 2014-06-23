/* giannis meletakis
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

import GUI.Global;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;



/**
 *
 * @author giannis
 */
public class ControlGui {

    public int pool = 50;
    public int jacuzi = 30;
    public int extra_tv = 10;
    public int internet = 5;
    public int soft_drinks = 5;
    public int light_meal = 12;
    public int full_meal = 30;




    private static int YEAR;
    private static int DAY_OF_YEAR;

public static int substractDays(GregorianCalendar gc1,GregorianCalendar gc2){

    int days1=0;
    int days2=0;
    int maxYear = Math.max(gc1.get(Calendar.YEAR),gc2.get(Calendar.YEAR));

    GregorianCalendar gctmp = (GregorianCalendar) gc1.clone();
    for(int f = gctmp.get(Calendar.YEAR); f<maxYear; f++)
    {
        days1 +=gctmp.getActualMaximum(Calendar.DAY_OF_YEAR);
        gctmp.add(Calendar.YEAR, 1);

    }

    gctmp = (GregorianCalendar) gc2.clone();
    for (int f = gctmp.get(Calendar.YEAR); f< maxYear; f++)
    {
        days2 +=gctmp.getActualMaximum(Calendar.DAY_OF_YEAR);
        gctmp.add(Calendar.YEAR, 1);

    }

    days1 += gc1.get(Calendar.DAY_OF_YEAR) - 1;
    days2 += gc2.get(Calendar.DAY_OF_YEAR) - 1;

    return (days1 - days2);



}//////////////////////////////////////////////////////////////////////////////////////
    public static HallReservation readHallReservation( String Name ,String Id ,int NumOfPersons,
            GregorianCalendar Date , ArrayList < Hall > Halls,boolean soft_drinks , boolean  full_meal , boolean light_meal ){
        
        boolean temp =false;
        ArrayList <HallBooking> halls = new ArrayList < HallBooking > ();
        int temp_i=0;
        for(int i=0; i < 1; i++)
        {
                  
                 

                  for ( int j = 0; j < Halls.size() ; j ++)
                  {
                         if ( Halls.get(j).getSnum() >= NumOfPersons &&  Halls.get(j).reserved.equals("n") )
                         {

                                 Halls.get(j).reserved = "y";
                                 temp = true;
                                 HallBooking hb = new HallBooking ( Halls.get(j) , NumOfPersons , soft_drinks , light_meal , full_meal );
                                 halls.add(hb);
                                 temp_i = j;
                                 j = Halls.size();//end of loop j



                          }
                 }

                  if (!temp)
                  {

                      Halls.get(temp_i).reserved ="n";
                      return new HallReservation("", "", Date, halls);

                  }

        }
         return new HallReservation(Name, Id, Date, halls);
        

    }












//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public static SuiteReservation readSuiteReservation (  String Name , String id,
        int numOfSuites , int numOfBeds,
        GregorianCalendar date_in , GregorianCalendar date_out ,ArrayList < Room > Suites,
        boolean pool,boolean internet , boolean jacuzzi , boolean tv)
{
    boolean temp = false;
    ArrayList < RoomBooking> RoomTable = new ArrayList < RoomBooking > ();
    ArrayList <Integer>  temp_i = new ArrayList <Integer>();



        for ( int i = 0; i <numOfSuites ; i++)
        {
            temp = false;


            for ( int j = 0; j <Suites.size(); j ++)
            {

                if ( Suites.get(j).bednumber == numOfBeds   )
                {
                    if ( (Suites.get(j).type.equals("suite")) && (Suites.get(j).reserved.equals("n")) )
                    {
                            temp = true;
                            Suites.get(j).reserved="y   ";
                            SuiteBooking SB = new SuiteBooking(internet , jacuzzi , tv ,  pool ,Suites.get(j) , Suites.get(j).getBednumber() );
                            RoomTable.add(SB);
                            temp_i.add(j);//krataei tis thesei twn dwmatiwn pou exei simiwsei ws "y" se periptwsi pou den oloklirwthei
                        // h kratisi na tis xanagurisei se "n" gt den exoun kleistei ta dwmatia
                             j = Suites.size();//end of loop j
                    }


                }


            }// end for j



            if(!temp)
            {
                for( i =0;i<temp_i.size();i++)
                {
                        Suites.get(temp_i.get(i)).setReserved("n");
                }
                return new  SuiteReservation("", null,  date_in,  date_out, RoomTable);
            }

        }

          
                        return new  SuiteReservation(Name, id,  date_in,  date_out, RoomTable);
                    

      



}

///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////






public static StandardRoom readStandardRoom(int Roomnum , int RoomBedsNum , double cost)
{

    return new StandardRoom (Roomnum  , RoomBedsNum , cost , "n" , "room" );

}////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////

public static StandardRoomReservation readRoomReservation ( String Name,String customer_id,
        int num,int numofBeds,
        GregorianCalendar start_date, GregorianCalendar end_date, ArrayList < Room > SRooms)
{
   
    
    boolean temp = false;
    ArrayList < RoomBooking> RoomTable = new ArrayList < RoomBooking > ();
    ArrayList <Integer>  temp_i = new ArrayList <Integer>();

   

    

        for ( int i = 0; i <num ; i++)
        {
            
            temp = false;

            for ( int j = 0; j <SRooms.size(); j ++)
            {
                if ( SRooms.get(j).bednumber == numofBeds   )
                {
                    if( (SRooms.get(j).reserved.equals("n") ) &&  (SRooms.get(j).type.equals("room")))
                    {

                        temp = true;
                        SRooms.get(j).reserved = "y";
                        RoomTable.add( new StandardRoomBooking(SRooms.get(j) , SRooms.get(j).getBasicCost() , SRooms.get(j).getBednumber()) );
                        temp_i.add(j);//krataei tis thesei twn dwmatiwn pou exei simiwsei ws "y" se periptwsi pou den oloklirwthei
                        // h kratisi na tis xanagurisei se "n" gt den exoun kleistei ta dwmatia
                        j = SRooms.size();//end of loop j
                    }


                }
                

                        
            }// end for j
            if (!temp)
                {
                    for( i =0;i<temp_i.size();i++)
                    {
                        SRooms.get(temp_i.get(i)).setReserved("n");
                    }
                    return new  StandardRoomReservation("", null,  start_date,  end_date, RoomTable);


                }

            

        }

        return new  StandardRoomReservation(Name, customer_id,  start_date,  end_date, RoomTable);
 



    

}





/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}