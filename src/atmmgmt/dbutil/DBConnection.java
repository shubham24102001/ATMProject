/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atmmgmt.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Shubham Rathore
 */
public class DBConnection {
    private static Connection conn;
    static
    {
        try
        {
         conn=DriverManager.getConnection("jdbc:oracle:thin:@//shubham:1521/xe","atmproject","123");
        JOptionPane.showMessageDialog(null,"connection opened successfully","Success",JOptionPane.INFORMATION_MESSAGE);
         
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(0);
        }
     }
    
    public static Connection getConnection()
    {
        return conn;
    }
    public static void closeConnection()
    {
       try
       {
           conn.close();
         JOptionPane.showMessageDialog(null,"connection closed successfully","Success",JOptionPane.INFORMATION_MESSAGE);
       }
       catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"closing Error","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(0);
        }
    }

}
