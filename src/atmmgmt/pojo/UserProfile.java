/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atmmgmt.pojo;

/**
 *
 * @author Shubham Rathore
 */
public class UserProfile {
    private static long accNo;
    private static String userName;
    private static int balance;      

    public static long getAccNo() {
        return accNo;
    }

    public static void setAccNo(long accNo) {
        UserProfile.accNo = accNo;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        UserProfile.userName = userName;
    }

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        UserProfile.balance = balance;
    }
     

}
