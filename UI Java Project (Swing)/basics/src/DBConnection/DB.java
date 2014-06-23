/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author giannis
 */
public class DB {




    Connection con;


    public void Connect()
    {
        try
        {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             String url ="jdbc:oracle:thin:@//83.212.240.15:1521/orcl";
             con = DriverManager.getConnection(url,"it20803", "it20803");



        }catch ( Exception e)
        {
                e.printStackTrace();// print all errors

        }

    }


     public void DiscConnect()
    {
        try
        {
            con.close();
        }catch ( Exception e)
        {
            e.printStackTrace();
        }

     }

     public boolean CheckRoom ( int roomnumber) throws SQLException
     {
            Statement stm =  con.createStatement();
            String query = "SELECT * FROM Rooms where ROOMNUMBER = "+roomnumber+" ";
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){}
 
            if (rs.getRow() == 0 )
            {
                System.out.println("YPARXEI HDH DWMATIO");
                return true;
            }

            return false;

     }
    public void InsertRoom(int roomnumber, int bedsnumber , double cost , String type , String reserved) throws SQLException
    {

            Statement stm =  con.createStatement();
            String query = "INSERT INTO Rooms values ("+ roomnumber +","+bedsnumber+", "+cost
                    +",'"+type +"' , '"+reserved +"'   ) ";
           // System.out.println(query);
            stm.executeUpdate(query);
            

    }

    

}
