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
public class Ex2 {

    public static void main(String[] args) {
        String s="Hello World";
        String s1="WORLD";
        if(s.toLowerCase().startsWith("hello"))
            System.out.println(s);
        else
            System.out.println(false);
        String s2=s1.valueOf(3);
        System.out.println(s2);
        System.out.println(s1);
    }
    
}
