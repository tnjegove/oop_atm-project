/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopatm;
import javax.swing.SwingUtilities;

/**
 *
 * @author Tadija
 */
public class GUIATM {
    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run () {
                ATMLoginForm login = new ATMLoginForm();
                login.setVisible(true);
            }
        
        });
    
    }
    
}
