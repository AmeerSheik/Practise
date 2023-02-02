/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.LinkedList;

/**
 *
 * @author Ameer
 */
public class ArrayEx1 {
    public static void main(String[] args) {
        
        String a[] = {"14-10-2022","15-10-2022","14-10-2022","16-10-2022"};
        int b[][] = {{1,2},{3,4,5}};
        LinkedList list = new LinkedList();
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {
                if(a[i]==a[j]) {
                    
                }
            }
        }
        System.out.println(list);
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
            for(int j=0;j<b.length;j++) {
                for(int k=0;k<b[j].length;k++) {
                    System.out.print(b[j][k]);
                     if(b[j].length-1==k) {
                     //   System.out.print(",");
                    }
                    else {
                        System.out.print(",");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
 