/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Ameer
 */
public class Ex1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );
        System.out.println("list");
        LinkedList list = new LinkedList();
        list.add(1);
        list.add("A");
        list.add("B");
        list.add(2);
        list.add(3);
        list.add("C");
        list.forEach((l)->{System.out.println(l);});
    }
}
