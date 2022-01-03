package testing;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class SQLCONNECTION {
    public  void connect (){
            Connection conn;
            try{
                conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=rajnish&password=rajnish@123" );
                PreparedStatement stmt=conn.prepareStatement("select * from mej");
                ResultSet result = stmt.executeQuery();

                while (result.next()){
                    System.out.println("firstname"+ " " + result.getString("firstname"));
                    System.out.println("lastname"+ " " + result.getString("lastname"));
                }
            }
            catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }}
}