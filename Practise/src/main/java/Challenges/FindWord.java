/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Ameer
 */
public class FindWord {
    
    public static void main(String[] args) {
        
        String s = "For this reason, future Maven versions might no longer support building such malformed projects.";
        FindWord word = new FindWord();
        word.checking(s);
    }
    public String checking(String s) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[]=s.split(" ");
        System.out.println(arr[n-1]);
        return arr[n-1];
    }
}
