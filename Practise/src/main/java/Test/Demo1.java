
// reading text file using filereader.

package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        try
        {
            FileReader fr=new FileReader("D:\\Demo1.txt"); 
            int i;
            while((i=fr.read())!=-1)
            {
                System.out.print((char)i);
            }
            fr.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
