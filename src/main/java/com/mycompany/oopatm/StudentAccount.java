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
public class StudentAccount extends CurrentAccount implements Benefits{
    private String benefits;
    public StudentAccount () {
        super("","","",0,"",new char[] {},"");    
    }
    
    public StudentAccount(String accNo,String accHolder,String joinDate,double balance, String userName, char[] userPass, String userPin, String benefits) {
        super(accNo, accHolder,joinDate,balance,userName,userPass,userPin);
        this.benefits=benefits;
    }
    
    @Override
    public void implementBenefits() {
        
    }
    
}
