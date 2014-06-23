/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

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
public class Control {

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


public static Hall readHall()
{
    Scanner s = new Scanner(System.in);

    System.out.println("INSERT NUMBER OF HALL");
    int NumHall = s.nextInt();

    System.out.println("INSERT NUMBER OF SEATS");
    int NumSeats = s.nextInt();

    System.out.println("INSERT BASIC COST PER PERSON FOR HALL");
    double Cost  = s.nextDouble();

    return new Hall( NumHall, NumSeats , Cost , "n" );



}//////////////////////////////////////////////////////////////////////////////////////////

public static HallBooking readHallBooking( Hall h , int NumOfPersons){
    
  boolean soft_drinks = false;
  boolean full_meal = false;
  boolean light_meal = false;
  
  Scanner Sn = new Scanner( System.in);
  String ans;
  double TotalCost = h.getPricePerPerson();

   do
    {
        System.out.println("EXTRA SERVICES?(  y or n )");
        ans=Sn.nextLine().trim().toLowerCase();

    }while ( ! ans.equals("y") && ! ans.equals("n") );

   if (ans.equals("y"))
   {

       do
       {
            System.out.println("SOFT DRINKS ? \t( y or  n )");
            ans=Sn.nextLine().trim().toLowerCase();

       }while ( ! ans.equals("y") && !ans.equals("n") );
       soft_drinks = ans.endsWith("y");


       do
       {
            System.out.println("FULL MEAL ? \t(y or  n )");
            ans=Sn.nextLine().trim().toLowerCase();

       }while ( ! ans.equals("y") && !ans.equals("n") );
       full_meal = ans.endsWith("y");



       do
       {
            System.out.println("LIGHT MEAL ? \t(y or  n )");
            ans=Sn.nextLine().trim().toLowerCase();

       }while ( ! ans.equals("y") && !ans.equals("n") );
       light_meal = ans.endsWith("y");
         

         
   }



return new HallBooking ( h , NumOfPersons , soft_drinks , light_meal , full_meal );



  }/////////////////////////////////////////////////////////////////////////////////////////

