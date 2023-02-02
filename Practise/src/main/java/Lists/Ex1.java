/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.ArrayList;

/**
 *
 * @author Ameer
 */
public class Ex1 {
    
    public static void main(String[] args) {
        
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list2.add(0);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(0);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        int j=0;
        System.out.println(list2);
        for(Object l:list1) {
            System.out.println(l);
            ArrayList list3 = new ArrayList();
            for(int i=0;i<=3;i++) {
                System.out.println(list2.get(i));
                list3.add(list2.get(i));
            }
            list2.removeAll(list3);
            for(int i=0;i<=3;i++) {
                list2.remove(i);
            }
            System.out.println(list2);
        }
        System.out.println(list2);
    }
    
}
