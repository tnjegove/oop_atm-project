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
public class CollegeStudentAccount extends StudentAccount{
    private String StudentId;
    public CollegeStudentAccount(String accNo,String accHolder,String joinDate,double balance, String userName, char[] userPass, String userPin, String benefits,String StudentId){
        super(accNo, accHolder, joinDate, balance, userName, userPass, userPin, benefits);
        this.StudentId = StudentId;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }
    
}
