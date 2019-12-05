/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopatm;

import java.io.Serializable;

/**
 *
 * @author Tadija
 */
public class Accounts implements Serializable{
    private String accNo;
    private String accHolder;
    private String joinDate;
    private double balance;
    private String userName;
    private char[] userPass;
    private String AccountType;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char[] getUserPass() {
        return userPass;
    }

    public void setUserPass(char[] userPass) {
        this.userPass = userPass;
    }
      
    
    //Constructor
    public Accounts(String accNo,String accHolder,String joinDate,double balance, String userName, char[] userPass){
        this.accNo=accNo;
        this.accHolder=accHolder;
        this.joinDate=joinDate;
        this.balance=balance;
        this.userName=userName;
        this.userPass=userPass;        
    }//end constructor
    
    //Withdraw method
    public void withdraw(double amount){
        this.balance=this.balance -amount;
    }//end wihdraw method
    
    //Deposit method
    public void deposit(double amount){
         this.balance=this.balance + amount;
    }//end deposit method
    
    //Transfer method
    public void transfer(Accounts a,double amount){
        this.withdraw(amount);
        a.deposit(amount);
    }//end transfer method
    
    @Override
    public String toString(){
        return this.accNo;
        
    }
            
    
}
