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
public class Transaction {
    private int credit;
    private int debit;
    private int balance;
    private String date;
    
    public Transaction(){
        
    }
    public Transaction(int credit, int debit, int balance, String date) {
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
        this.date = date;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    

}
