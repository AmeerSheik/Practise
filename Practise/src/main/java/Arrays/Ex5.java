/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.ArrayList;

/**
 *
 * @author Ameer
 */
public class Ex5 {
    
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        list.add("Q1");
        list.add("Q2");
        list2.add("B");
        list2.add("C");
        
        int arr[][] = {{1,2,3},{4,5,6}};
        String a = "A";
        for(int i=0;i<list.size();i++) {
            if(list2.get(i).equals("A")) {
                System.out.println(list.get(i));
                System.out.println(list2.get(i));
                System.out.println(arr[i][0]);
            }
            if(list2.get(i).equals("B")) {
                System.out.println(list.get(i));
                System.out.println(list2.get(i));
                System.out.println(arr[i][1]);
            }
            if(list2.get(i).equals("C")) {
                System.out.println(list.get(i));
                System.out.println(list2.get(i));
                System.out.println(arr[i][2]);
            }
        }
        String arr3[][];
        for(int i=0;i<list.size();i++){
            String arr2[] = null;
            arr2[0]="A";
            arr2[1]="B";
        }
//        System.out.println(arr3.length);
//        for(int i=0;i<arr3.length;i++) {
//            System.out.println(arr3[i]);
//        }
    }
}
