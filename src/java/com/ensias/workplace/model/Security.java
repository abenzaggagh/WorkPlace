/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensias.workplace.model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Security {

 
    public Security() {
        
    }
    
    public static String MD5(String input) { 
        
        try {
            
            MessageDigest md = MessageDigest.getInstance("MD5"); 

            byte[] messageDigest = md.digest(input.getBytes()); 
  
            BigInteger no = new BigInteger(1, messageDigest); 
  
            String hashtext = no.toString(16); 
            
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            
            return hashtext;
            
        } catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    }
    
    public String Reverse(String input) {
        return null;
    }
    
 
}