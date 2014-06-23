/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author giannis
 */
public class NewRoom {
    private int choice;

    public NewRoom( ArrayList < Room > Rooms , ArrayList < Hall > Halls ) {

                System.out.println("********NEW ROOM/SUITE/HALL*******");
                System.out.println("INSERT CHOICE: \n" +
                        "1: FOR NEW SUITE \n" +
                        "2: FOR NEW ROOM \n" +
                        "3: FOR NEW HALL \n" );
                Scanner Input = new Scanner( System.in);
                try
                {
                        choice = Input.nextInt();
                }catch (NumberFormatException e)
                {
                        System.out.println("ERROR INPUT");
                }

                switch (choice)
                {

                    case 1:
                    {
                        NewSuite( Rooms);
                        break;
                    }
                    case 2:
                    {
                        NewRoom(Rooms);
                        break;
                    }
                    case 3:
                    {
                        NewHall(Halls);
                        break;
                    }
                    default:
                    {
                        System.out.println("ERROR INPUT ");
                        break;
                    }

                }

    }

    public static void NewSuite ( ArrayList < Room > Suites)
    {
        boolean temp ;
        Suite s;
        do
        {
                temp = true;
                s = Control.readSuite();
                for ( int i = 0; i < Suites.size(); i ++)
                {
                    if ( Suites.get(i).getRoomnumber() == s.getRoomnumber() )
                    {
                        System.out.println("SUITE NUMBER  " + s.getRoomnumber() +" IS ALREADY EXIST\n" +
                                "INPUT NEW SUITE\n");
                        temp = false;
                        i = Suites.size();
                    }
                }

        }while ( !temp );


            Suites.add(s);

    }

    public static void NewRoom ( ArrayList < Room > Rooms)
    {
        boolean temp ;
        StandardRoom Sr;
        do
        {
                temp = true;
                Sr= Control.readStandardRoom();
                for ( int i = 0; i < Rooms.size(); i ++)
                {
                    if ( Rooms.get(i).getRoomnumber() == Sr.getRoomnumber() )
                    {
                        System.out.println("ROOM NUMBER  " + Sr.getRoomnumber() +" IS ALREADY EXIST\n" +
                                "INPUT NEW ROOM\n");
                        temp = false;
                        i = Rooms.size();
                    }
                }

        }while ( !temp );


            Rooms.add(Sr);

    }

    public static void NewHall ( ArrayList < Hall > Halls)
    {
        boolean temp ;
        Hall h;
        do
        {
                temp = true;
                h= Control.readHall();
                for ( int i = 0; i < Halls.size(); i ++)
                {
                    if ( Halls.get(i).getHallnum() == h.getHallnum() )
                    {
                        System.out.println("\n\nHALL NUMBER  " + h.getHallnum() +" IS ALREADY EXIST\n" +
                                "INSERT NEW HALL\n");
                        temp = false;
                        i = Halls.size();
                    }
                }

        }while ( !temp );


            Halls.add(h);

    }



}
