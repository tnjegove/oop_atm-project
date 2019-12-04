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
    public CurrentAccount(String accNo,String accHolder,String joinDate,double balance, String userName, char[] userPass, float interest) {
        super(accNo, accHolder, joinDate, balance, userName, userPass);
    }
    
}
