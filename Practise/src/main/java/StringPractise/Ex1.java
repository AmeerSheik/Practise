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
public class Ex1 {
    
    public static void main(String[] args) {
        String s="hello ?world?";
        s=s.replace("?", "\"");
        System.out.println(s);
    }
}
