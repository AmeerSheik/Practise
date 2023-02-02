
//reading text file using SCANNER

package Test;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Ameer
 */
public class Demo3 
{
    public static void main(String[] args) 
    {
        try
        {
            File f=new File("D:\\GF2047 -- U Swathi__Dr DMR patient.doc");
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
