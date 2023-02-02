/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practise;

/**
 *
 * @author Ameer
 */
public class Ex3 {
    
    public static void main(String[] args) {
        int j=0;
        Ex3 e = new Ex3();
        int a[] = {1,2,3,4,5,61,7,8,9,10};
        for(int i =0;i<a.length;) {
            if(a[i]==5) {
               i= e.call(i,a);
                System.out.println(i+" a");
            }
            System.out.println(a[i]);
            i++;
        }
    }
    public int call(int i,int arr[]) {
        int j=0;
        for(j = i;j<arr.length;j++) {
            System.out.println("J:"+j);
            if(arr[j]==7) {
                System.out.println(arr[j]);
                return ++j;
            }
        }
        return j;
    }
}
