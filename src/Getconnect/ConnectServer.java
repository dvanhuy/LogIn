
package Getconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectServer {
    public static Connection getConnection(){
        String url="jdbc:sqlserver://DESKTOP-101QR58\\SQLEXPRESS:1433;databaseName=ConnectJava";
        String userName="sa";
        String password="12345";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url,userName,password); 
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Ket noi loi");
            System.out.println(e);
            return null;
        }
    }
}
