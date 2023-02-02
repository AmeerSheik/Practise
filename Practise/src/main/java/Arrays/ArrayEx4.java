/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Ameer
 */
public class ArrayEx4 {

    public static void main(String[] args) {
        
        int arr[]={1,2,3,1,2,1,4,3,2,1,5,4,1,2,6,1,2,4,7,5,6,8,1,5,9};
        ArrayList list = new ArrayList();
        HashSet set =new HashSet();
        for(int i=0;i<arr.length;i++) {
            set.add(arr[i]);
//            for(int j=i+1;j<arr.length;j++) {
//                if(arr[i] == arr[j]) {
//                    list.add(arr[j]);
//                }
//            }
        }
        System.out.println(set);
        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
