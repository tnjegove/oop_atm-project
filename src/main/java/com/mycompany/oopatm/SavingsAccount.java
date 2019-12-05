/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopatm;

/**
 *
 * @author cjmos
 */
public class SavingsAccount extends Accounts{
    private float interest;
    //private xxx timelimit  data type for time limit on deposit???
    //private xxx link  data type for connection to current account???
    public SavingsAccount(String accNo,String accHolder,String joinDate,double balance, String userName, char[] userPass, float interest){
        super(accNo, accHolder, joinDate, balance, userName, userPass);
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
}
