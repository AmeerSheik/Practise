/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.util.ArrayList;

/**
 *
 * @author Ameer
 */
public class NumberSplit {
    
    public static void main(String[] args) {
        
        int num = 987654321;
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(num!=0) {
            
            int rem = num % 10;
            list.add(0,rem);
            num = num / 10;
        }
        System.out.println(list);
    }
}
