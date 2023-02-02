/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ameer
 */
public class TwoStringCheck {
    
    public static void main(String[] args) {
        
        String s1 = "rattramre";
        String s2 = "tatrmarer";
        int length = s1.length();
        int count = 0;
        String s3="";
        List list = new ArrayList<String>();
        for(int i=0;i<s1.length();i++) {
            for(int j=0;j<s2.length();j++) {
                System.out.println(s1.charAt(i)+":"+s2.charAt(j));
                if(s2.charAt(j)==s1.charAt(i)) {
                    System.out.println(" ");
                    count++;
                    System.out.println(count);
                    s3 = s2.substring(j, j+1);
                    s2=s2.replaceFirst(s3, "*");
                    System.out.println(s2);
                    System.out.println(" ");
                    
                    break;
                }
            }    
        }
        if(length == count) {
            System.out.println("same");
        }
        else
            System.out.println("not same");
        System.out.println(s2);
    }
    
}
