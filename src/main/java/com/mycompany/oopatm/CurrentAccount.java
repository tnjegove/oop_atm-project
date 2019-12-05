/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopatm;

/**
 *
 * @author x19112700
 */
public class CurrentAccount extends Accounts{
    private String userPin;
    public CurrentAccount() {
        super("","","",0,"", new char [] {'a'});        
        this.userPin = "";
    }
    public CurrentAccount(String accNo,String accHolder,String joinDate,double balance, String userName, char[] userPass, String userPin) {
        super(accNo, accHolder, joinDate, balance, userName, userPass);
    
        this.userPin = userPin;
    }

    public String getUserPin() {
        return userPin;
    }

    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }
    
}
