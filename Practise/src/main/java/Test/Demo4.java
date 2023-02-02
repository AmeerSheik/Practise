/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Ameer
 */
public class Demo4 
{
    public static void main(String[] args) throws Exception
    {
        FileReader f=new FileReader("D:\\GF2047 -- U Swathi__Dr DMR patient.doc");
        BufferedReader br =new BufferedReader(f);
        String st;
        Scanner s=new Scanner(f);
        int i;
        while((st=br.readLine())!= null)
            System.out.print(st);
    }
}
