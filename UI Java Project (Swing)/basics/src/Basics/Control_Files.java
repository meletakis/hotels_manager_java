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
import java.util.StringTokenizer;

/**
 *
 * @author giannis
 */
public class Control_Files {


    public static Room findRoom( ArrayList < Room > allRooms , int roomnum)
    {
        Room r = null;
        for ( int i =0 ; i < allRooms.size(); i++)
        {
            if ( allRooms.get(i).getRoomnumber() == roomnum)
            {   allRooms.get(i).setReserved("y");
                return allRooms.get(i);
            }
        }

        return r;
    }

    public static Hall findHall ( ArrayList < Hall > allHalls , int Hall_numb)
    {
        Hall h = null;
        for ( int i =0 ; i < allHalls.size(); i ++)
        {
            if ( allHalls.get(i).getHallnum() == Hall_numb)
                return allHalls.get(i);
        }

        return h;
    }



public  ArrayList < Hall > readHallsFromFiles ( String filename) throws IOException
{/// TREXEI SWSTAAAAAAAAAAAAAAAAA!!!!!!!!!!!!!
    int Hall_numb = 0;
    double cost = 0;
    int Seats_numb = 0;



    ArrayList < Hall  > aithouses = new ArrayList < Hall  > ();
    String AuditoriumInfo;
    try
    {

             BufferedReader Bf = new BufferedReader  ( new FileReader(filename));

             AuditoriumInfo = Bf.readLine();
             while ( AuditoriumInfo != null )
             {

                        StringTokenizer st = new StringTokenizer( AuditoriumInfo , ";" );


                                int temp = st.countTokens();
                                for (int i =1;i<=temp;i++)
                                {

                                        String node = st.nextToken();

                                        switch (i)
                                         {
                                                case 1:
                                                {
                                                    try
                                                    {
                                                        Hall_numb = Integer.parseInt(node);

                                                    }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR OBJECT AT FILE" + filename );
                                                    }
                                                    break;
                                                }

                                                case 2:
                                                {
                                                    try
                                                    {
                                                        Seats_numb = Integer.parseInt(node);

                                                    }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR OBJECT AT FILE" + filename );
                                                    }
                                                    break;
                                                }

                                                case 3:
                                                {
                                                    try
                                                    {
                                                        cost = Double.parseDouble(node);


                                                    }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR OBJECT AT FILE" + filename );
                                                    }
                                                    break;
                                                }



                                           }

                                }

                        Hall Hall_temp = new Hall(Hall_numb,Seats_numb , cost , "n");
                        aithouses.add(Hall_temp);



                        AuditoriumInfo = Bf.readLine();




             }

    }
   catch(FileNotFoundException e)
    {
       System.out.println("File Error");

    }