    public static HallReservation readHallReservation( ArrayList < Hall > Halls ){
        Hall h;
        Scanner sc = new Scanner(System.in);
        System.out.println("INFORMATION OF RESERVATION");
        System.out.println("INSERT COMPANYS NAME");
        String companyName = sc.nextLine();
        System.out.println("INSERT COMPANYS ID");
        String afm = sc.nextLine();
        System.out.println("INSERT DATE OF RESERVATION ( YYYY - MM - DD ) ");
        GregorianCalendar reserve_date = new GregorianCalendar(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("INSERT NUMBER OF HALLS");
        int numhalls = sc.nextInt();
        sc.nextLine();
        boolean temp = false;


        ArrayList <HallBooking> halls = new ArrayList < HallBooking > ();
        for(int i=0; i < numhalls; i++)
        {
                  
                  System.out.println("HOW MANY PEOPLE?? ( For hall number " + (i+1) +" )");
                  int NumOfPersons = sc.nextInt();

                  for ( int j = 0; j < Halls.size() ; j ++)
                  {
                         if ( Halls.get(j).getSnum() >= NumOfPersons &&  Halls.get(j).reserved.equals("n") )
                         {

                                 Halls.get(j).reserved = "y";
                                 temp = true;
                                 HallBooking hb = readHallBooking( Halls.get(j) ,NumOfPersons);
                                 halls.add(hb);
                                 j = Halls.size();



                          }
                 }

                  if (!temp)
                  {
                      System.out.println("*****THERE IS NO HALL FOR RESERVATION******");
                      i = numhalls;
                  }

        }
         return new HallReservation(companyName, afm, reserve_date, halls);
        

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public static Suite readSuite()
{
    Scanner s = new Scanner ( System.in);

    System.out.println("INSERT NUMBER OF SUITE");
    int Suitenum = s.nextInt();

    System.out.println("INSERT NUMBER OF BEDS");
    int SuiteBedsNum = s.nextInt();

    System.out.println("INSERT COST OF SUITE");
    double cost = s.nextDouble();



    return new Suite (Suitenum , SuiteBedsNum , cost , "n" , "suite" );

}/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static SuiteBooking readSuiteBooking( Room suite )
{
   
    String ans;
    boolean internet = false;
    boolean jacuzi = false;
    boolean pool = false;
    boolean extra_tv = false;

    Scanner Sn = new Scanner( System.in);
    do
    {
        System.out.println("EXTRA SERVICES?(  y or n )");
        ans=Sn.nextLine().trim().toLowerCase();

    }while ( ! ans.equals("y") && !ans.equals("n") );
    
             if (ans.equals("y"))
             {
                 Scanner Scan = new Scanner( System.in);

                     do
                     {

                          System.out.println("JACUZI ? \t(  y or  n )");
                          ans=Scan.nextLine().trim().toLowerCase();

                     }while ( ! ans.equals("y") && !ans.equals("n") );
                      jacuzi = ans.equals("y");


                    do
                     {

                          System.out.println("POOL ? \t(  y or  n )");
                          ans=Scan.nextLine().trim().toLowerCase();

                     }while ( ! ans.equals("y") && !ans.equals("n") );
                      pool = ans.equals("y");



                     do
                     {

                          System.out.println("INTERNET ? \t(  y or  n )");
                          ans=Scan.nextLine().trim().toLowerCase();

                     }while ( ! ans.equals("y") && !ans.equals("n") );
                      internet = ans.equals("y");

                     do
                     {

                          System.out.println("EXTRA TV ? \t(  y or  n )");
                          ans=Scan.nextLine().trim().toLowerCase();

                     }while ( ! ans.equals("y") && !ans.equals("n") );
                     extra_tv = ans.equals("y");

             }




    return new SuiteBooking(internet , jacuzi , extra_tv ,  pool ,suite , suite.getBednumber() );
}//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public static SuiteReservation readSuiteReservation ( ArrayList < Room > Suites)
{
    String Name;
    String customer_id;
    String  ans;
    GregorianCalendar start_date;
    GregorianCalendar end_date;
    ArrayList < RoomBooking> RoomTable = new ArrayList < RoomBooking > ();
    boolean temp = false;

    Scanner New = new Scanner( System.in);

    System.out.println("INSERT CLIENTS NAME ");
    Name = New.nextLine();

    System.out.println("INSERT CLIENTS ID");
    customer_id = New.nextLine();
    do
    {

            System.out.println("INSERT DATE (START RESERVATION - YYYY MM DD ) ");
            start_date = new GregorianCalendar( New.nextInt(), New.nextInt(), New.nextInt() );

            System.out.println("INSERT DATE (END RESERVATION - YYYY MM DD ) ");
            end_date = new GregorianCalendar( New.nextInt(), New.nextInt(), New.nextInt() );

            if  ( (substractDays( end_date, start_date) ) < 0 )
            {
                System.out.println("*******ERROR DATE******");
            }


    }
    while( (substractDays( end_date, start_date) ) < 0 );

     System.out.println("date" + Control.substractDays(end_date, start_date));


        System.out.println("INSERT NUMBER OF RESERVATIONS");
        int num = New.nextInt();
        String choice;

        for ( int i = 0; i <num ; i++)
        {


            System.out.println( "HOW MANY PEOPLE FOR RESERVATION SUITE NUMBER " + (i+1));
            int numofBeds = New.nextInt();
             temp = false;
          




            for ( int j = 0; j <Suites.size(); j ++)
            {

                if ( Suites.get(j).bednumber == numofBeds   )
                {
                    if (Suites.get(j).type.equals("suite") && Suites.get(j).reserved.equals("n") )
                    {
                        
                            temp = true;
                            Suites.get(j).reserved = "y";
                            SuiteBooking SB = readSuiteBooking( Suites.get(j));
                            RoomTable.add(SB);
                            j = Suites.size();
                    }


                }


            }// end for j

           if ( !temp )
            {

                    do
                    {
                                System.out.println("THERE IS NO  SUITE WITH " + numofBeds + " BEDS FOR RESERVATION");
                                System.out.println("CHECK FOR SUITE WITH MORE BEDS??");
                                ans = New.nextLine().trim().toLowerCase();

                    }while ( ! ans.equals("y") && ! ans.equals("n") );

                    if ( ans.equals("y"))
                    {

                            for ( int j = 0; j <Suites.size(); j ++)
                            {
                                if ( Suites.get(j).bednumber > numofBeds && Suites.get(j).reserved.equals("n") )
                                {
                                    temp = true;
                                    Suites.get(j).reserved = "y";
                                    RoomTable.add( readSuiteBooking( Suites.get(j)));
                                    j = Suites.size();


                                }


                            }// end for j

                    }// end if
                    else if ( ans.equals("n"))
                    {
                        return new  SuiteReservation(null, null,  start_date,  end_date, RoomTable);
                    }

            }// end if







            
                         
        }

            return new  SuiteReservation(Name, customer_id,  start_date,  end_date, RoomTable);



}

///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////






public static StandardRoom readStandardRoom()
{
    Scanner s = new Scanner ( System.in);

    System.out.println("INSERT NUMBER OF ROOM");
    int Roomnum = s.nextInt();

    int RoomBedsNum;
    do
    {
        System.out.println("INSERT NUMBER OF BEDS ( 2 or 3 )");
        RoomBedsNum = s.nextInt();
    }while ( RoomBedsNum != 2 && RoomBedsNum != 3);

    System.out.println("INSERT BASIC COST OF ROOM");
    double cost = s.nextDouble();



    return new StandardRoom (Roomnum  , RoomBedsNum , cost , "n" , "room" );

}////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////

public static StandardRoomReservation readRoomReservation ( ArrayList < Room > SRooms)
{
    String Name;
    String customer_id;
    String ans;
    GregorianCalendar start_date;
    GregorianCalendar end_date;
    ArrayList < RoomBooking> RoomTable = new ArrayList < RoomBooking > ();
    boolean temp = false;

    Scanner New = new Scanner( System.in);

    System.out.println("INSERT CLIENTS NAME ");
    Name = New.nextLine();

    System.out.println("INSERT CLIENTS ID");
    customer_id = New.nextLine();

    do
    {

            System.out.println("INSERT DATE (START RESERVATION - YYYY MM DD ) ");
            start_date = new GregorianCalendar( New.nextInt(), New.nextInt(), New.nextInt() );

            System.out.println("INSERT DATE (END RESERVATION - YYYY MM DD ) ");
            end_date = new GregorianCalendar( New.nextInt(), New.nextInt(), New.nextInt() );

            if  ( (substractDays( end_date, start_date) ) < 0  )
            {
                System.out.println("*******ERROR DATE******");
            }


            }
    while( (substractDays( end_date, start_date) ) < 0 );
     

        System.out.println("INSERT NUMBER OF RESERVATIONS");
        int num = New.nextInt();
        String choice;

        for ( int i = 0; i <num ; i++)
        {
            System.out.println( "HOW MANY BEDS FOR RESERVATION NUMBER " + (i+1 ));
            int numofBeds = New.nextInt();
            temp = false;


            for ( int j = 0; j <SRooms.size(); j ++)
            {
                if ( SRooms.get(j).bednumber == numofBeds   )
                {
                    if(SRooms.get(j).reserved.equals("n") && SRooms.get(j).type.equals("room"))
                    {


                        temp = true;
                        SRooms.get(j).reserved = "y";
                        RoomTable.add( new StandardRoomBooking(SRooms.get(j) , SRooms.get(j).getBasicCost() , SRooms.get(j).getBednumber()) );
                        j = SRooms.size();
                    }


                }

                        
            }// end for j

            if ( !temp && numofBeds == 3)
            {
                System.out.println("THERE IS NO ROOM WITH 3 BEDS FOR RESERVATION");

            }
            else if ( !temp && numofBeds == 2)
            {

                    do
                    {
                                System.out.println("THERE IS NO ROOM WITH 2 BEDS FOR RESERVATION");
                                System.out.println("CHECK FOR ROOMS WITH MORE BEDS??");
                                ans = New.nextLine().trim().toLowerCase();

                    }while ( ! ans.equals("y") && ! ans.equals("n") );

                    if ( ans.equals("y"))
                    {

                            for ( int j = 0; j <SRooms.size(); j ++)
                            {
                                if ( SRooms.get(j).bednumber > numofBeds && SRooms.get(j).reserved.equals("n") )
                                {
                                    temp = true;
                                    SRooms.get(j).reserved = "y";
                                     RoomTable.add( new StandardRoomBooking(SRooms.get(j) , SRooms.get(j).getBasicCost() , SRooms.get(j).getBednumber()) );
                                    j = SRooms.size();
                                }// end if

                            }  // end for j

                    }// end if
                    else if ( ans.equals("n"))
                    {
                        return new  StandardRoomReservation(null, null,  start_date,  end_date, RoomTable);
                    }

            }// end else if

        }// end for i
        
            return new  StandardRoomReservation(Name, customer_id,  start_date,  end_date, RoomTable);

    

}





/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}