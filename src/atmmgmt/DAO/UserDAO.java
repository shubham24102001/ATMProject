/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atmmgmt.DAO;

import atmmgmt.dbutil.DBConnection;
import atmmgmt.pojo.User;
import atmmgmt.pojo.UserProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Shubham Rathore
 */
public class UserDAO {
    
    public static boolean LogIn(long accNo,int pin)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where accno=? AND pin=?");
        ps.setLong(1, accNo);
        ps.setInt(2, pin);
        ResultSet rs= ps.executeQuery();
    
        while(rs.next()){
            String name=rs.getString(2);
           UserProfile.setUserName(name);
           UserProfile.setBalance(rs.getInt(6));
           UserProfile.setAccNo(accNo);
           return true;
       }
       return false;  
        
    }
    
    public static boolean pinChange(int currPin,int newPin)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set pin=? where accno=? and pin=?");
        ps.setInt(1, newPin);
        ps.setLong(2, UserProfile.getAccNo());
        ps.setInt(3, currPin);
        int result=ps.executeUpdate();
        return result==1;
    }
    
    public static boolean forgetPin(long AccNo,int pin)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set pin=? where accno=?");   
        ps.setInt(1, pin);
        ps.setLong(2, AccNo);
        int result=ps.executeUpdate();
        return result==1;
    }
    public static boolean register(User u)throws SQLException
    {
      Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?,?,?,?)");
       ps.setLong(1, u.getAccNo());
       ps.setString(2,u.getName());
       ps.setInt(3, u.getPin());
       ps.setInt(4, u.getAge());
       ps.setLong(5, u.getMobileNo());
       ps.setInt(6, u.getBalance());
       int result=ps.executeUpdate();
       return result==1;
    }

}