String s;





    return aithouses;

}//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public ArrayList <Room >  readRoomsFromFile ( String filename ) throws IOException
{/// TREXEI SWSTAAAAAAAAAAA!!!!!!!!!!!!!!!!!!!!
   String type = null;
   int RoomNumber = 0;
   int BedsNumber  =0;
   double cost = 0;


   ArrayList <Room > RoomsArray = new ArrayList <Room>();


   String RoomsInfo;
    try
    {

             BufferedReader Bf = new BufferedReader  ( new FileReader(filename));

             RoomsInfo = Bf.readLine();
             while ( RoomsInfo != null )
             {

                        StringTokenizer st = new StringTokenizer( RoomsInfo , ";" );
                        int temp = st.countTokens();



                                for (int i =1;i<= temp;i++)
                                {

                                        String node = st.nextToken();

                                        switch (i)
                                         {
                                                case 1:
                                                {
                                                    type = node;
                                                    break;
                                                }



                                                case 2:
                                                {

                                                    try
                                                    {
                                                        RoomNumber= Integer.parseInt(node);

                                                    }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR OBJECT AT FILE" + filename );
                                                    }
                                                    break;


                                                }

                                                case 3:
                                                {
                                                    try
                                                    {
                                                        BedsNumber = Integer.parseInt(node);

                                                    }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR OBJECT AT FILE" + filename );
                                                    }
                                                    break;

                                                }

                                                case 4:
                                                {
                                                    try
                                                    {
                                                        cost = Double.parseDouble(node);

                                                    }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR OBJECT AT FILE" + filename );
                                                    }
                                                    break;

                                                }



                                           }

                                }

               if ( type.equals("s") )
               {
                   Suite S = new Suite (RoomNumber , BedsNumber ,cost , "n" , "suite");
                   RoomsArray.add(S);

               }
               else if (type.equals("d") || type.equals("t")  )
               {
                   StandardRoom SR = new StandardRoom ( RoomNumber, BedsNumber , cost , "n" , "room" );
                   RoomsArray.add(SR);

               }
               else
               {
                     System.out.println("Error File");
               }







                RoomsInfo = Bf.readLine();

             }

    }
   catch(FileNotFoundException e)
    {
       System.out.println("File Error");

    }








   return RoomsArray;

}



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void writeHallsToFile ( String filename , ArrayList <Hall> aithouses) throws IOException
{/// TREXEI SWSTAAAAAAAAAAAAaaaa!!!!!!!!!!!!!!!!!!!!!!
    try
    {
        PrintWriter Print =new PrintWriter(new BufferedWriter(new FileWriter(filename)));
        String temp;
        for ( int i =0;i<aithouses.size(); i ++)
        {

            temp = aithouses.get(i).getHallnum() + ";" + aithouses.get(i).getSnum() + ";" + aithouses.get(i).getPricePerPerson() ;
            Print.println(temp);


        }

         Print.close();


    }
    catch ( FileNotFoundException e)
    {
        System.out.println("File not found");
    }

}/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public void writeRoomsToFile ( String filename , ArrayList <Room> dwmatia) throws IOException
{/// TREXEI SWSTAAAAAAAaaaaaaaaaaaaaa!!!!!!!!!!!
    try
    {

        PrintWriter Print =new PrintWriter(new BufferedWriter(new FileWriter(filename)));
        String temp;
        for ( int i =0;i<dwmatia.size(); i ++)
        {
            Print.println(dwmatia.get(i).toString_FILES());

        }

         Print.close();


    }
    catch ( FileNotFoundException e)
    {
        System.out.println("File not found");
    }

}//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



public void writeRoomReservationsToFile( String filename , ArrayList < RoomReservation > kratiseisdwmatiwn) throws IOException
{

    boolean choice;
     try
    {
        PrintWriter Print =new PrintWriter(new BufferedWriter(new FileWriter(filename)));
        String temp;
        int Table_size = kratiseisdwmatiwn.size();
        for ( int i =0;i<Table_size;  i ++)
        {

            temp= "client;" + kratiseisdwmatiwn.get(i).getName()+ ";" + kratiseisdwmatiwn.get(i).getId();
            Print.println(temp);

            temp = "dates;" + kratiseisdwmatiwn.get(i).getDate_in().get(Calendar.DAY_OF_MONTH) + "/"
                   + kratiseisdwmatiwn.get(i).getDate_in().get(Calendar.MONTH) + "/"
                   + kratiseisdwmatiwn.get(i).getDate_in().get(Calendar.YEAR) +";"
                   +kratiseisdwmatiwn.get(i).getDate_out().get(Calendar.DAY_OF_MONTH) + "/"
                   +kratiseisdwmatiwn.get(i).getDate_out().get(Calendar.MONTH) + "/"
                   +kratiseisdwmatiwn.get(i).getDate_out().get(Calendar.YEAR);
            Print.println(temp);




           for ( int j = 0; j < kratiseisdwmatiwn.get(i).TempTable.size(); j ++)
           {

                    temp = "room;" + kratiseisdwmatiwn.get(i).TempTable.get(j).getR().getRoomnumber() +";"
                    + kratiseisdwmatiwn.get(i).TempTable.get(j).getR().getBednumber( ) ;
                    
                    if ( kratiseisdwmatiwn.get(i).TempTable.get(j).toString() == null )
                    {
                        Print.println(temp);
                    }
                    else
                    {
                            temp = temp + kratiseisdwmatiwn.get(i).TempTable.get(j).toString();
                            Print.println(temp);
                    }
                    
           }


                   

        }

         Print.close();


    }
    catch ( FileNotFoundException e)
    {
        System.out.println("File not found");
    }

}//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



