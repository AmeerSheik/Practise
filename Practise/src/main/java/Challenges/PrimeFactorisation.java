/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.util.LinkedList;

/**
 *
 * @author Ameer
 */
public class PrimeFactorisation {
    
    public static void main(String[] args) {
        
        int num = 7;
        LinkedList list = new LinkedList();
        for(int i=1;i<=num;i++) {
            if(num % i == 0) {
                list.add(i);
            }
            
        }
        System.out.println(list);
        if(list.size()<=2) {
            System.out.println("prime");
        }
        else {
            System.out.println("not a prime");
        }
        
    }
    
}
