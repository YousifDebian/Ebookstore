package ebookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

//import java.util.logging.Level;
//import java.util.logging.Logger;

public class DBConnection {
    
    public static Connection con;
    public static void ConnectToSQL(){ // Connect to SQL
    
        try {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=ebookstore;encrypt=true;trustServerCertificate=true;";
        String username = "CS";
        String password = "1234";
        con = DriverManager.getConnection(url,username,password);
        System.out.println("CONNECTED");
        } catch (SQLException ex){
            //Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error CONNECTION");
        }
    }
    public static void Close () { // Disconnect from SQL
        try { con.close();} 
        catch (SQLException ex) { System.out.println(ex.getMessage()); }
    }
    public static boolean Execute (String sqlStatement) { //To Manage DB ( INSERT, UPDATE, DELETE, ...... )
    
        try {
            //ConnectToSQL();
            Statement s = con.createStatement();
            s.execute(sqlStatement);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
    public static ResultSet GetData(String query) { //For SEARCH Process ONLY
        try {
            Statement s = con.createStatement();
            return s.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}