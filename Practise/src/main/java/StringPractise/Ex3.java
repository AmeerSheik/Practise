/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringPractise;

/**
 *
 * @author Ameer
 */
public class Ex3 {
    
    public static void main(String[] args) {
        
        String s = "I-love-java-8";
        String s2 = "Java Questions & Answers – Data Type-Date, TimeZone";
        String arr[]=s2.split(" - ",2);
        for(String a:arr) {
            System.out.println(a);
        }
    }
}
