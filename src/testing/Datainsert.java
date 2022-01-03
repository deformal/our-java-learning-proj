package testing;
import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;


public class Datainsert {
    Connection conn;
    public void Datainserted() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=rajnish&password=rajnish@123");

            Scanner namer = new Scanner(System.in);
            System.out.println("enter firstname");
            String fn = namer.nextLine();
            System.out.println("enter lastname");
            String ln = namer.nextLine();
            System.out.println("phela naam" + " " + fn + " " + "dusra naam" + " " + ln);
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO MEJ () VALUES(?,?)");
            pstm.setString(1,fn);
            pstm.setString(2,ln);
            pstm.executeUpdate();
            System.out.println("list uptodate");
            PreparedStatement stmt=conn.prepareStatement("select * from mej");
            ResultSet result = stmt.executeQuery();
            System.out.println(result +" records inserted");

            while (result.next()){

                System.out.println("firstname"+ " " + result.getString("firstname"));
                System.out.println("lastname"+ " " + result.getString("lastname"));

             }
        }catch (SQLException ex){
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }

    }

}
