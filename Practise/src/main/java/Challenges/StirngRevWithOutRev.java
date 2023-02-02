/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

/**
 *
 * @author Ameer
 */
public class StirngRevWithOutRev {
    
    public static void main(String[] args) {
        
        String s = "Java";
        String s2 = "";
        for(int i = s.length()-1;i>=0;i--) {
            char ch = s.charAt(i);
            s2+=ch;
        }
        System.out.println(s2);
    }
}