public  ArrayList <RoomReservation >  readRoomReservationFromFile ( String filename  , ArrayList < Room > allRooms ) throws IOException
{
    String Name = null;
    String clients_id = null;
    String hasSuiteReservation = "n";
    String hasRoomReservation = "n";


    int Room_numb =0;
    int Beds_numb = 0;

    GregorianCalendar date_in = null;
    GregorianCalendar date_out = null;

    boolean jacuzi = false;
    boolean pool = false;
    boolean internet = false;
    boolean extra_tv = false;

    int day = 0;
    int month = 0;
    int year= 0;

    ArrayList < RoomReservation > ReservationTable = new ArrayList < RoomReservation > ();
    ArrayList < RoomBooking > RoomBookingTable = new ArrayList < RoomBooking > ();



    String RoomInfo = null;
    try
    {

             BufferedReader Bf = new BufferedReader  ( new FileReader(filename));
             RoomInfo = Bf.readLine();
             StringTokenizer st = new StringTokenizer( RoomInfo , ";" );
             int temp = st.countTokens();
             String node = st.nextToken();

             while ( RoomInfo != null )
             {




                  if (  node.equals("client"))
                  {

                         Name = st.nextToken();
                         clients_id = st.nextToken();

                        try
                        {
                            RoomInfo = Bf.readLine();
                            if ( RoomInfo != null)
                            {
                                st = new StringTokenizer( RoomInfo , ";" );
                                temp = st.countTokens();
                                node = st.nextToken();
                            }
                        }catch( Exception e)
                        {
                            System.out.println("ERORR:" + e);
                        }

                  }
                  else if ( node.equals("dates"))
                  {


                              try
                              {
                                         String datein = st.nextToken();

                                         StringTokenizer Date = new StringTokenizer(datein , "/");
                                         if ( Date.countTokens() != 3)
                                         {
                                             System.out.println("Error at date");
                                         }
                                         else
                                         {

                                                    try
                                                    {
                                                        day= Integer.parseInt(Date.nextToken());

                                                     }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR :" +e );
                                                    }

                                                    try
                                                    {
                                                         month= Integer.parseInt(Date.nextToken());

                                                     }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR :" +e );
                                                    }

                                                    try
                                                    {
                                                        year = Integer.parseInt(Date.nextToken());

                                                     }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR :" +e );
                                                    }


                                                    date_in= new GregorianCalendar( year , month , day );

                                         }


                                         String dateout = st.nextToken();


                                         Date = new StringTokenizer(dateout , "/");
                                         if ( Date.countTokens() != 3)
                                         {
                                             System.out.println("Error at date");
                                         }
                                         else
                                         {

                                                    try
                                                    {
                                                        day= Integer.parseInt(Date.nextToken());

                                                     }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR :" +e );
                                                    }

                                                    try
                                                    {
                                                         month= Integer.parseInt(Date.nextToken());

                                                     }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR :" +e );
                                                    }

                                                    try
                                                    {
                                                        year = Integer.parseInt(Date.nextToken());

                                                     }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR :" +e );
                                                    }


                                                    date_out= new GregorianCalendar( year , month , day );


                                        }

                              }catch (Exception e)
                              {
                                System.out.println("ERROR : " + e) ;
                              }


                         try
                         {
                                RoomInfo = Bf.readLine();
                                if ( RoomInfo != null)
                                {
                                    st = new StringTokenizer( RoomInfo , ";" );
                                    temp = st.countTokens();
                                    node = st.nextToken();

                                }

                        }catch( Exception e)
                        {
                            System.out.println("ERORR:" + e);
                        }

                 }
                  else if ( node.equals("room"))
                 {

                       hasSuiteReservation = "n";
                       hasRoomReservation = "n";

                     
                          do
                          {
                              
                                   try
                                   {
                                        Room_numb = Integer.parseInt(st.nextToken());

                                   }catch ( NumberFormatException e )
                                   {
                                       System.out.println("ERROR OBJECT AT FILE   " + filename );
                                   }

                                  try
                                   {
                                        Beds_numb = Integer.parseInt(st.nextToken());

                                   }catch ( NumberFormatException e )
                                   {
                                       System.out.println("ERROR OBJECT AT FILE " + filename );
                                   }

                                  if( st.hasMoreTokens())
                                  {
                                       if ( st.nextToken().equals("y")){
                                                 pool = true;
                                       }
                                       if ( st.nextToken().equals("y") ){
                                                jacuzi = true;
                                       }
                                       if(st.nextToken().equals("y")){
                                                  internet = true;
                                       }
                                       if(st.nextToken().equals("y")){
                                                  extra_tv = true;
                                       }

                                       Suite s = (Suite) findRoom( allRooms , Room_numb);
                                       SuiteBooking Sb = new SuiteBooking(internet , jacuzi , extra_tv , pool , s , Beds_numb);
                                       RoomBookingTable.add(Sb);
                                       hasSuiteReservation = "y";

                                      

                                  }
                                  else
                                  {
                                          StandardRoom Sr = ( StandardRoom ) findRoom ( allRooms , Room_numb);
                                          StandardRoomBooking SRB = new StandardRoomBooking(Sr , Sr.getBasicCost() , Beds_numb);
                                          RoomBookingTable.add(SRB);
                                          hasRoomReservation = "y";

                                         

                                  }


                                    try
                                    {


                                      RoomInfo = Bf.readLine();
                                      if( RoomInfo != null)
                                      {
                                              st = new StringTokenizer( RoomInfo , ";" );
                                              temp = st.countTokens();
                                              node = st.nextToken();

                                      }







                              }catch ( FileNotFoundException e)
                              {
                                  System.out.println("ERROR : " + e);
                              }

                          }while( node.equals("room") && RoomInfo != null );


                          if ( hasRoomReservation.equals("y"))
                          {
                                     ReservationTable.add(new StandardRoomReservation(Name , clients_id , date_in , date_out , RoomBookingTable));
                          }

                          if ( hasSuiteReservation.equals("y"))
                          {
                                    ReservationTable.add(new SuiteReservation(Name , clients_id , date_in , date_out , RoomBookingTable));
                          }

                       RoomBookingTable = new ArrayList < RoomBooking >();






                     }// end else

             }// end of while


    }// end of try
    catch( FileNotFoundException e)
    {
        System.out.println("ERROR : " + e);
    }

    return ReservationTable;
}



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



