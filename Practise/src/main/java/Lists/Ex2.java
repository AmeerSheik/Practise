/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author Ameer
 */
public class Ex2 {
    
    public static void main(String[] args) {
        
        ArrayList<ArrayList> list =new ArrayList<ArrayList>(); 
        ArrayList list1 =new ArrayList(); 
        ArrayList list2 =new ArrayList(); 
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list.add(0,list1);
        list.add(1,list2);
        System.out.println(list);
        for(int i=0;i<list.size();i++) {
            for(int j=0;j<list.get(i).size();j++) {
                System.out.println(list.get(i).get(j));
            }
        }
    }
}
