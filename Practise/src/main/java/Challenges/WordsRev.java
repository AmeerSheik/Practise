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
public class WordsRev {
    
    public static void main(String[] args) {
        
        String s = "public static void main";
        String arr[]=s.split(" ");
        String rev="";
        for(int i=arr.length-1;i>=0;i--) {
            System.out.println(arr[i]);
            rev = rev+" "+arr[i];
        }
        System.out.println(rev);
    }
}