public void writeHallReservationsToFile ( String filename , ArrayList < HallReservation > kratiseisaithouswn ) throws IOException
{

    boolean choice;
    try
    {
        PrintWriter Print =new PrintWriter(new BufferedWriter(new FileWriter(filename)));
        String temp;
        for ( int i =0;i<kratiseisaithouswn.size(); i++)
        {

            temp= "client;" + kratiseisaithouswn.get(i).getCompanyName() + ";" + kratiseisaithouswn.get(i).getCompany_id() ;
            Print.println(temp);
           for ( int j = 0 ; j < kratiseisaithouswn.get(i).getTable().size(); j++)
           {


                    temp = "dates;" + kratiseisaithouswn.get(i).getDate_in().get( Calendar.DAY_OF_MONTH ) +"/"
                            + kratiseisaithouswn.get(i).getDate_in().get( Calendar.MONTH )+"/" +
                            kratiseisaithouswn.get(i).getDate_in().get( Calendar.YEAR ) +";"
                            +kratiseisaithouswn.get(i).getTable().get(j).h.getHallnum() + ";"
                            + kratiseisaithouswn.get(i).getTable().get(j).getPeoplePerHall()+ ";" ;
                    Print.print(temp);


                    if( kratiseisaithouswn.get(i).getTable().get(j).isSoft_drinks() ){
                       temp = "y;";
                    }else{
                        temp = "n;";
                    }
                    Print.print(temp);


                    if( kratiseisaithouswn.get(i).getTable().get(j).isLight_meal() ){
                       temp = "y;";
                    }else{
                        temp = "n;";
                    }
                    Print.print(temp);


                    if( kratiseisaithouswn.get(i).getTable().get(j).isFull_meal() ){
                       temp = "y;";
                    }else{
                        temp = "n;";
                    }
                    Print.println(temp);



           }





        }

         Print.close();


    }
    catch ( FileNotFoundException e)
    {
        System.out.println("File not found");
    }




}//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




