/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopatm;

/**
 *
 * @author Tadija
 */
public class Accounts {
    private String accNo;
    private String accHolder;
    private String joinDate;
    private double balance;
    
    //Constructor
    public Accounts(String accNo,String accHolder,String joinDate,double balance){
        this.accNo=accNo;
        this.accHolder=accHolder;
        this.joinDate=joinDate;
        this.balance=balance;
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
