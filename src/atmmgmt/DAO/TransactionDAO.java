/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atmmgmt.DAO;

import atmmgmt.dbutil.DBConnection;
import atmmgmt.pojo.Transaction;
import atmmgmt.pojo.UserProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shubham Rathore
 */
public class TransactionDAO {
    public static int withdraw(int debit) throws SQLException
    {
        java.util.Date utilDate = new java.util.Date(System.currentTimeMillis());
        java.sql.Date sqlDate = new java.sql.Date (utilDate.getTime());
        Connection conn=DBConnection.getConnection();
        int oldBalance=UserProfile.getBalance();
        if(oldBalance<debit){
            return -1;
        }
        int newBalance=oldBalance-debit;
        PreparedStatement ps=conn.prepareStatement("insert into transaction (accno,debit,balance,dates) values(?,?,?,?)");
        ps.setLong(1,UserProfile.getAccNo());
        ps.setInt(2, debit);
        ps.setInt(3, newBalance);
        ps.setDate(4, sqlDate);
        int result= ps.executeUpdate();
        
        PreparedStatement pss=conn.prepareStatement("update users set balance=? where accno=?");
        pss.setInt(1, newBalance);
        pss.setLong(2, UserProfile.getAccNo());
        int r=pss.executeUpdate();
      
       return result+r;
        
    }
    
    public static int deposit(int money) throws SQLException
    {
        java.util.Date utilDate = new java.util.Date(System.currentTimeMillis());
        java.sql.Date sqlDate = new java.sql.Date (utilDate.getTime());
        int totalMoney=UserProfile.getBalance()+money;
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into transaction (accno,credit,balance,dates) values(?,?,?,?)");
        ps.setLong(1, UserProfile.getAccNo());
        ps.setInt(2, money);
        ps.setInt(3, totalMoney);
        ps.setDate(4, sqlDate);
       int result = ps.executeUpdate();
       
        PreparedStatement pss=conn.prepareStatement("update users set balance=? where accno=?");
        pss.setInt(1, totalMoney);
        pss.setLong(2, UserProfile.getAccNo());
        int r=pss.executeUpdate();
      
        return result+r;
        
    }
    
    public static ArrayList<Transaction> miniStatement() throws SQLException
    {
        
        ArrayList<Transaction> miniList=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        long acno=UserProfile.getAccNo();
        String sql="select * from transaction where accno="+acno;
        ResultSet rs= st.executeQuery(sql);
       while(rs.next()){
           Transaction tb=new Transaction();
           tb.setDate(rs.getDate(5)+"");
           tb.setCredit(rs.getInt(2));
           tb.setDebit(rs.getInt(3));
           tb.setBalance(rs.getInt(4));
           miniList.add(tb);
       }
       return miniList;  
    }
    
} 