public ArrayList <HallReservation > readHallReservationsFromFile ( String filename  , ArrayList < Hall > allHalls ) throws IOException
{
     String Name = null;
     String company_id = null;
    int Hall_numb =0;
    int S_numb = 0;
    GregorianCalendar date_in = null;
    boolean l_meal ;
    boolean f_meal ;
    boolean s_drinks ;
    int day = 0;
    int month = 0;
    int year= 0;

    ArrayList < HallReservation > kratiseisaithouswn = new ArrayList < HallReservation > ();
    ArrayList < HallBooking > pinakasaithouswn = new ArrayList < HallBooking >();



    String HallInfo = null;
    try
    {

             BufferedReader Bf = new BufferedReader  ( new FileReader(filename));
             HallInfo = Bf.readLine();
             StringTokenizer st = new StringTokenizer( HallInfo , ";" );
             int temp = st.countTokens();
             String node = st.nextToken();

             while ( HallInfo != null )
             {




                  if (  node.equals("client"))
                  {

                         Name = st.nextToken();
                         company_id = st.nextToken();

                        try
                        {
                            HallInfo = Bf.readLine();
                            if ( HallInfo != null)
                            {
                                st = new StringTokenizer( HallInfo , ";" );
                                temp = st.countTokens();
                                node = st.nextToken();
                            }
                        }catch( FileNotFoundException e)
                        {
                            System.out.println("ERORR:" + e);
                        }

                  }
                  else
                  {
                      do
                      {


                              try
                              {
                                         String date = st.nextToken();
                                         StringTokenizer Date = new StringTokenizer(date , "/");
                                         if ( Date.countTokens() != 3)
                                         {
                                             System.out.println("Error at date");
                                         }
                                         else
                                         {

                                                    try
                                                    {
                                                        day= Integer.parseInt(Date.nextToken());

                                                     }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR :" +e );
                                                    }

                                                    try
                                                    {
                                                         month= Integer.parseInt(Date.nextToken());

                                                     }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR :" +e );
                                                    }

                                                    try
                                                    {
                                                        year = Integer.parseInt(Date.nextToken());

                                                     }catch ( NumberFormatException e )
                                                    {
                                                        System.out.println("ERROR :" +e );
                                                    }


                                                    date_in= new GregorianCalendar( year , month , day );


                                        }
                              }catch (Exception e)
                              {
                                System.out.println("ERROR : " + e) ;
                              }
                               try
                               {
                                    Hall_numb = Integer.parseInt(st.nextToken());

                               }catch ( NumberFormatException e )
                               {
                                   System.out.println("ERROR OBJECT AT FILE" + filename );
                               }

                              try
                               {
                                    S_numb = Integer.parseInt(st.nextToken());

                               }catch ( NumberFormatException e )
                               {
                                   System.out.println("ERROR OBJECT AT FILE" + filename );
                               }


                              s_drinks = false;
                              l_meal = false;
                              f_meal = false;

                              if ( st.nextToken().equals("y")){
                                  s_drinks = true;
                              }
                              if ( st.nextToken().equals("y") ){
                                  l_meal = true;
                              }
                              if(st.nextToken().equals("y")){
                                  f_meal = true;
                              }




                              try
                              {


                                      HallInfo = Bf.readLine();
                                      if( HallInfo != null)
                                      {
                                              st = new StringTokenizer( HallInfo , ";" );
                                              temp = st.countTokens();
                                              node = st.nextToken();

                                      }


                                                    Hall h =  findHall( allHalls , Hall_numb );
                                                    h.reserved = "y";
                                                    HallBooking hb = new HallBooking(h ,S_numb ,  s_drinks , l_meal , f_meal);
                                                    pinakasaithouswn.add(hb);
                                                    






                              }catch ( FileNotFoundException e)
                              {
                                  System.out.println("ERROR : " + e);
                              }

                      }while ( node.equals("dates") && HallInfo != null);
                      kratiseisaithouswn.add(new HallReservation( Name , company_id , date_in ,pinakasaithouswn ) );
                      pinakasaithouswn = new ArrayList < HallBooking > ();





                  }// end of else



             }// end of while
    }
    catch( FileNotFoundException e)
    {
        System.out.println("ERROR : " + e);
    }

    return kratiseisaithouswn;

}/////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////


