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
public class User {
    private long accNo;
    private String name;
    private int age;
    private int pin;
    private long mobileNo;
    private int balance;
    
    public User()
    {
        
    }

    public User(long accNo, String name, int age, int pin, long mobileNo,int balance) {
        this.accNo = accNo;
        this.name = name;
        this.age = age;
        this.pin = pin;
        this.mobileNo = mobileNo;
        this.balance=balance;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
