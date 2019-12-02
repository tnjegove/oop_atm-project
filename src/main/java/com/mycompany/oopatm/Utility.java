/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopatm;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Tadija
 */
public class Utility {
    public static ArrayList<Accounts> readFile(String fileName){
        
        ArrayList<Accounts>accounts = new ArrayList<>();
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                String[]currentAccount=line.split("<>");
                String accNo=currentAccount[0];
                String accHolder=currentAccount[1];
                String joinDate=currentAccount[2];
                double balance=Double.parseDouble(currentAccount[3]);
                char[] temp = {'a','s'};//fix this
                Accounts acc = new Accounts(accNo,accHolder,joinDate,balance,"",temp);//fix this
                accounts.add(acc);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return accounts;
    }
    
}