public static ArrayList < RoomReservation > readRoomReservationFromFiles ( String filename , ArrayList <Room > allRooms) throws FileNotFoundException
{
    ArrayList < RoomReservation >  roomRes = new ArrayList < RoomReservation > ();
    BufferedReader br;
    try
    {
        br = new BufferedReader ( new FileReader ( filename ));
        String line = br.readLine();
        RoomReservation r = null;
        String customer = null;
        String id= null;
        GregorianCalendar start = null;
        GregorianCalendar end = null;

        ArrayList < RoomBooking > bookings = new ArrayList < RoomBooking > ();

        while(line != null)
        {
            String tokens[] = line.split(";");
            if(tokens[0].equals("client"))
            {
                if ( r != null )
                {
                    r = new RoomReservation ( customer , id , start , end ,(RoomBooking[]) bookings.toArray() ) ;
                    roomRes.add(r);
                    customer = new String(tokens[1]);
                    id = new String (tokens[2]);
                    bookings = new ArrayList < RoomBooking > ();
                }
                else
                {
                   customer = new String(tokens[1]);
                    id = new String (tokens[2]);
                    bookings = new ArrayList < RoomBooking > ();
                }
             }
             else if ( tokens[0].equals("dates"))
             {

                 String startTokens[] = tokens[1].split("/");

                 int day = Integer.parseInt( startTokens[0]);
                 int month = Integer.parseInt( startTokens[1]);
                 int year = Integer.parseInt( startTokens[2]);

                 start = new GregorianCalendar ( year , month , day);

                 String endTokens[] = tokens[2].split("/");

                  day = Integer.parseInt( endTokens[0]);
                  month = Integer.parseInt( endTokens[1]);
                  year = Integer.parseInt( endTokens[2]);

                  end = new GregorianCalendar ( year , month , day);




            }
            else if ( tokens[0].equals("room"))
            {

                if ( tokens.length == 3)
                {
                    int roomnum = Integer.parseInt(tokens[1]);
                    int peopleperRoom = Integer.parseInt(tokens[2]);

                    StandardRoom rm = (StandardRoom) findRoom ( allRooms , roomnum);
                    StandardRoomBooking srb = new StandardRoomBooking (rm ,rm.getBasicCost() ,  peopleperRoom);
                    bookings.add(srb);

                }
                else if ( tokens.length == 7)
                {
                    int roomnum = Integer.parseInt(tokens[1]);
                    int peopleperRoom = Integer.parseInt(tokens[2]);
                    boolean pool = tokens[3].equals("y");
                    boolean jacuzi = tokens[4].equals("y");
                    boolean cabletv = tokens[5].equals("y");
                    boolean internet = tokens[6].equals("y");

                    Suite s = (Suite ) findRoom ( allRooms , peopleperRoom);
                    SuiteBooking sb = new SuiteBooking ( internet , jacuzi , cabletv , pool , s , peopleperRoom);
                    bookings.add(sb);

                }

            }
            else
            {
                throw new Exception ( "the starting token" + tokens[0] + "is error");
            }
            line = br.readLine();


        }
        br.close();


    }
    catch ( Exception ex)
    {
        System.out.println("ERROR " + ex);
    }


    return roomRes;
}




}// end of class File


