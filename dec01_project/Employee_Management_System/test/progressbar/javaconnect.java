package progressbar;

import login.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    static Connection conn = null;
    PreparedStatement pst;
    ResultSet rs;
    
    public static Connection ConnectDb(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:F:\\Tutorial\\Employee_Management\\Employee_Management_System\\ems.db");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public static void main(String[] args) {
        ConnectDb();
        System.out.println("::::Connected::::");
    }
}
