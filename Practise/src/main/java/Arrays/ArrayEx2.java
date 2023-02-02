/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 *
 * @author Ameer
 */
public class ArrayEx2 {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        String dates[] = {"01-01-2022","02-01-2022","01-01-2022","04-01-2022"};
        LinkedHashSet set =new LinkedHashSet<Object>();
        for(int i=0;i<dates.length;i++) {
            set.add(dates[i]);
        }
        System.out.println(set);
    }
}
