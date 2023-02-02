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
public class WordCount {

    public static void main(String[] args) {
        
        String s = "new";
        String s2 = "I'm the new newt,";
        String arr[] = s2.split(" ");
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i].contains(s)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
